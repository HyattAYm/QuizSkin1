package com.example.alessandra.quizskin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreQuiz = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //** Increase the score of the quiz by 0

    public void addZeroToScore (View v) {
        scoreQuiz = scoreQuiz + 0;
        displayForQuiz(scoreQuiz);

    }

    //** Increase the score of the quiz by 2

    public void addTwoToScore (View v) {
        scoreQuiz = scoreQuiz + 2;
        displayForQuiz(scoreQuiz);

    }

    //** Increase the score of the quiz by 3

    public void addThreeToScore (View v) {
        scoreQuiz = scoreQuiz + 3;
        displayForQuiz(scoreQuiz);

    }

    //** Increase the score of the quiz by 4

    public void addFourToScore (View v) {
        scoreQuiz = scoreQuiz + 4;
        displayForQuiz(scoreQuiz);

    }

    private void displayForQuiz (int scoreQuiz){
        TextView scoreTextView = (TextView) findViewById(R.id.finalScore);
        scoreTextView.setText("" + scoreQuiz);
    }
}
