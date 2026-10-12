package com.example.project;

import static android.widget.Toast.LENGTH_SHORT;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button01 = findViewById(R.id.button1);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog1(v);
            }


        });

        Button button02 = findViewById(R.id.button2);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String temp = year + "년";
                        temp += month + "월";
                        temp += dayOfMonth + "일";

                        Toast.makeText(getBaseContext(), temp, LENGTH_SHORT).show();
                    }
                };

                DatePickerDialog dialog = new DatePickerDialog(MainActivity.this, dateSetListener, year, month, day);
                dialog.create();
                dialog.show();
            }
        });

        Button button03 = findViewById(R.id.button3);
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Calendar calendar = Calendar.getInstance(Locale.KOREAN);
                 int hour = calendar.get(Calendar.HOUR);
                 int minute = calendar.get(Calendar.MINUTE);

                TimePickerDialog.OnTimeSetListener timeSetListener = new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Toast.makeText(getBaseContext(), hourOfDay + " : " + minute, LENGTH_SHORT);
                    }
                };

                TimePickerDialog dialog = new TimePickerDialog(MainActivity.this, timeSetListener, hour, minute, false);
                dialog.create();
                dialog.show();

            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);

                Dialog dialog = new Dialog(MainActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog_birthday);
                Button button41 = dialog.findViewById(R.id.button41);
                button41.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

            }
        });

        Activity dialog;
        Button button42 = dialog.findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), picker.getValue() + "", LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        NumberPicker picker = dialog.findViewById(R.id.numberPicker);
        picker.setMinValue(year - 80);


        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String options = "046793218ACBDFE";
                CharacterPickerDialog dialog = new CharacterPickerDialog(MainActivity.this, new View(MainActivity.this), null, options, false);
                super.clone();
                Toast.makeText(getBaseContext(), "Selected : " + ((Button) v).getText().toString());
                dismiss();
            }
        });

        dialog.create();
        dialog.show();

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("공지");
                progressDialog.setMessage("잠시만 기다려 주세요!\n 프로그램 로딩중입니다.\n 중지 하시겠습니까?");
                ProgressDialog.setButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getBaseContext(), "중지하였습니다", LENGTH_SHORT).show();
                        progressDialog.dismiss();
                    }
                });
                progressDialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                progressDialog.create();
                progressDialog.show();
            }
        });

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog dialog = new ProgressDialog(MainActivity.this);
                dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                dialog.setMessage("Loading...");
                dialog.setMax((200));
                dialog.getWindow().setDimAmount(0);
                dialog.create();
                dialog.show();
                for (int i = 1; i <+ 10; i++)
                    dialog.setProgress(i + 10);
            }
        });

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialog dialog = new CustomDialog(MainActivity.this);
                dialog.setCancelable(false);
                dialog.create();
                dialog.show();

            }
        });

    private void showDialog1(View v) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

            builder.setIcon(R.mipmap.ic_launcher);
            builder.setTitle("일반 Dialog");
            builder.setMessage("앱을 종료하시겠습니다?");
            builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getBaseContext(), "확인 하였습니다.", LENGTH_SHORT).show();
                }
            });

            builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Snackbar.make(v, "취소 하였습니다", BaseTransientBottomBar.LENGTH_SHORT).show();
                }
            });

            builder.setNeutralButton("중립", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getBaseContext(), "중립 하겠습니다.", )
                }
            });
        }
    }
}
