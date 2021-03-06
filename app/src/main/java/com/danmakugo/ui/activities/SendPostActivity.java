package com.danmakugo.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;


import com.danmakugo.MainActivity;
import com.danmakugo.R;
import com.danmakugo.base.BaseAppCompatActivity;
import com.danmakugo.ui.button.BBSFragment;

public class SendPostActivity extends BaseAppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_send_post,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.send_post){
            //发帖事件绑定
            Toast.makeText(SendPostActivity.this,"send",Toast.LENGTH_SHORT).show();

//            Intent intent=new Intent(SendPostActivity.this, BBSFragment.class);

            MainActivity.bbsActionStart(SendPostActivity.this);


        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_post);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        //去掉  toolBar 的lable
        getSupportActionBar().setDisplayShowTitleEnabled(false);




    }
}
