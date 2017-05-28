package com.mtit.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText Screen;
    String string1,string2,result,sign;
    private double valueOne = Double.NaN,value;
    private double valueTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Screen = (EditText)findViewById(R.id.Screen);
        string1="";
        string2="";



    }

    public void onClick(View v){
        Button button =(Button)v;
        string1+=button.getText().toString();
        value=Double.parseDouble(string1);
        Screen.setText(Double.toString(value));

    }

    public void onClickSign(View v){
        //saliya
    }

    public void Calculate(View v){
        //ravindu
        
    }

    public void Clear(View v){
        string1="";
        string2="";
        sign="";
        result="";
        value=0.0;
        valueOne=0.0;
        valueTwo=0.0;
        Screen.setText("");
    }



}
