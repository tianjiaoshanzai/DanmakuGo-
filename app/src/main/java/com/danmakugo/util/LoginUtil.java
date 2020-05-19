package com.danmakugo.util;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.danmakugo.ui.activities.LoginActivity;

import java.util.prefs.Preferences;



public class LoginUtil {

    public static final String USER_INFO="user_info";
    public static final String TOKEN="token";
    public static final String NULL_STRING="";


    public static final String HEAD_URL_STRING="heda_url";
    public static final String USERNAME_STRING="user_name";






    public static String getUserInfo(Context context,String msg){
        SharedPreferences preferences= context.getSharedPreferences(USER_INFO,Context.MODE_PRIVATE);

        String info_msg=preferences.getString(msg,NULL_STRING);
        return info_msg;

    }

    public static void userInfoUpdate(Context context,String type,String msg){
        SharedPreferences preferences= context.getSharedPreferences(USER_INFO,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
//        String token="cscsdvsdvvsvsd";
//        String userNmae="袁啸山";
//        String headaurl="http://img1.imgtn.bdimg.com/it/u=1305353222,2352820043&fm=26&gp=0.jpg";
//                editor.putString(TOKEN,token);
        editor.putString(type,msg);

        editor.apply();

    }

    public static void logOut(Context context){
        SharedPreferences preferences= context.getSharedPreferences(USER_INFO,Context.MODE_PRIVATE);

        SharedPreferences.Editor editor=preferences.edit();
        editor.putString(TOKEN,NULL_STRING);
        editor.putString(USERNAME_STRING,NULL_STRING);
        editor.putString(HEAD_URL_STRING,NULL_STRING);

        editor.apply();
        Toast.makeText(context,"您已经成功注销",Toast.LENGTH_SHORT).show();


    }

    public static void login(Context context){
        Toast.makeText(context,"您需要登陆才能继续操作",Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(context, LoginActivity.class);
        context.startActivity(intent);


    }



    public static boolean isLogin(Context context){
        SharedPreferences preferences= context.getSharedPreferences(USER_INFO,Context.MODE_PRIVATE);
        if(preferences==null){
            return false;
        }else {
            String token=preferences.getString(TOKEN,NULL_STRING);

            if(token.equals(NULL_STRING)){
                return false;
            }else {
                //todo 网路处理token  有效返回true  无效置空  "" 本地token并返回false
                //暂时由于敏感操作都涉及网络请求，直接由后端控制权限

                return true;
            }
        }

    }
}
