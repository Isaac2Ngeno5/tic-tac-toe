package com.example.darkoscript.mygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FiveByFiveActivity extends AppCompatActivity {
    Button button_00;
    Button button_01;
    Button button_02;
    Button button_03;
    Button button_04;
    Button button_05;
    Button button_06;
    Button button_07;
    Button button_08;
    Button button_09;
    Button button_10;
    Button button_11;
    Button button_12;
    Button button_13;
    Button button_14;
    Button button_15;
    Button button_16;
    Button button_17;
    Button button_18;
    Button button_19;
    Button button_20;
    Button button_21;
    Button button_22;
    Button button_23;
    Button button_24;
    Button button_menu;
    Button button_reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five_by_five);

        button_menu = findViewById(R.id.button_menu);
        button_reset = findViewById(R.id.button_reset);
        button_00 = findViewById(R.id.button_00);
        button_01 = findViewById(R.id.button_01);
        button_02 = findViewById(R.id.button_02);
        button_03 = findViewById(R.id.button_03);
        button_04 = findViewById(R.id.button_04);
        button_05 = findViewById(R.id.button_05);
        button_06 = findViewById(R.id.button_06);
        button_07 = findViewById(R.id.button_07);
        button_08 = findViewById(R.id.button_08);
        button_09 = findViewById(R.id.button_09);
        button_10 = findViewById(R.id.button_10);
        button_11 = findViewById(R.id.button_11);
        button_12 = findViewById(R.id.button_12);
        button_13 = findViewById(R.id.button_13);
        button_14 = findViewById(R.id.button_14);
        button_15 = findViewById(R.id.button_15);
        button_16 = findViewById(R.id.button_16);
        button_17 = findViewById(R.id.button_17);
        button_18 = findViewById(R.id.button_18);
        button_19 = findViewById(R.id.button_19);
        button_20 = findViewById(R.id.button_20);
        button_21 = findViewById(R.id.button_21);
        button_22 = findViewById(R.id.button_22);
        button_23 = findViewById(R.id.button_23);
        button_24 = findViewById(R.id.button_24);

        final Intent intent2 = getIntent();

        final String choice = intent2.getStringExtra("choice");

        Toast.makeText(FiveByFiveActivity.this, String.valueOf(choice), Toast.LENGTH_LONG).show();

        button_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_menu = new Intent(FiveByFiveActivity.this, MenuActivity.class);
                startActivity(intent_menu);

            }
        });

        button_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_00.setText("x");
                }else if(choice.equals("o")){
                    button_00.setText("o");
                }
            }
        });

        button_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_01.setText("x");
                }else if(choice.equals("o")){
                    button_01.setText("o");
                }
            }
        });


        button_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_02.setText("x");
                }else if(choice.equals("o")){
                    button_02.setText("o");
                }
            }
        });


        button_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_03.setText("x");
                }else if(choice.equals("o")){
                    button_03.setText("o");
                }
            }
        });


        button_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_04.setText("x");
                }else if(choice.equals("o")){
                    button_04.setText("o");
                }
            }
        });


        button_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_05.setText("x");
                }else if(choice.equals("o")){
                    button_05.setText("o");
                }
            }
        });


        button_06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_06.setText("x");
                }else if(choice.equals("o")){
                    button_06.setText("o");
                }
            }
        });


        button_07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_07.setText("x");
                }else if(choice.equals("o")){
                    button_07.setText("o");
                }
            }
        });


        button_08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_08.setText("x");
                }else if(choice.equals("o")){
                    button_08.setText("o");
                }
            }
        });


        button_09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_09.setText("x");
                }else if(choice.equals("o")){
                    button_09.setText("o");
                }
            }
        });


        button_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_10.setText("x");
                }else if(choice.equals("o")){
                    button_10.setText("o");
                }
            }
        });


        button_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_11.setText("x");
                }else if(choice.equals("o")){
                    button_11.setText("o");
                }
            }
        });


        button_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_12.setText("x");
                }else if(choice.equals("o")){
                    button_12.setText("o");
                }
            }
        });


        button_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_13.setText("x");
                }else if(choice.equals("o")){
                    button_13.setText("o");
                }
            }
        });


        button_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_14.setText("x");
                }else if(choice.equals("o")){
                    button_14.setText("o");
                }
            }
        });


        button_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_15.setText("x");
                }else if(choice.equals("o")){
                    button_15.setText("o");
                }
            }
        });


        button_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_16.setText("x");
                }else if(choice.equals("o")){
                    button_16.setText("o");
                }
            }
        });



        button_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_17.setText("x");
                }else if(choice.equals("o")){
                    button_17.setText("o");
                }
            }
        });



        button_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_18.setText("x");
                }else if(choice.equals("o")){
                    button_18.setText("o");
                }
            }
        });


        button_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_19.setText("x");
                }else if(choice.equals("o")){
                    button_19.setText("o");
                }
            }
        });

        button_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_20.setText("x");
                }else if(choice.equals("o")){
                    button_20.setText("o");
                }
            }
        });

        button_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_21.setText("x");
                }else if(choice.equals("o")){
                    button_21.setText("o");
                }
            }
        });

        button_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_22.setText("x");
                }else if(choice.equals("o")){
                    button_22.setText("o");
                }
            }
        });


        button_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_23.setText("x");
                }else if(choice.equals("o")){
                    button_23.setText("o");
                }
            }
        });


        button_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice.equals("x")){
                    button_24.setText("x");
                }else if(choice.equals("o")){
                    button_24.setText("o");
                }
            }
        });
    }
}
