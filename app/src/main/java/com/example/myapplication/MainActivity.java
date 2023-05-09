package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button check, swap;
    EditText set1,set2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check = (Button) findViewById(R.id.check);
        swap = (Button) findViewById(R.id.swap);
        set1 = (EditText) findViewById(R.id.input1);
        set2 = (EditText) findViewById(R.id.input2);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), midClass.class);
                String fir = set1.getText().toString();
                String sec = set2.getText().toString();

                if(fir.equalsIgnoreCase(sec)){
                    i.putExtra("same", "The Same");
                    startActivity(i);
                } else {
                    i.putExtra("same", "Not The Same");
                    startActivity(i);
                }
            }
        });
    }

    public void onSwap(View view){
        set1 = (EditText) findViewById(R.id.input1);
        set2 = (EditText) findViewById(R.id.input2);
        String f1  = String.valueOf(set1.getText());
        String f2  = String.valueOf(set2.getText());
        set1.setText(f2);
        set2.setText(f1);
    }
}