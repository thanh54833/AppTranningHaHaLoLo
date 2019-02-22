package com.example.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Display {

    public static void Toast(Context context,String message) {
        if(message!=null) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }
    public static void Log(String message){
        if(message!=null){
            Log.i("Utils",message);
        }
    }

}
