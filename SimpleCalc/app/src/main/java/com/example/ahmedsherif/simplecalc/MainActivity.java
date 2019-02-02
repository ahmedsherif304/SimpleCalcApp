package com.example.ahmedsherif.simplecalc;

import android.annotation.SuppressLint;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    float x=0,y=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void display(float f){
        String s=String.valueOf(f);
        TextView t=findViewById(R.id.t3);
        t.setText(s);
    }
    public boolean setx(View v){
        EditText t=findViewById(R.id.e1);
        if (t.getText().toString().equals(""))
            {
                t.setHint("Please Enter a Number");
                Toast.makeText(getApplicationContext(),"Ouch!",Toast.LENGTH_SHORT).show();
                return false;
            }
        t.setHint("First Number");
        x=Float.valueOf(t.getText().toString());
        return true;
    }

    @SuppressLint("ShowToast")
    public boolean sety(View v){
        EditText t=findViewById(R.id.e2);
        if (t.getText().toString().equals("")) {
            t.setHint("Please Enter a Number");
            Toast.makeText(getApplicationContext(),"Ouch!",Toast.LENGTH_SHORT).show();
            return false;
        }
        t.setHint("Second Number");
        y=Float.valueOf(t.getText().toString());
        return true;
    }
    public void sum(View v){
        if(setx(v)&&sety(v)) {
            float z = x + y;
            display(z);
        }
    }
    public void multi(View v){
        if(setx(v)&&sety(v)) {
            float z = x * y;
            display(z);
        }
    }
    public void sub(View v){
        if(setx(v)&&sety(v)) {
            float z = x - y;
            display(z);
        }
    }
    public void div(View v){
        if(setx(v)&&sety(v)) {
            float z = x / y;
            display(z);
        }
    }
    public void reset(View v){
        display(0);
        EditText t=findViewById(R.id.e1);
        t.setText("");
        EditText t2=findViewById(R.id.e2);
        t2.setText("");
        x=y=0;
    }
}
