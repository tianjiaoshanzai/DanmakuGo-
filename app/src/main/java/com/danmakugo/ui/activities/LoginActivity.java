package com.danmakugo.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.danmakugo.MainActivity;
import com.danmakugo.R;
import com.danmakugo.base.BaseActivity;
import com.danmakugo.util.LoginUtil;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText userName=(EditText) findViewById(R.id.username);
        EditText password=(EditText) findViewById(R.id.password);
        TextView forgetPassword=(TextView)findViewById(R.id.forget_password);

        Button loginButton=(Button)findViewById(R.id.login_button);
        Button registerButton=(Button)findViewById(R.id.register_button);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringUserNmae= userName.getText().toString();
                String stringPassword= password.getText().toString();

                //todo  登陆逻辑处理  用户头像，用户名，token都存到本地

                //登录名密码·等格式检查


//                LoginUtil.login(LoginActivity.this);
                if(stringUserNmae.equals("yxs")&&stringPassword.equals("997518")){
                    String token="yxs";
                    LoginUtil.userInfoUpdate(LoginActivity.this,LoginUtil.TOKEN,"token");

                    Toast.makeText(LoginActivity.this,"登陆成功",Toast.LENGTH_SHORT);

                    Intent intent=new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                }

            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this, ForgetPwActivity.class);
                startActivity(intent);
            }
        });

    }
}
