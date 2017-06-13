package com.example.afrasali.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        double a,b,sum;
    EditText e1,e2;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void AddClick(View v){

         e1=(EditText)findViewById(R.id.one);
         e2=(EditText)findViewById(R.id.two);
         t1=(TextView)findViewById(R.id.Ans);

       a=Double.parseDouble(e1.getText().toString());
        b=Double.parseDouble(e2.getText().toString());
        sum=a+b;
        t1.setText(Double.toString(sum));

    }


    public void Sublick(View v){

        e1=(EditText)findViewById(R.id.one);
        e2=(EditText)findViewById(R.id.two);
        t1=(TextView)findViewById(R.id.Ans);

        a=Double.parseDouble(e1.getText().toString());
        b=Double.parseDouble(e2.getText().toString());
        sum=a-b;
        t1.setText(Double.toString(sum));

    }

    public void MultiClick(View v) {

        e1 = (EditText) findViewById(R.id.one);
        e2 = (EditText) findViewById(R.id.two);
        t1 = (TextView) findViewById(R.id.Ans);

        a = Double.parseDouble(e1.getText().toString());
        b = Double.parseDouble(e2.getText().toString());
        sum = a * b;
        t1.setText(Double.toString(sum));

    }


    public void DivideClick(View v) {

        e1 = (EditText) findViewById(R.id.one);
        e2 = (EditText) findViewById(R.id.two);
        t1 = (TextView) findViewById(R.id.Ans);

        a = Double.parseDouble(e1.getText().toString());
        b = Double.parseDouble(e2.getText().toString());
        try {
            sum = a / b;
            t1.setText(Double.toString(sum));

        } catch (Exception e) {
            Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
        }
    }



}
