package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.edit1);
        e2 = findViewById(R.id.edit2);
        t1 = findViewById(R.id.test1);
    }

    public void doadd(View view) {
        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());
        int sum = n1 + n2;
        t1.setText(String.valueOf(sum));
    }

    public void domul(View view) {
        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());
        int sum = n1 * n2;
        t1.setText(String.valueOf(sum));
    }

    public void dosub(View view) {
        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());
        int sum = n1 - n2;
        t1.setText(String.valueOf(sum));
    }

    public void dodiv(View view) {
        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());
        int sum = n2/n1;
        t1.setText(String.valueOf(sum));
    }
}