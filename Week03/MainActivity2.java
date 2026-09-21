package com.example.weak03;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;
import static android.widget.Toast.LENGTH_LONG;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        LinearLayout layout1 = findViewById(R.id.layout1);
        LinearLayout layout2 = findViewById(R.id.layout2);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout1.setVisibility(VISIBLE);
                layout2.setVisibility(INVISIBLE);
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout1.setVisibility(INVISIBLE);
                layout2.setVisibility(VISIBLE);
            }
        });


        EditText editText1 = findViewById(R.id.editText11);
        EditText textView1 = findViewById(R.id.textView11);
        Button11 button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText1.getText().toString();
                if (name.isEmpty()) {
                    Toast.makeText(getBaseContext(), "이름 입력하세요", LENGTH_LONG).show();
                } else {
                    textView1.setText("환영합니다......" + name + "남자");
                    editText1.setText("");
                }
            }
        });

        EidtText editText2 = findViewById(R.id.editText21);
        TextView textView2 = findViewById(R.id.textView21);
        RadioGroup group = findViewById(R.id.group21);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio1) {
                    imageView.setImageResource(R.drawable.man1);
                    gender = "남자";
                } else {
                    imageView.setImageResource(R.drawable.woman1)
                    gender = "여자";
                }
            }
        });

        button button21 = findViewById(R.id.button21);
        button21.setOnclickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (is.isEmpty())
            }
        }

    });