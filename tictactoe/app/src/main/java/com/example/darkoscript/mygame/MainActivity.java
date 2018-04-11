package com.example.darkoscript.mygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_single_player;
    Button button_dual_player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_single_player = findViewById(R.id.button_single_player);
        button_dual_player = findViewById(R.id.button_dual_player);

        button_single_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("isSinglePlayer", true);
                startActivity(intent);
            }
        });


        button_dual_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("isSinglePlayer", false);
                startActivity(intent);
            }
        });
    }
}
