package com.ripcoder.threewaystocallfunction;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener ;

import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends Activity  {


    private OnClickListener mButtListener = new OnClickListener() {

        public void onClick(View v) {
            Context context = v.getContext();
            Toast.makeText(context, "third way" , Toast.LENGTH_LONG).show();
        }
    };


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         Button button = (Button)findViewById(R.id.button2);
         button.setOnClickListener(mButtListener);
    }

    //ie OnClickListener needs to have an onClick





 public void onClick(View v){
     Context context = v.getContext();

String myIdNmae =  v.getDisplay().toString() ;
     Toast.makeText(context, "you made me do it."  + myIdNmae, Toast.LENGTH_LONG).show();


 }







}
