package com.example.darkoscript.mygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    Button button_choice_x;
    Button button_choice_o;
    Button button_difficulty_level_easy;
    Button button_difficulty_level_hard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_xml);

        button_choice_o = findViewById(R.id.button_choice_o);
        button_choice_x = findViewById(R.id.button_choice_x);
        button_difficulty_level_easy = findViewById(R.id.button_difficult_level_easy);
        button_difficulty_level_hard = findViewById(R.id.button_difficult_level_hard);

        Intent intent = getIntent();

        boolean isSinglePlayer = intent.getBooleanExtra("isSinglePlayer", false);

        Toast.makeText(MenuActivity.this, String.valueOf(isSinglePlayer), Toast.LENGTH_LONG).show();
    }
}
