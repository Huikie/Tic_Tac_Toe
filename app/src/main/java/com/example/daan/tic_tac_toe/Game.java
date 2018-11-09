package com.example.daan.tic_tac_toe;

import java.io.Serializable;

import static com.example.daan.tic_tac_toe.GameState.DRAW;
import static com.example.daan.tic_tac_toe.GameState.IN_PROGRESS;
import static com.example.daan.tic_tac_toe.GameState.PLAYER_ONE;
import static com.example.daan.tic_tac_toe.GameState.PLAYER_TWO;
import static com.example.daan.tic_tac_toe.TileState.BLANK;
import static com.example.daan.tic_tac_toe.TileState.CIRCLE;
import static com.example.daan.tic_tac_toe.TileState.CROSS;
import static com.example.daan.tic_tac_toe.TileState.INVALID;

public class Game implements Serializable {
    //constant and variable that hold the board
    final private int BOARD_SIZE = 3;
    private TileState[][] board;

    //some variables that keep count
    private Boolean playerOneTurn; // true if player 1's turn, false if player 2's turn
    private int movesPlayed;
    private Boolean gameOver;

    //Constructor
    public Game() {
        board = new TileState[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++)
            for (int j = 0; j < BOARD_SIZE; j++)
                board[i][j] = BLANK;

        playerOneTurn = true;
        gameOver = false;
    }

    public TileState choose(int row, int column) {
        if (board[row][column] == BLANK && playerOneTurn) {
            playerOneTurn = false;
            movesPlayed += 1;
            board[row][column] = CROSS;
            return CROSS;
        } else if (board[row][column] == BLANK && !playerOneTurn) {
            playerOneTurn = true;
            movesPlayed += 1;
            board[row][column] = CIRCLE;
            return CIRCLE;
        } else {
            return INVALID;
        }
    }

    public GameState won() {
        //Check columns:

        //First column three crosses or circles
        if (board[0][0] == CROSS && board[1][0] == CROSS && board[2][0] == CROSS) {
            return PLAYER_ONE;
        }
        if (board[0][0] == CIRCLE && board[1][0] == CIRCLE && board[2][0] == CIRCLE) {
            return PLAYER_TWO;
        }
        //Second column three crosses or circles
        if (board[0][1] == CROSS && board[1][1] == CROSS && board[2][1] == CROSS) {
            return PLAYER_ONE;
        }
        if (board[0][1] == CIRCLE && board[1][1] == CIRCLE && board[2][1] == CIRCLE) {
            return PLAYER_TWO;
        }
        //Third column three crosses or circles
        if (board[0][2] == CROSS && board[1][2] == CROSS && board[2][2] == CROSS) {
            return PLAYER_ONE;
        }
        if (board[0][2] == CIRCLE && board[1][2] == CIRCLE && board[2][2] == CIRCLE) {
            return PLAYER_TWO;
        }
        // Check rows:

        //First row three crosses or circles
        if (board[0][0] == CROSS && board[0][1] == CROSS && board[0][2] == CROSS) {
            return PLAYER_ONE;
        }
        if (board[0][0] == CIRCLE && board[0][1] == CIRCLE && board[0][2] == CIRCLE) {
            return PLAYER_TWO;
        }
        //Second row three crosses or circles
        if (board[1][0] == CROSS && board[1][1] == CROSS && board[1][2] == CROSS) {
            return PLAYER_ONE;
        }
        if (board[1][0] == CIRCLE && board[1][1] == CIRCLE && board[1][2] == CIRCLE) {
            return PLAYER_TWO;
        }
        //Third row three crosses or circles
        if (board[2][0] == CROSS && board[2][1] == CROSS && board[2][2] == CROSS) {
            return PLAYER_ONE;
        }
        if (board[2][0] == CIRCLE && board[2][1] == CIRCLE && board[2][2] == CIRCLE) {
            return PLAYER_TWO;
        }
        // Check diagonals:

        //First diagonal three crosses or circles
        if (board[0][0] == CROSS && board[1][1] == CROSS && board[2][2] == CROSS) {
            return PLAYER_ONE;
        }
        if (board[0][0] == CIRCLE && board[1][1] == CIRCLE && board[2][2] == CIRCLE) {
            return PLAYER_TWO;
        }
        //Second diagonal three crosses or circles
        if (board[2][0] == CROSS && board[1][1] == CROSS && board[0][2] == CROSS) {
            return PLAYER_ONE;
        }
        if (board[2][0] == CIRCLE && board[1][1] == CIRCLE && board[0][2] == CIRCLE) {
            return PLAYER_TWO;
        }
        if(movesPlayed == 9){
            return DRAW;
        }
        else{
            return IN_PROGRESS;
        }
    }
}

