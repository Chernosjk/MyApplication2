package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class midClass extends Activity {

    TextView txt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent s2 = getIntent();
        txt = (TextView) findViewById(R.id.result);
        String result = s2.getStringExtra("same");
        txt.setText(result);

    }
}
