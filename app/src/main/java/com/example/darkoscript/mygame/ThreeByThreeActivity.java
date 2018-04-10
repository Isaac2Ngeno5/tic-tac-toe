package com.example.darkoscript.mygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class ThreeByThreeActivity extends AppCompatActivity {
    Button button_00;
    Button button_01;
    Button button_02;
    Button button_03;
    Button button_04;
    Button button_05;
    Button button_06;
    Button button_07;
    Button button_08;
    Button button_menu;
    Button button_reset;

    boolean isSinglePlayer;
    boolean isPlayerX = true;
    List<Integer> availableButtons;
    List<Integer> removedButtons;
    List<Integer> playerXSelections;
    List<Integer> playerOSelections;
    String choice;
    String computerChoice;
    int moves = 0;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.threebythree_xml);

        button_menu = findViewById(R.id.button_menu);
        button_reset = findViewById(R.id.button_reset);

        button_00 = findViewById(R.id.button_00);
        button_00.setOnClickListener(buttonClickListener);

        button_01 = findViewById(R.id.button_01);
        button_01.setOnClickListener(buttonClickListener);

        button_02 = findViewById(R.id.button_02);
        button_02.setOnClickListener(buttonClickListener);

        button_03 = findViewById(R.id.button_03);
        button_03.setOnClickListener(buttonClickListener);

        button_04 = findViewById(R.id.button_04);
        button_04.setOnClickListener(buttonClickListener);

        button_05 = findViewById(R.id.button_05);
        button_05.setOnClickListener(buttonClickListener);

        button_06 = findViewById(R.id.button_06);
        button_06.setOnClickListener(buttonClickListener);

        button_07 = findViewById(R.id.button_07);
        button_07.setOnClickListener(buttonClickListener);

        button_08 = findViewById(R.id.button_08);
        button_08.setOnClickListener(buttonClickListener);

        Intent intent1 = getIntent();

        choice = intent1.getStringExtra("choice");
        isSinglePlayer = intent1.getBooleanExtra("isSinglePlayer", true);
        if (choice.equals("x"))
            computerChoice = "o";
        else
            computerChoice = "x";

        Toast.makeText(ThreeByThreeActivity.this, String.valueOf(choice), Toast.LENGTH_LONG).show();

        button_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_menu = new Intent(ThreeByThreeActivity.this, MainActivity.class);
                startActivity(intent_menu);
                ActivityCompat.finishAffinity(ThreeByThreeActivity.this);
            }
        });

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setUpGame();
            }
        });

        setUpGame();
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!isSinglePlayer) {
                if (isPlayerX) {
                    choice = "x";
                    isPlayerX = false;
                } else {
                    choice = "o";
                    isPlayerX = true;
                }
            }


            if (availableButtons.contains(view.getId())) {
                Integer chosenIndex = availableButtons.indexOf(view.getId());
                availableButtons.remove(chosenIndex);
                removedButtons.add(view.getId());
                ((Button) view).setText(choice);

                makeSelection(choice, view.getId());
            } else
                Toast.makeText(ThreeByThreeActivity.this, "Invalid move", Toast.LENGTH_SHORT).show();
        }
    };

    private void setUpGame() {
        moves = 0;
        availableButtons = new ArrayList<>();
        removedButtons = new ArrayList<>();
        playerXSelections = new ArrayList<>();
        playerOSelections = new ArrayList<>();

        availableButtons.add(button_00.getId());
        availableButtons.add(button_01.getId());
        availableButtons.add(button_02.getId());
        availableButtons.add(button_03.getId());
        availableButtons.add(button_04.getId());
        availableButtons.add(button_05.getId());
        availableButtons.add(button_06.getId());
        availableButtons.add(button_07.getId());
        availableButtons.add(button_08.getId());

        for (Integer buttonID : availableButtons) {
            Button button = findViewById(buttonID);
            button.setText("");
        }
    }

    private void makeSelection(String playerChoice, Integer buttonID) {
        if (playerChoice.equals("x")) {
            playerXSelections.add(buttonID);
            if (isWin(playerXSelections)) {
                message = "X wins!";
                showResults(message);
                Toast.makeText(ThreeByThreeActivity.this, "X wins!", Toast.LENGTH_LONG).show();
                setUpGame();
            } else {
                if (isSinglePlayer)
                    if (playerChoice.equals(choice))
                        computerPlay();
            }
        } else {
            playerOSelections.add(buttonID);
            if (isWin(playerOSelections)) {
                Toast.makeText(ThreeByThreeActivity.this, "O wins!", Toast.LENGTH_LONG).show();
                message = "O wins!";
                showResults(message);
                setUpGame();
            } else {
                if (isSinglePlayer)
                    if (playerChoice.equals(choice))
                        computerPlay();
            }
        }

        if (++moves == 8) {
            Toast.makeText(ThreeByThreeActivity.this, "Draw", Toast.LENGTH_LONG).show();
            message = "Draw";
            showResults(message);
            setUpGame();
        }
    }

    private void computerPlay() {
        Random random = new Random();
        int chosenIndex = random.nextInt(availableButtons.size());
        Button chosenButton = findViewById(availableButtons.get(chosenIndex));
        if (!removedButtons.contains(chosenButton.getId())) {
            chosenButton.setText(computerChoice);
            availableButtons.remove(chosenIndex);
            removedButtons.add(chosenButton.getId());

            makeSelection(computerChoice, chosenButton.getId());
        } else
            computerPlay();
    }

    private boolean isWin(List<Integer> list) {
        List<Integer> win1 = Arrays.asList(R.id.button_00, R.id.button_01, R.id.button_02);
        List<Integer> win2 = Arrays.asList(R.id.button_03, R.id.button_04, R.id.button_05);
        List<Integer> win3 = Arrays.asList(R.id.button_06, R.id.button_07, R.id.button_08);
        List<Integer> win4 = Arrays.asList(R.id.button_00, R.id.button_03, R.id.button_06);
        List<Integer> win5 = Arrays.asList(R.id.button_01, R.id.button_04, R.id.button_07);
        List<Integer> win6 = Arrays.asList(R.id.button_02, R.id.button_05, R.id.button_08);
        List<Integer> win7 = Arrays.asList(R.id.button_00, R.id.button_04, R.id.button_08);
        List<Integer> win8 = Arrays.asList(R.id.button_02, R.id.button_04, R.id.button_06);

        List<List<Integer>> wins = Arrays.asList(win1, win2, win3, win4, win5, win6, win7, win8);

        for (List<Integer> win : wins)
            if (list.containsAll(win))
                return true;

        return false;
    }


    private void showResults(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(ThreeByThreeActivity.this);

        builder.setCancelable(false)
                .setMessage(String.format(Locale.ENGLISH, "Congratulations! ."+message))
                .setTitle("You're Done!")
                .setIcon(R.mipmap.ic_launcher);

        builder.setNegativeButton("Restart", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

                dialog.cancel();
            }
        });

        builder.setPositiveButton("Menu", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent intent_menu = new Intent(ThreeByThreeActivity.this, MainActivity.class);
                startActivity(intent_menu);
                ActivityCompat.finishAffinity(ThreeByThreeActivity.this);
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
