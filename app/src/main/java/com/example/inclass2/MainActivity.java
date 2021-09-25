package com.example.inclass2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button abc;
    EditText price;
    RadioGroup radioGroup;
    TextView textView3;
    TextView clear;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abc = findViewById(R.id.calculate);
        price = findViewById(R.id.ticketPrice);
        radioGroup = findViewById(R.id.radioGroup);
        textView3 = findViewById(R.id.textView3);
        clear = findViewById(R.id.clear);
        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(price.getText().toString().length() == 0 ) {
                    Toast.makeText(MainActivity.this, "the number should be a valid positive number.", Toast.LENGTH_SHORT).show();
                }
                else if(price.getText().toString().length() > 0)
                {
                    a = Integer.parseInt(price.getText().toString());
                    if(a<=0)
                    {
                        Toast.makeText(MainActivity.this, "the number should be a valid positive number.", Toast.LENGTH_SHORT).show();
                    }
                }

                int CheckedID = radioGroup.getCheckedRadioButtonId();
                if(CheckedID==R.id.option1){
                    double x = a - a*0.05;
                    textView3.setText("Discounted price: "+x);
                    //Toast.makeText(MainActivity.this, "5 % selected"+x, Toast.LENGTH_SHORT).show();
                }
                else if(CheckedID == R.id.option2){
                    double x = a - a*0.1;
                    textView3.setText("Discounted price: "+x);
                    //Toast.makeText(MainActivity.this, "10 % selected"+x, Toast.LENGTH_SHORT).show();
                }
                else if(CheckedID == R.id.option3){
                    double x = a - a*0.15;
                    textView3.setText("Discounted price: "+x);
                    //Toast.makeText(MainActivity.this, "15 % selected"+x, Toast.LENGTH_SHORT).show();
                }
                else if(CheckedID == R.id.option4){
                    double x = a - a*0.2;
                    textView3.setText("Discounted price: "+x);
                    //Toast.makeText(MainActivity.this, "20 % selected"+x, Toast.LENGTH_SHORT).show();
                }
                else if(CheckedID == R.id.option5){
                    double x = a - a*0.5;
                    textView3.setText("Discounted price: "+x);
                    //Toast.makeText(MainActivity.this, "50 % selected"+x, Toast.LENGTH_SHORT).show();
                }
                

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                price.setText("");
                //Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                radioGroup.clearCheck();

            }
        });
    }
}