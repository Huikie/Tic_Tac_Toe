package com.example.daan.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import static com.example.daan.tic_tac_toe.GameState.DRAW;
import static com.example.daan.tic_tac_toe.GameState.PLAYER_ONE;
import static com.example.daan.tic_tac_toe.GameState.PLAYER_TWO;
import static com.example.daan.tic_tac_toe.TileState.CIRCLE;
import static com.example.daan.tic_tac_toe.TileState.CROSS;
import static com.example.daan.tic_tac_toe.TileState.INVALID;

public class MainActivity extends AppCompatActivity {

    // Variable 'game' holds the game.
    Game game;

    public int row;
    public int column;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initiate the game
        game = new Game();

        // If there is a state to restore the state will be restored here.
        if(savedInstanceState != null){

            game  = (Game) savedInstanceState.getSerializable("game");

            String info_text = savedInstanceState.getString("info", null);
            TextView info = findViewById(R.id.gameInfo);
            info.setText(info_text);

            String button_18_text = savedInstanceState.getString("18", null);
            Button button18 = findViewById(R.id.button18);
            button18.setText(button_18_text);

            String button_19_text = savedInstanceState.getString("19", null);
            Button button19 = findViewById(R.id.button19);
            button19.setText(button_19_text);

            String button_20_text = savedInstanceState.getString("20", null);
            Button button20 = findViewById(R.id.button20);
            button20.setText(button_20_text);

            String button_21_text = savedInstanceState.getString("21", null);
            Button button21 = findViewById(R.id.button21);
            button21.setText(button_21_text);

            String button_22_text = savedInstanceState.getString("22", null);
            Button button22 = findViewById(R.id.button22);
            button22.setText(button_22_text);

            String button_23_text = savedInstanceState.getString("23", null);
            Button button23 = findViewById(R.id.button23);
            button23.setText(button_23_text);

            String button_24_text = savedInstanceState.getString("24", null);
            Button button24 = findViewById(R.id.button24);
            button24.setText(button_24_text);

            String button_25_text = savedInstanceState.getString("25", null);
            Button button25 = findViewById(R.id.button25);
            button25.setText(button_25_text);

            String button_26_text = savedInstanceState.getString("26", null);
            Button button26 = findViewById(R.id.button26);
            button26.setText(button_26_text);
        }
    }

    /** This method makes state restoration possible.*/
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        TextView info = findViewById(R.id.gameInfo);
        String info_text = info.getText().toString();
        outState.putString("info", info_text);

        Button button18 = findViewById(R.id.button18);
        String text18 = button18.getText().toString();
        Button button19 = findViewById(R.id.button19);
        String text19 = button19.getText().toString();
        Button button20 = findViewById(R.id.button20);
        String text20 = button20.getText().toString();
        Button button21 = findViewById(R.id.button21);
        String text21 = button21.getText().toString();
        Button button22 = findViewById(R.id.button22);
        String text22 = button22.getText().toString();
        Button button23 = findViewById(R.id.button23);
        String text23 = button23.getText().toString();
        Button button24 = findViewById(R.id.button24);
        String text24 = button24.getText().toString();
        Button button25 = findViewById(R.id.button25);
        String text25 = button25.getText().toString();
        Button button26 = findViewById(R.id.button26);
        String text26 = button26.getText().toString();

        outState.putString("18", text18);
        outState.putString("19", text19);
        outState.putString("20", text20);
        outState.putString("21", text21);
        outState.putString("22", text22);
        outState.putString("23", text23);
        outState.putString("24", text24);
        outState.putString("25", text25);
        outState.putString("26", text26);

        outState.putSerializable("game", game);

    }

    /** This method processes tile clicks.*/
    public void tileClicked(View view) {

        Button button18 = findViewById(R.id.button18);
        Button button19 = findViewById(R.id.button19);
        Button button20 = findViewById(R.id.button20);
        Button button21 = findViewById(R.id.button21);
        Button button22 = findViewById(R.id.button22);
        Button button23 = findViewById(R.id.button23);
        Button button24 = findViewById(R.id.button24);
        Button button25 = findViewById(R.id.button25);
        Button button26 = findViewById(R.id.button26);

        // Store coordinates for all the 9 buttons, find out the state of a clicked tile and set it to the right sign (X or O).
        switch(view.getId()){
            case R.id.button18:
                row = 2;
                column = 2;
                TileState button18_state = game.choose(row, column);
                if(button18_state == CROSS) {
                    button18.setText("X");
                }
                if(button18_state == CIRCLE) {
                    button18.setText("O");
                }
                if(button18_state == INVALID) {
                    return;
                }
                break;
            case R.id.button19:
                row = 2;
                column = 1;
                TileState button19_state = game.choose(row, column);
                if(button19_state == CROSS) {
                    button19.setText("X");
                }
                if(button19_state == CIRCLE) {
                    button19.setText("O");
                }
                if(button19_state == INVALID) {
                    return;
                }
                break;
            case R.id.button20:
                row = 2;
                column = 0;
                TileState button20_state = game.choose(row, column);
                if(button20_state == CROSS) {
                    button20.setText("X");
                }
                if(button20_state == CIRCLE) {
                    button20.setText("O");
                }
                if(button20_state == INVALID) {
                    return;
                }
                break;
            case R.id.button21:
                row = 1;
                column = 2;
                TileState button21_state = game.choose(row, column);
                if(button21_state == CROSS) {
                    button21.setText("X");
                }
                if(button21_state == CIRCLE) {
                    button21.setText("O");
                }
                if(button21_state == INVALID) {
                    return;
                }
                break;
            case R.id.button22:
                row = 1;
                column = 1;
                TileState button22_state = game.choose(row, column);
                if(button22_state == CROSS) {
                    button22.setText("X");
                }
                if(button22_state == CIRCLE) {
                    button22.setText("O");
                }
                if(button22_state == INVALID) {
                    return;
                }
                break;
            case R.id.button23:
                row = 1;
                column = 0;
                TileState button23_state = game.choose(row, column);
                if(button23_state == CROSS) {
                    button23.setText("X");
                }
                if(button23_state == CIRCLE) {
                    button23.setText("O");
                }
                if(button23_state == INVALID) {
                    return;
                }
                break;
            case R.id.button24:
                row = 0;
                column = 2;
                TileState button24_state = game.choose(row, column);
                if(button24_state == CROSS) {
                    button24.setText("X");
                }
                if(button24_state == CIRCLE) {
                    button24.setText("O");
                }
                if(button24_state == INVALID) {
                    return;
                }
                break;
            case R.id.button25:
                row = 0;
                column = 1;
                TileState button25_state = game.choose(row, column);
                if(button25_state == CROSS) {
                    button25.setText("X");
                }
                if(button25_state == CIRCLE) {
                    button25.setText("O");
                }
                if(button25_state == INVALID) {
                    return;
                }
                break;
            case R.id.button26:
                row = 0;
                column = 0;
                TileState button26_state = game.choose(row, column);
                if(button26_state == CROSS) {
                    button26.setText("X");
                }
                if(button26_state == CIRCLE) {
                    button26.setText("O");
                }
                if(button26_state == INVALID) {
                    return;
                }
                break;
        }
        // Give the users feedback of the (won) gamestate and make the tiles unclickable.
        TextView info = findViewById(R.id.gameInfo);
        if (game.won() == PLAYER_ONE) {
            info.setText("Game Over! Player One has won! Restart the game!");
            button18.setClickable(false);
            button19.setClickable(false);
            button20.setClickable(false);
            button21.setClickable(false);
            button22.setClickable(false);
            button23.setClickable(false);
            button24.setClickable(false);
            button25.setClickable(false);
            button26.setClickable(false);
        }
        if (game.won() == PLAYER_TWO) {
            info.setText("Game Over! Player Two has won! Restart the game!");
            button18.setClickable(false);
            button19.setClickable(false);
            button20.setClickable(false);
            button21.setClickable(false);
            button22.setClickable(false);
            button23.setClickable(false);
            button24.setClickable(false);
            button25.setClickable(false);
            button26.setClickable(false);
        }
        if (game.won() == DRAW) {
            info.setText("Game Over! You guys drawed! Restart the game!");
            button18.setClickable(false);
            button19.setClickable(false);
            button20.setClickable(false);
            button21.setClickable(false);
            button22.setClickable(false);
            button23.setClickable(false);
            button24.setClickable(false);
            button25.setClickable(false);
            button26.setClickable(false);
        }
        }

    /** This method allows us to simply throw away the old game and create a new one.*/
    public void resetClicked(View view) {

        // Reset the user interface
        Button button18 = findViewById(R.id.button18);
        Button button19 = findViewById(R.id.button19);
        Button button20 = findViewById(R.id.button20);
        Button button21 = findViewById(R.id.button21);
        Button button22 = findViewById(R.id.button22);
        Button button23 = findViewById(R.id.button23);
        Button button24 = findViewById(R.id.button24);
        Button button25 = findViewById(R.id.button25);
        Button button26 = findViewById(R.id.button26);

        button18.setText("");
        button19.setText("");
        button20.setText("");
        button21.setText("");
        button22.setText("");
        button23.setText("");
        button24.setText("");
        button25.setText("");
        button26.setText("");

        button18.setClickable(true);
        button19.setClickable(true);
        button20.setClickable(true);
        button21.setClickable(true);
        button22.setClickable(true);
        button23.setClickable(true);
        button24.setClickable(true);
        button25.setClickable(true);
        button26.setClickable(true);

        TextView info = findViewById(R.id.gameInfo);
        info.setText("Tic-Tac-Toe!");

        // Create a new game.
        game = new Game();
    }
    }
