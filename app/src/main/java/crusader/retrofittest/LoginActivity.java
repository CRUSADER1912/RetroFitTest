package crusader.retrofittest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 3/13/2016.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edtUsername;
    EditText edtPwd;
    Button btnLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponent();
    }

    private void initComponent() {
        edtUsername = (EditText) findViewById(R.id.edt_username);
        edtPwd = (EditText) findViewById(R.id.edt_pwd);
        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                String userNameValue = edtUsername.getText().toString();
                String pwdValue = edtPwd.getText().toString();
                if(TextUtils.isEmpty(userNameValue)){
                    edtUsername.setError("Enter valid username");
                }else if(TextUtils.isEmpty(pwdValue)){
                    edtPwd.setError("Enter valid password");
                }else{
                    if(userNameValue.equals("CRUSADER") && pwdValue.equals("pinto")){
                        Intent myIntent = new Intent(LoginActivity.this, MainActivity.class);
                        myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(myIntent);
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    }
                }
                break;
        }
    }
}
