package com.example.android.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Use Back Button to exit the Game.
     */
    @Override
    public void onBackPressed() {
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

    /**
     * Open the 3x3 game board.
     */
    public void openNormalBoard(View view) {
        Intent myIntent = new Intent(this, Main2Activity.class);
        startActivity(myIntent);
        finish();
    }

    /**
     * Open the 5x5 game board.
     */

    public void openAdvancedBoard(View view) {
        Intent myIntent = new Intent(this, Main3Activity.class);
        startActivity(myIntent);
        finish();
    }

    /**
     * Exit the game.
     */
    public void exitGame(View view) {
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