package com.example.konstantin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b11, b12, b13, b14, b15, b16;
    TextView t1;
    double arg1, arg2, rezult;
    int mod_op = 0;
    String scr1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
      //прослушивание нажатие кнопок
    public void onButtonClick(View v) {
        t1 = (TextView) findViewById(R.id.res);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 == "") {
                    scr1 = "1";
                } else {
                    scr1 = scr1 + "1";
                }
                t1.setText(scr1);
            }
        });
        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 == "") {
                    scr1 = "2";
                } else {
                    scr1 = scr1 + "2";
                }
                t1.setText(scr1);
            }
        });
        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 == "") {
                    scr1 = "3";
                } else {
                    scr1 = scr1 + "3";
                }
                t1.setText(scr1);
            }
        });
        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 == "") {
                    scr1 = "4";
                } else {
                    scr1 = scr1 + "4";
                }
                t1.setText(scr1);
            }
        });
        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 == "") {
                    scr1 = "5";
                } else {
                    scr1 = scr1 + "5";
                }
                t1.setText(scr1);
            }
        });
        b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 == "") {
                    scr1 = "6";
                } else {
                    scr1 = scr1 + "6";
                }
                t1.setText(scr1);
            }
        });
        b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 == "") {
                    scr1 = "7";
                } else {
                    scr1 = scr1 + "7";
                }
                t1.setText(scr1);
            }
        });
        b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 == "") {
                    scr1 = "8";
                } else {
                    scr1 = scr1 + "8";
                }
                t1.setText(scr1);
            }
        });
        b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 == "") {
                    scr1 = "9";
                } else {
                    scr1 = scr1 + "9";
                }
                t1.setText(scr1);
            }
        });
        b0 = (Button) findViewById(R.id.button0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 == "") {
                    scr1 = "0";
                } else {
                    scr1 = scr1 + "0";
                }
                t1.setText(scr1);
            }
        });
        // обработка вычислений
        b11 = (Button) findViewById(R.id.buttonС);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scr1 = "";
                mod_op = 0;
                t1.setText("0");
            }
        });
        b12 = (Button) findViewById(R.id.button_del);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 != "") {
                    arg1 = Double.parseDouble(scr1);
                }
                scr1 = "";
                mod_op = 4;
                t1.setText("0");
            }
        });
        b13 = (Button) findViewById(R.id.button_um);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 != "") {
                    arg1 = Double.parseDouble(scr1);
                }
                scr1 = "";
                mod_op = 3;
                t1.setText("0");
            }
        });
        b14 = (Button) findViewById(R.id.button_plus);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 != "") {
                    arg1 = Double.parseDouble(scr1);
                }
                scr1 = "";
                mod_op = 1;
                t1.setText("0");
            }
        });
        b15 = (Button) findViewById(R.id.button_min);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 != "") {
                    arg1 = Double.parseDouble(scr1);
                }
                scr1 = "";
                mod_op = 2;
                t1.setText("0");
            }
        });
        b16 = (Button) findViewById(R.id.button_ravno);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scr1 !=""){
                    arg2 = Double.parseDouble(scr1);
                }
                else {
                    arg2 = arg1;
                }

                if (mod_op == 1){
                    rezult = arg1 + arg2; }
                if (mod_op == 2){
                    rezult = arg1 - arg2;
                }
                if (mod_op == 3){
                    rezult = arg1 * arg2;
                }
                if (mod_op == 4){
                    rezult = arg1 / arg2;
                }
                scr1 = ""+ rezult;
                t1.setText(scr1);
            }
        });
    }
}
