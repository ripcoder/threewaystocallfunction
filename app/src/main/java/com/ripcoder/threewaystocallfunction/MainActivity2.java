package com.ripcoder.threewaystocallfunction;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends Activity  implements View.OnClickListener {


   // implements calls ands interface not a class. You can extend only one class but implement anynumber of interfaces
   // //An interface is like an empty class tht just set the rules on what methods need tmethod.o be included.


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         Button button = (Button)findViewById(R.id.button2);
         button.setOnClickListener(this);
    }






 public void onClick(View v){
     Context context = v.getContext();
     Toast.makeText(context, "Second Way." , Toast.LENGTH_LONG).show();


 }







}
