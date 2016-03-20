package crusader.retrofittest.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import crusader.retrofittest.R;
import crusader.retrofittest.db.DBHelper;
import crusader.retrofittest.db.models.UserRegistration;

public class SignUpActivity extends BaseActivity implements View.OnClickListener{

    TextView tvLinkLogin;
    AppCompatButton btnSignup;
    EditText edtInputName;
    EditText edtInputAddress;
    EditText edtInputPassword;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dbHelper = new DBHelper(this);
    }

    @Override
    public void initSetContentView() {
        setContentView(R.layout.activity_sign_up);
    }

    @Override
    public void initComponents() {
        tvLinkLogin = (TextView) findViewById(R.id.link_login);
        btnSignup = (AppCompatButton) findViewById(R.id.btn_signup);
        edtInputName = (EditText) findViewById(R.id.input_name);
        edtInputAddress = (EditText) findViewById(R.id.input_address);
        edtInputPassword = (EditText) findViewById(R.id.input_password);
    }

    @Override
    public void initListeners() {
        tvLinkLogin.setOnClickListener(this);
        btnSignup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.link_login:
                showLoginActivity();
                finish();
                break;
            case R.id.btn_signup:
                if(validate()){
                    UserRegistration userRegistration = new UserRegistration(edtInputName.getText().toString(),edtInputAddress.getText().toString(),edtInputPassword.getText().toString());
                    boolean check = userRegistration.insertInDb(dbHelper.getDb(),userRegistration);
                    if(check){
                        Toast.makeText(SignUpActivity.this, "Record added successfully",Toast.LENGTH_SHORT).show();
                        showLoginActivity();
                        finish();
                    }
                }
                break;
        }
    }

    private void showLoginActivity() {
        Intent loginActivityIntent = new Intent(SignUpActivity.this,LoginActivity.class);
        loginActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(loginActivityIntent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public boolean validate() {
        boolean valid = true;

        String name = edtInputName.getText().toString();
        String address = edtInputAddress.getText().toString();
        String password = edtInputPassword.getText().toString();

        if (TextUtils.isEmpty(name) || name.length() < 3) {
            edtInputName.setError("at least 3 characters");
            valid = false;
        } else {
            edtInputName.setError(null);
        }

        if (address.isEmpty()) {
            edtInputAddress.setError("enter a valid address");
            valid = false;
        } else {
            edtInputAddress.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            edtInputPassword.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            edtInputPassword.setError(null);
        }

        return valid;
    }

}
