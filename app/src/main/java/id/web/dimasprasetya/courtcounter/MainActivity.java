package id.web.dimasprasetya.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pointA = 0;
    int pointB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Team A */
    public void threePointButtonA(View view) {
        pointA += 3;
        displayA(pointA);
    }

    public void twoPointButtonA(View view) {
        pointA += 2;
        displayA(pointA);
    }

    public void freeThrowButtonA(View view) {
        pointA += 1;
        displayA(pointA);
    }

    public void displayA(int number) {
        TextView scoreATextView = (TextView) findViewById(R.id.score_a_text_view);
        scoreATextView.setText("" + number);
    }

    /* Team B */
    public void threePointButtonB(View view) {
        pointB += 3;
        displayB(pointB);
    }

    public void twoPointButtonB(View view) {
        pointB += 2;
        displayB(pointB);
    }

    public void freeThrowButtonB(View view) {
        pointB += 1;
        displayB(pointB);
    }

    public void displayB(int number) {
        TextView scoreBTextView = (TextView) findViewById(R.id.score_b_text_view);
        scoreBTextView.setText("" + number);
    }

    /* Reset */
    public void resetButton(View view) {
        pointA = 0;
        pointB = 0;
        display(pointA, pointB);
    }

    public void display(int numberA, int numberB) {
        TextView scoreATextView = (TextView) findViewById(R.id.score_a_text_view);
        TextView scoreBTextView = (TextView) findViewById(R.id.score_b_text_view);

        scoreATextView.setText("" + numberA);
        scoreBTextView.setText("" + numberB);
    }
}
