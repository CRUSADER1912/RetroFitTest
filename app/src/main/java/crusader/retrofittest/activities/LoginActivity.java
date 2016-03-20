package crusader.retrofittest.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import crusader.retrofittest.R;
import crusader.retrofittest.db.ColumnValuePair;
import crusader.retrofittest.db.DBHelper;
import crusader.retrofittest.db.models.UserRegistration;

/**
 * Created by user on 3/13/2016.
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {

    EditText edtUsername;
    EditText edtPwd;
    Button btnLogin;
    TextView tvRegister;
    TextView tvForgotPassword;
    DBHelper dbHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dbHelper = new DBHelper(this);
    }

    @Override
    public void initSetContentView() {
        setContentView(R.layout.activity_login);
    }

    @Override
    public void initComponents() {
        edtUsername = (EditText) findViewById(R.id.edt_username);
        edtPwd = (EditText) findViewById(R.id.edt_pwd);
        btnLogin = (Button) findViewById(R.id.btn_login);
        tvRegister = (TextView) findViewById(R.id.tvRegister);
        tvForgotPassword = (TextView) findViewById(R.id.tvForgotPassword);
    }

    @Override
    public void initListeners() {
        btnLogin.setOnClickListener(this);
        tvRegister.setOnClickListener(this);
        tvForgotPassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                String userNameValue = edtUsername.getText().toString();
                String pwdValue = edtPwd.getText().toString();
                if (TextUtils.isEmpty(userNameValue)) {
                    edtUsername.setError("Enter valid username");
                } else if (TextUtils.isEmpty(pwdValue)) {
                    edtPwd.setError("Enter valid password");
                } else {
//                    if(userNameValue.equals("CRUSADER") && pwdValue.equals("pinto")){
//                        Intent myIntent = new Intent(LoginActivity.this, MainActivity.class);
//                        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
//                        startActivity(myIntent);
//                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//                    }
                    UserRegistration userRegistration = new UserRegistration();
                    boolean checkIfValuesExist = userRegistration.numberOfRows(dbHelper.getDb()) > 0;

                    if (checkIfValuesExist) {
                        ArrayList<UserRegistration> userRegistrations = userRegistration.getFilteredData(dbHelper.getDb(), new ColumnValuePair(UserRegistration.REGISTRATION_COLUMN_USERNAME, userNameValue));
                        if (userRegistrations.size() > 0) {
                            //Data exist for given userName
                            if (userRegistrations.get(0).getPassword().equals(pwdValue)) {
                                Toast.makeText(LoginActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                                Intent myIntent = new Intent(LoginActivity.this, MainActivity.class);
                                myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                                startActivity(myIntent);
                                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                            }else{
                                Toast.makeText(LoginActivity.this, "Invalid password", Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            Toast.makeText(LoginActivity.this, "UserName " + userNameValue + " doesnot exists \n" +
                                    "Register first to use the application", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(LoginActivity.this, "No User registration found \nRegister first to use the application", Toast.LENGTH_LONG).show();
                        showSignUpActivity();
                        finish();
                    }
                }
                break;
            case R.id.tvRegister:
                showSignUpActivity();
                finish();
                break;
            case R.id.tvForgotPassword:
                break;
        }
    }

    private void showSignUpActivity() {
        Intent loginActivityIntent = new Intent(LoginActivity.this, SignUpActivity.class);
        loginActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(loginActivityIntent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}
