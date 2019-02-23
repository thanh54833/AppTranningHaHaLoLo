package com.example.utils;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
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

    /*public static void SnackBar(View view, String message,int colorBackground,int colorText,int sizeText){

        if(message!=null&&view!=null){

            Snackbar snackbar;
            View viewSnackBar;
            TextView textView;

            snackbar=Snackbar.make(view, message, Snackbar.LENGTH_SHORT);
            viewSnackBar=snackbar.getView();
            viewSnackBar.setBackgroundColor(colorBackground);

            textView=viewSnackBar.findViewById(android.support.design.R.id.snackbar_text);
            textView.setTextColor(colorText);
            textView.setTextSize(sizeText);

            snackbar.show();
        }


    }*/

   public class SnackBar{

       private Snackbar snackbar;
       private View viewSnackBar;
       private TextView textView;
       private View idView;


       public SnackBar(View idView) {
        this.idView=idView;
       }

       public void setMessage(String message){
           if(message!=null){
               Snackbar.make(idView, message, Snackbar.LENGTH_SHORT);
           }
       }




   }
}
