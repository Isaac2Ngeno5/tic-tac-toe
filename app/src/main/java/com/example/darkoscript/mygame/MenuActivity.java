package com.example.darkoscript.mygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    RadioButton button_choice_x;
    RadioButton button_choice_o;
    RadioButton button_difficulty_level_easy;
    RadioButton button_difficulty_level_hard;
    RadioGroup radio_group_1;
    RadioGroup radio_group_2;
    Button button_start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_xml);

        button_choice_o = findViewById(R.id.button_choice_o);
        button_choice_x = findViewById(R.id.button_choice_x);
        button_difficulty_level_easy = findViewById(R.id.button_difficult_level_easy);
        button_difficulty_level_hard = findViewById(R.id.button_difficult_level_hard);
        radio_group_1 = findViewById(R.id.radio_group_1);
        radio_group_2 = findViewById(R.id.radio_group_2);
        button_start = findViewById(R.id.button_start);

        final Intent intent = getIntent();

        boolean isSinglePlayer = intent.getBooleanExtra("isSinglePlayer", false);

        Toast.makeText(MenuActivity.this, String.valueOf(isSinglePlayer), Toast.LENGTH_LONG).show();



        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MenuActivity.this, ThreeByThreeActivity.class);
                Intent intent2 = new Intent(MenuActivity.this, FiveByFiveActivity.class);
                int selectedChoice = radio_group_1.getCheckedRadioButtonId();
                int selectedId = radio_group_2.getCheckedRadioButtonId();

                if (selectedId == button_difficulty_level_easy.getId()){
                    intent1.putExtra("choice", "x");
                    intent1.putExtra("choice", "o");
                    startActivity(intent1);
                }else if(selectedId == button_difficulty_level_hard.getId()){
                    intent2.putExtra("choice", "x");
                    intent2.putExtra("choice", "o");
                    startActivity(intent2);
                }

            }
        });
    }
}
