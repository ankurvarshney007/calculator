package com.example.ankur.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button bn1,bn2,bn3,bn4;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn1 = findViewById(R.id.button);
        bn2 = findViewById(R.id.button3);
        bn3 = findViewById(R.id.button4);
        bn4 = findViewById(R.id.button5);
        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String n1 = ed1.getText().toString();
                String n2 = ed2.getText().toString();

                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);

                Toast.makeText(MainActivity.this, "sum of two no is:" + (a + b), Toast.LENGTH_SHORT).show();


            }
        });


        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = ed1.getText().toString();
                String n2 = ed2.getText().toString();

                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);

                Toast.makeText(MainActivity.this, "subtract of two no is:" + (a - b), Toast.LENGTH_SHORT).show();
            }

        });


        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = ed1.getText().toString();
                String n2 = ed2.getText().toString();

                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);

                Toast.makeText(MainActivity.this, "divide of two no is:" + (a / b), Toast.LENGTH_SHORT).show();
            }
        });

        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = ed1.getText().toString();
                String n2 = ed2.getText().toString();

                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);

                Toast.makeText(MainActivity.this, "product of two no is:" + (a * b), Toast.LENGTH_SHORT).show();
            }
        });


    }
}