package com.example.finalcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button   butt1,btnpercent,button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonplus,
    buttonminus,buttonmultiply,buttondivision,buttonclear,buttondot,buttonequal;


    EditText editText;
    float mValueOne,mValueTwo;

    boolean calAddition,calSubtract,calDivision,calMultiply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edittext);


        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        buttondot = (Button) findViewById(R.id.btnDot);
        buttonplus = (Button) findViewById(R.id.btnPlus);
        buttonmultiply = (Button) findViewById(R.id.btnMultiply);
        buttonminus = (Button) findViewById(R.id.btnMinus);
        buttondivision = (Button) findViewById(R.id.btnDivision);
        buttonequal = (Button) findViewById(R.id.btnEqual);
        buttonclear = (Button) findViewById(R.id.btnClear) ;
        btnpercent = (Button) findViewById(R.id.btnPercent);
        butt1 = (Button) findViewById(R.id.but1);


        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = 0;
                mValueTwo = 0;
                calSubtract=false;
                calMultiply=false;
                calDivision=false;
                calAddition=false;
                editText.setText(null);
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               editText.setText(editText.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               editText.setText(editText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               editText.setText(editText.getText() +"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               editText.setText(editText.getText() +"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               editText.setText(editText.getText() +"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText.setText(editText.getText() +"6");
            }
        });

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() +"Hey");
            }
        });

        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() +"Ramya");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               editText.setText(editText.getText() +"9");
            }
        });

        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                calAddition = true;
                editText.setText(null);
            }
        });

        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                calSubtract = true;
                editText.setText(null);
            }
        });

        buttondivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                calDivision = true;
                editText.setText(null);
            }
        });


        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                calMultiply = true;
                editText.setText(null);
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               editText.setText(editText.getText() + ".");
            }
        });

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueTwo = Float.parseFloat(editText.getText() + "");

                if (calAddition == true) {
                    editText.setText(String.valueOf(mValueOne + "+" + mValueTwo + " = "  +(mValueOne + mValueTwo)));
                    calAddition=false;
                }
                else if (calDivision == true) {
                    editText.setText(String.valueOf(mValueOne/mValueTwo));
                    calDivision=false;
                }
                else if (calMultiply == true) {
                    editText.setText(String.valueOf(mValueOne*mValueTwo));
                    calMultiply=false;
                }
                else if (calSubtract == true) {
                    editText.setText(String.valueOf(mValueOne-mValueTwo));
                    calSubtract=false;
                }
               // process = input.getText().toString();

              //  process = process.replaceAll("×","*");
                //process = process.replaceAll("%","/100");
                //process = process.replaceAll("÷","/");

                //String finalResult = "";

                //output.setText(finalResult);

















    }
});
    }}