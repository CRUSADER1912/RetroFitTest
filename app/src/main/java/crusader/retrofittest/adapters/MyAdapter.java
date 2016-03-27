package crusader.retrofittest.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import crusader.retrofittest.AppConstants;
import crusader.retrofittest.R;
import crusader.retrofittest.activities.ProductDetailActivity;
import crusader.retrofittest.models.retriveByKeyword.SearchResult;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<SearchResult> mDataset;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txt_product_name;
        public TextView txt_product_price;
        public ImageView img_prod_snap;

        public ViewHolder(View v) {
            super(v);
            img_prod_snap = (ImageView) v.findViewById(R.id.img_prod_snap);
            txt_product_name = (TextView) v.findViewById(R.id.product_name);
            txt_product_price = (TextView) v.findViewById(R.id.product_price);
        }
    }


    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(Context context, List<SearchResult> myDataset) {
        this.context = context;
        mDataset = myDataset;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_product_preview, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        if(mDataset != null) {
            holder.txt_product_name.setText(mDataset.get(0).getItem().get(position).getTitle().get(0));
            holder.txt_product_price.setText(mDataset.get(0).getItem().get(position).getSellingStatus().get(0).getCurrentPrice().get(0).getCurrencyId() + " " + mDataset.get(0).getItem().get(position).getSellingStatus().get(0).getCurrentPrice().get(0).getValue());
            if(mDataset.get(0).getItem().get(position).getGalleryURL().size() > 0) {
                Picasso.with(context)
                        .load(mDataset.get(0).getItem().get(position).getGalleryURL().get(0))
                        .into(holder.img_prod_snap);
            }else{
                Picasso.with(context)
                        .load(R.mipmap.ic_launcher)
                        .into(holder.img_prod_snap);
            }
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(context, ProductDetailActivity.class);
                    i.putExtra(AppConstants.ITEMID, mDataset.get(0).getItem().get(position).getItemId().get(0));
                    i.putExtra(AppConstants.ITEMTITLE, mDataset.get(0).getItem().get(position).getTitle().get(0));
//                    ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(this, Pair.create((View) mFabButton, "fab"), Pair.create(appIcon, "appIcon"));
                    context.startActivity(i);
                }
            });
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.get(0).getItem().size();
    }

    public void appendItems(List<SearchResult> items) {
        int count = getItemCount();
        mDataset.get(0).getItem().addAll(items.get(0).getItem());
        notifyItemRangeInserted(count, items.size());
    }

} 