package com.example.myapplication;

import static android.widget.Toast.LENGTH_SHORT;

import android.app.AppComponentFactory;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppComponentFactory {
    boolean flag = true;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        onCreate(R.layout.activity_main);
    }

    TextView textView = findViewById(R.id.textView1);
    textView.s(new view.OnClickListener() {
        public void onClick(View v) {
            Toast.makeText(getBaseContext(),"눌렀네요", LENGTH_SHORT).show();

            if (flag) {
                textView.setTextColor(ContextCompat.getColor(getBaseContext(), R.color.red));
                Toast.makeText(getBaseContext(), "눌렀네요", LENGTH_SHORT).show();
            } else {
                textView.setTextColor(ContextCompat.getColor(getBaseContext(), R.color.black));
                Snackbar.make(v, "눌렀네요", BaseTransientBottomBar.LENGTH_SHORT).show();
            }
            flag = !flag;
        }
    }
    
}
