package com.example.prject;

import static java.time.ZoneOffset.MAX;
import static java.time.ZoneOffset.MIN;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private int progress = 0;

    private final int MAX = 100;

    private final int MIN = 0;

    TextView textView1, textView2, textView3;

    ProgressBar progressBar1, progressBar2, progressBar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView1 = findViewById(R.id.textview1);
        progressBar1 = findViewById(R.id.progress1);
        textView2 = findViewById(R.id.textview2);
        progressBar2 = findViewById(R.id.progress2);
        textView3 = findViewById(R.id.textview3);
        progressBar3 = findViewById(R.id.progress3);

        textView1.setText(String.format("%d %%",progress));
        progressBar1.setProgress(progress);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress += 10;
                if (progress >= MAX)
                    progress = MIN;


            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress += 10;
                if (progress >= MAX)
                    progress = MIN;
            }
        });

    }
}