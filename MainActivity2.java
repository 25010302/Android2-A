package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends AppCompatActivity {

    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle(R.string.app2);

        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(100);
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);

        TextView textView = findViewById(R.id.textView1);
        textView.setSelected(true);
        textView.startAnimation(anim);

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setTextColor(ContextCompat.getColor(getBaseContext(), R.color.red));
        textView2.startAnimation(anim);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag) {
                    button.setBackgroundColor(ContextCompat.getColor(getBaseContext(), R.color.blue));
                    Toast.makeText(getBaseContext(),"Button Clicked",Toast.LENGTH_SHORT).show();
               } else {
                    button.setBackgroundColor(ContextCompat.getColor(getBaseContext(), R.color.gray));
                    Snackbar.make(v,"Button Clicked", BaseTransientBottomBar.LENGTH_SHORT).show();
                }
                flag = !flag;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getBaseContext(), "버튼이 눌렸습니다", Toast.LENGTH_LONG).show();
                    }
            });
        }
    public void textViewClicked(View view) {
        Toast.makeText(getBaseContext(),"TextView가 눌렀습니다", Toast.LENGTH_SHORT).show();
    }
});