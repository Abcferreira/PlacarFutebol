package com.example.android.placarfutebol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowCardA = 0;
    int yellowCardB = 0;
    int foulForTeamA = 0;
    int foulForTeamB = 0;
    int redCardTeamA = 0;
    int redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void golForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays Yellow card team A.
     */
    public void displayYellCardA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cartao_am_A);
        scoreView.setText(String.valueOf(score));
    }

    public void yellCardForTeamA(View view) {
        yellowCardA = yellowCardA + 1;
        displayYellCardA(yellowCardA);
    }

    /**
     * Displays the fouls for Team A.
     */
    public void displayFoulA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_a);
        scoreView.setText(String.valueOf(score));
    }

    public void foulTeamAFor(View view) {
        foulForTeamA = foulForTeamA + 1;
        displayFoulA(foulForTeamA);
    }

    /**
     * Displays the red cards for Team A.
     */
    public void displayRedCardA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_card_A);
        scoreView.setText(String.valueOf(score));
    }

    public void redCardForTeamA(View view) {
        redCardTeamA = redCardTeamA + 1;
        displayRedCardA(redCardTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void golForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays Yellow card team B.
     */
    public void displayYellCardB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yell_card_B);
        scoreView.setText(String.valueOf(score));
    }

    public void yellCardForTeamB(View view) {
        yellowCardB = yellowCardB + 1;
        displayYellCardB(yellowCardB);
    }

    /**
     * Displays the fouls for Team B.
     */
    public void displayFoulB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_B);
        scoreView.setText(String.valueOf(score));
    }

    public void foulTeamBFor(View view) {
        foulForTeamB = foulForTeamB + 1;
        displayFoulB(foulForTeamB);
    }

    /**
     * Displays the red cards for Team B.
     */
    public void displayRedCardB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_card_B);
        scoreView.setText(String.valueOf(score));
    }

    public void redCardForTeamB(View view) {
        redCardTeamB = redCardTeamB + 1;
        displayRedCardB(redCardTeamB);
    }

    /**
     * Reset the score.
     */
    public void resetAll(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        yellowCardA = 0;
        yellowCardB = 0;
        foulForTeamA = 0;
        foulForTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayYellCardA(yellowCardA);
        displayYellCardB(yellowCardB);
        displayFoulA(foulForTeamA);
        displayFoulB(foulForTeamB);
        displayRedCardA(redCardTeamA);
        displayRedCardB(redCardTeamB);
    }
}

