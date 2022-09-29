package com.example.android.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreBarcaGoals = 0;
    int scoreBarcaFouls = 0;
    int scoreBarcaOffsides = 0;
    int scoreBarcaCorners = 0;
    int scoreBarcaYellowCards = 0;
    int scoreBarcaRedCards = 0;
    int scoreRealGoals = 0;
    int scoreRealFouls = 0;
    int scoreRealOffsides = 0;
    int scoreRealCorners = 0;
    int scoreRealYellowCards = 0;
    int scoreRealRedCards = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Goal for Barca
     */

    public void goalForBarca(View v) {
        scoreBarcaGoals = scoreBarcaGoals + 1;
        displayForBarcaGoals(scoreBarcaGoals);
    }

    /**
     * Foul for Barca
     */

    public void foulForBarca(View v) {
        scoreBarcaFouls = scoreBarcaFouls + 1;
        displayForBarcaFouls(scoreBarcaFouls);
    }

    /**
     * Offside for Barca
     */

    public void offSideForBarca(View v) {
        scoreBarcaOffsides = scoreBarcaOffsides + 1;
        displayForBarcaOffSides(scoreBarcaOffsides);
    }

    /**
     * Corner for Barca
     */

    public void cornerForBarca(View v) {
        scoreBarcaCorners = scoreBarcaCorners + 1;
        displayForBarcaCorners(scoreBarcaCorners);
    }

    /**
     * YellowCard for Barca
     */

    public void yellowCardForBarca(View v) {
        scoreBarcaYellowCards = scoreBarcaYellowCards + 1;
        displayForBarcaYellowCards(scoreBarcaYellowCards);
    }

    /**
     * RedCard for Barca
     */

    public void redCardForBarca(View v) {
        scoreBarcaRedCards = scoreBarcaRedCards + 1;
        displayForBarcaRedCards(scoreBarcaRedCards);
    }

    /**
     * Goal for Real
     */

    public void goalForReal(View v) {
        scoreRealGoals = scoreRealGoals + 1;
        displayForRealGols(scoreRealGoals);
    }

    /**
     * Foul for Real
     */

    public void foulForReal(View v) {
        scoreRealFouls = scoreRealFouls + 1;
        displayForRealFouls(scoreRealFouls);
    }

    /**
     * Offside for Real
     */

    public void offSideForReal(View v) {
        scoreRealOffsides = scoreRealOffsides + 1;
        displayForRealOffSides(scoreRealOffsides);
    }

    /**
     * Corner for Real
     */

    public void cornerForReal(View v) {
        scoreRealCorners = scoreRealCorners + 1;
        displayForRealCorners(scoreRealCorners);
    }

    /**
     * YellowCard for Real
     */

    public void yellowCardForReal(View v) {
        scoreRealYellowCards = scoreRealYellowCards + 1;
        displayForRealYellowCards(scoreRealYellowCards);
    }

    /**
     * RedCard for Real
     */

    public void redCardForReal(View v) {
        scoreRealRedCards = scoreRealRedCards + 1;
        displayForRealRedCards(scoreRealRedCards);
    }

    /**
     * Displays the goals of barca.
     */

    public void displayForBarcaGoals(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barca_goals_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls of barca.
     */

    public void displayForBarcaFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barca_fouls_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the Corners of barca.
     */

    public void displayForBarcaCorners(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barca_corners_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the OffSides of barca.
     */

    public void displayForBarcaOffSides(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barca_offSides_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the YellowCards of barca.
     */

    public void displayForBarcaYellowCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barca_yellowCars_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the YellowCards of barca.
     */

    public void displayForBarcaRedCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barca_redCars_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the goals of real.
     */

    public void displayForRealGols(int score) {
        TextView scoreView = (TextView) findViewById(R.id.real_goals_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls of real.
     */

    public void displayForRealFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.real_fouls_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the Corners of real.
     */

    public void displayForRealCorners(int score) {
        TextView scoreView = (TextView) findViewById(R.id.real_corners_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the OffSides of real.
     */

    public void displayForRealOffSides(int score) {
        TextView scoreView = (TextView) findViewById(R.id.real_offSides_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the YellowCards of real.
     */

    public void displayForRealYellowCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.real_yellowCars_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the YellowCards of real.
     */

    public void displayForRealRedCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.real_redCars_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Reset all score.
     */
    public void resetScore(View v) {
        displayForBarcaGoals(0);
        displayForBarcaFouls(0);
        displayForBarcaCorners(0);
        displayForBarcaOffSides(0);
        displayForBarcaYellowCards(0);
        displayForBarcaRedCards(0);
        displayForRealGols(0);
        displayForRealFouls(0);
        displayForRealCorners(0);
        displayForRealOffSides(0);
        displayForRealYellowCards(0);
        displayForRealRedCards(0);
        scoreBarcaGoals = 0;
        scoreBarcaFouls = 0;
        scoreBarcaCorners = 0;
        scoreBarcaOffsides = 0;
        scoreBarcaYellowCards = 0;
        scoreBarcaRedCards = 0;
        scoreRealGoals = 0;
        scoreRealFouls = 0;
        scoreRealCorners = 0;
        scoreRealOffsides = 0;
        scoreRealYellowCards = 0;
        scoreRealRedCards = 0;

    }
}