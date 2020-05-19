package com.danmakugo.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.danmakugo.R;
import com.danmakugo.base.BaseActivity;
import com.danmakugo.util.AuthFormatUtil;

public class RegisterActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText userName=(EditText) findViewById(R.id.reg_username);
        EditText password=(EditText) findViewById(R.id.reg_password);
        EditText nickNmae=(EditText) findViewById(R.id.nike_name);


        Button registerButton=(Button)findViewById(R.id.register_up_button);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stringUserName=userName.getText().toString();
                String stringPassword=password.getText().toString();
                String stringNickNmae=nickNmae.getText().toString();


                if(AuthFormatUtil.checkUserName(RegisterActivity.this,stringUserName)
                        &&AuthFormatUtil.checkPassword(RegisterActivity.this,stringPassword)
                ){
                    //TODO  提交注册信息   处理注册逻辑  比如注册失败之类的


                    Toast.makeText(RegisterActivity.this,"注册成功",Toast.LENGTH_SHORT);
                    Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                    startActivity(intent);

                }

            }
        });
    }
}
