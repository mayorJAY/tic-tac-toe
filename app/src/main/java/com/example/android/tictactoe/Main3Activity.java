package com.example.android.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    private final static String TAG = MainActivity.class.getSimpleName();
    // Tracks the score for Player A
    int scorePlayerA = 0;
    // Tracks the score for Player B
    int scorePlayerB = 0;
    boolean PLAYER_X = true;

    int TURN_COUNT = 0;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;

    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;

    Button button16;
    Button button17;
    Button button18;
    Button button19;
    Button button20;

    Button button21;
    Button button22;
    Button button23;
    Button button24;
    Button button25;

    Button buttonRes;

    TextView infoView;

    int[][] boardStatus = new int[5][5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);

        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);

        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);

        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        button25 = findViewById(R.id.button25);

        buttonRes = findViewById(R.id.buttonRes);
        infoView = findViewById(R.id.infoView);

        buttonRes.setOnClickListener(this);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);

        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);

        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);

        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);

        initializeBoardStatus();
    }

    /**
     * Use Back Button to return to the Home Screen.
     */
    @Override
    public void onBackPressed() {
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
        finish();
    }

    /**
     * Display X or 0 on each button.
     */
    @Override
    public void onClick(View view) {
        Log.d(TAG, "Inside onClick");

        boolean resetButtonPressed = false;

        switch (view.getId()) {
            case R.id.button1:
                if (PLAYER_X) {
                    button1.setText("X");
                    boardStatus[0][0] = 1;
                } else {
                    button1.setText("0");
                    boardStatus[0][0] = 0;
                }
                button1.setEnabled(false);
                break;

            case R.id.button2:
                if (PLAYER_X) {
                    button2.setText("X");
                    boardStatus[0][1] = 1;
                } else {
                    button2.setText("0");
                    boardStatus[0][1] = 0;
                }
                button2.setEnabled(false);
                break;

            case R.id.button3:
                if (PLAYER_X) {
                    button3.setText("X");
                    boardStatus[0][2] = 1;
                } else {
                    button3.setText("0");
                    boardStatus[0][2] = 0;
                }
                button3.setEnabled(false);
                break;

            case R.id.button4:
                if (PLAYER_X) {
                    button4.setText("X");
                    boardStatus[0][3] = 1;
                } else {
                    button4.setText("0");
                    boardStatus[0][3] = 0;
                }
                button4.setEnabled(false);
                break;

            case R.id.button5:
                if (PLAYER_X) {
                    button5.setText("X");
                    boardStatus[0][4] = 1;
                } else {
                    button5.setText("0");
                    boardStatus[0][4] = 0;
                }
                button5.setEnabled(false);
                break;

            case R.id.button6:
                if (PLAYER_X) {
                    button6.setText("X");
                    boardStatus[1][0] = 1;
                } else {
                    button6.setText("0");
                    boardStatus[1][0] = 0;
                }
                button6.setEnabled(false);
                break;

            case R.id.button7:
                if (PLAYER_X) {
                    button7.setText("X");
                    boardStatus[1][1] = 1;
                } else {
                    button7.setText("0");
                    boardStatus[1][1] = 0;
                }
                button7.setEnabled(false);
                break;

            case R.id.button8:
                if (PLAYER_X) {
                    button8.setText("X");
                    boardStatus[1][2] = 1;
                } else {
                    button8.setText("0");
                    boardStatus[1][2] = 0;
                }
                button8.setEnabled(false);
                break;

            case R.id.button9:
                if (PLAYER_X) {
                    button9.setText("X");
                    boardStatus[1][3] = 1;
                } else {
                    button9.setText("0");
                    boardStatus[1][3] = 0;
                }
                button9.setEnabled(false);
                break;

            case R.id.button10:
                if (PLAYER_X) {
                    button10.setText("X");
                    boardStatus[1][4] = 1;
                } else {
                    button10.setText("0");
                    boardStatus[1][4] = 0;
                }
                button10.setEnabled(false);
                break;

            case R.id.button11:
                if (PLAYER_X) {
                    button11.setText("X");
                    boardStatus[2][0] = 1;
                } else {
                    button11.setText("0");
                    boardStatus[2][0] = 0;
                }
                button11.setEnabled(false);
                break;

            case R.id.button12:
                if (PLAYER_X) {
                    button12.setText("X");
                    boardStatus[2][1] = 1;
                } else {
                    button12.setText("0");
                    boardStatus[2][1] = 0;
                }
                button12.setEnabled(false);
                break;

            case R.id.button13:
                if (PLAYER_X) {
                    button13.setText("X");
                    boardStatus[2][2] = 1;
                } else {
                    button13.setText("0");
                    boardStatus[2][2] = 0;
                }
                button13.setEnabled(false);
                break;

            case R.id.button14:
                if (PLAYER_X) {
                    button14.setText("X");
                    boardStatus[2][3] = 1;
                } else {
                    button14.setText("0");
                    boardStatus[2][3] = 0;
                }
                button14.setEnabled(false);
                break;

            case R.id.button15:
                if (PLAYER_X) {
                    button15.setText("X");
                    boardStatus[2][4] = 1;
                } else {
                    button15.setText("0");
                    boardStatus[2][4] = 0;
                }
                button15.setEnabled(false);
                break;

            case R.id.button16:
                if (PLAYER_X) {
                    button16.setText("X");
                    boardStatus[3][0] = 1;
                } else {
                    button16.setText("0");
                    boardStatus[3][0] = 0;
                }
                button16.setEnabled(false);
                break;

            case R.id.button17:
                if (PLAYER_X) {
                    button17.setText("X");
                    boardStatus[3][1] = 1;
                } else {
                    button17.setText("0");
                    boardStatus[3][1] = 0;
                }
                button17.setEnabled(false);
                break;

            case R.id.button18:
                if (PLAYER_X) {
                    button18.setText("X");
                    boardStatus[3][2] = 1;
                } else {
                    button18.setText("0");
                    boardStatus[3][2] = 0;
                }
                button18.setEnabled(false);
                break;

            case R.id.button19:
                if (PLAYER_X) {
                    button19.setText("X");
                    boardStatus[3][3] = 1;
                } else {
                    button19.setText("0");
                    boardStatus[3][3] = 0;
                }
                button19.setEnabled(false);
                break;

            case R.id.button20:
                if (PLAYER_X) {
                    button20.setText("X");
                    boardStatus[3][4] = 1;
                } else {
                    button20.setText("0");
                    boardStatus[3][4] = 0;
                }
                button20.setEnabled(false);
                break;

            case R.id.button21:
                if (PLAYER_X) {
                    button21.setText("X");
                    boardStatus[4][0] = 1;
                } else {
                    button21.setText("0");
                    boardStatus[4][0] = 0;
                }
                button21.setEnabled(false);
                break;

            case R.id.button22:
                if (PLAYER_X) {
                    button22.setText("X");
                    boardStatus[4][1] = 1;
                } else {
                    button22.setText("0");
                    boardStatus[4][1] = 0;
                }
                button22.setEnabled(false);
                break;

            case R.id.button23:
                if (PLAYER_X) {
                    button23.setText("X");
                    boardStatus[4][2] = 1;
                } else {
                    button23.setText("0");
                    boardStatus[4][2] = 0;
                }
                button23.setEnabled(false);
                break;

            case R.id.button24:
                if (PLAYER_X) {
                    button24.setText("X");
                    boardStatus[4][3] = 1;
                } else {
                    button24.setText("0");
                    boardStatus[4][3] = 0;
                }
                button24.setEnabled(false);
                break;

            case R.id.button25:
                if (PLAYER_X) {
                    button25.setText("X");
                    boardStatus[4][4] = 1;
                } else {
                    button25.setText("0");
                    boardStatus[4][4] = 0;
                }
                button25.setEnabled(false);
                break;

            case R.id.buttonRes:
                resetButtonPressed = true;
                break;

            default:
                break;

        }

        if (resetButtonPressed) {
            resetBoard();
        } else {
            TURN_COUNT++;
            PLAYER_X = !PLAYER_X;

            if (PLAYER_X) {
                setInfo("Player A's turn");
            } else {
                setInfo("Player B's turn");
            }

            if (TURN_COUNT == 25) {
                result("Game Draw");
            }

            checkWinner();
        }
    }

    private void checkWinner() {

        Log.d(TAG, "Inside checkWinner");

        //Horizontal --- rows
        for (int i = 0; i < 5; i++) {
            if (boardStatus[i][0] == boardStatus[i][1] && boardStatus[i][0] == boardStatus[i][2] && boardStatus[i][0] == boardStatus[i][3]){
                if (boardStatus[i][0] == 1) {
                    result("Player A wins\n" + " Row " + (i + 1));
                    scorePlayerA = scorePlayerA + 1;
                    displayForPlayerA(scorePlayerA);
                    break;
                } else if (boardStatus[i][0] == 0) {
                    result("Player B wins\n" + " Row " + (i + 1));
                    scorePlayerB = scorePlayerB + 1;
                    displayForPlayerB(scorePlayerB);
                    break;
                }
            }
        }

        //|| boardStatus[i][4] == boardStatus[i][3] && boardStatus[i][4] == boardStatus[i][2] && boardStatus[i][4] == boardStatus[i][1]
        //|| boardStatus[4][i] == boardStatus[3][i] && boardStatus[4][i] == boardStatus[2][i] && boardStatus[4][i] == boardStatus[1][i]

        //Vertical --- columns
        for (int i = 0; i < 5; i++) {
            if (boardStatus[0][i] == boardStatus[1][i] && boardStatus[0][i] == boardStatus[2][i] && boardStatus[0][i] == boardStatus[3][i]) {
                if (boardStatus[0][i] == 1) {
                    result("Player A wins\n" + " Column " + (i + 1));
                    scorePlayerA = scorePlayerA + 1;
                    displayForPlayerA(scorePlayerA);
                    break;
                } else if (boardStatus[0][i] == 0) {
                    result("Player B wins\n" + " Column " + (i + 1));
                    scorePlayerB = scorePlayerB + 1;
                    displayForPlayerB(scorePlayerB);
                    break;
                }
            }
        }

            //First diagonal
            if (boardStatus[0][0] == boardStatus[1][1] && boardStatus[0][0] == boardStatus[2][2] && boardStatus[0][0] == boardStatus[3][3]) {
                if (boardStatus[0][0] == 1) {
                    result("Player A wins\nFirst Diagonal");
                    scorePlayerA = scorePlayerA + 1;
                    displayForPlayerA(scorePlayerA);
                } else if (boardStatus[0][0] == 0) {
                    result("Player B wins\nFirst Diagonal");
                    scorePlayerB = scorePlayerB + 1;
                    displayForPlayerB(scorePlayerB);
                }
            }

            //Second diagonal
            if (boardStatus[0][4] == boardStatus[1][3] && boardStatus[0][4] == boardStatus[2][2] && boardStatus[0][4] == boardStatus[3][1]) {
                if (boardStatus[0][4] == 1) {
                    result("Player A wins\nSecond Diagonal");
                    scorePlayerA = scorePlayerA + 1;
                    displayForPlayerA(scorePlayerA);
                } else if (boardStatus[0][4] == 0) {
                    result("Player B wins\nSecond Diagonal");
                    scorePlayerB = scorePlayerB + 1;
                    displayForPlayerB(scorePlayerB);
                }
            }
    }

    /**
     * Display the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = findViewById(R.id.result1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display the given score for Player B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = findViewById(R.id.result2);
        scoreView.setText(String.valueOf(score));
    }

    private void enableAllBoxes(boolean value) {
        Log.d(TAG, "Inside enableAllBoxes");
        button1.setEnabled(value);
        button2.setEnabled(value);
        button3.setEnabled(value);
        button4.setEnabled(value);
        button5.setEnabled(value);

        button6.setEnabled(value);
        button7.setEnabled(value);
        button8.setEnabled(value);
        button9.setEnabled(value);
        button10.setEnabled(value);

        button11.setEnabled(value);
        button12.setEnabled(value);
        button13.setEnabled(value);
        button14.setEnabled(value);
        button15.setEnabled(value);

        button16.setEnabled(value);
        button17.setEnabled(value);
        button18.setEnabled(value);
        button19.setEnabled(value);
        button20.setEnabled(value);

        button21.setEnabled(value);
        button22.setEnabled(value);
        button23.setEnabled(value);
        button24.setEnabled(value);
        button25.setEnabled(value);
    }

    private void result(String winner) {
        Log.d(TAG, "Inside result");

        setInfo(winner);
        enableAllBoxes(false);
    }

    /**
     * Reset the Board and clear all displays.
     */
    private void resetBoard() {
        Log.d(TAG, "Inside resetBoard");
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");

        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        button10.setText("");

        button11.setText("");
        button12.setText("");
        button13.setText("");
        button14.setText("");
        button15.setText("");

        button16.setText("");
        button17.setText("");
        button18.setText("");
        button19.setText("");
        button20.setText("");

        button21.setText("");
        button22.setText("");
        button23.setText("");
        button24.setText("");
        button25.setText("");

        enableAllBoxes(true);

        PLAYER_X = true;
        TURN_COUNT = 0;

        initializeBoardStatus();

        setInfo("Start Again!!!");

        Toast.makeText(this, "Board Reset", Toast.LENGTH_SHORT).show();
    }

    private void setInfo(String text) {
        infoView.setText(text);
    }

    private void initializeBoardStatus() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                boardStatus[i][j] = -1;
            }
        }

    }

    /**
     * Exit the game.
     */
    public void butExi(View view) {
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        dlgAlert.setMessage("Are you sure you want to Exit?");
        dlgAlert.setTitle("Exit");

        dlgAlert.setCancelable(true);
        // Shows a dialog window with Ok button to confirm exit
        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                });
        dlgAlert.create().show();

    }

}
