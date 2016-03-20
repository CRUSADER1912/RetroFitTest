package crusader.retrofittest.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initSetContentView();
        initComponents();
        initListeners();
    }

    public abstract void initSetContentView();

    public abstract void initComponents();

    public abstract void initListeners();


}
