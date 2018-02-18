package com.nanosys.wegdan.mathgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    TextView partA,partB;
    Button firstAnswer,secondAnswer,thirdAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        partA = findViewById(R.id.partA);
        partA.setText("15");

        partB = findViewById(R.id.partB);
        partB.setText("3");

        firstAnswer = findViewById(R.id.firstAnswerButton);
        firstAnswer.setText("55");

        secondAnswer = findViewById(R.id.secondAnswerButton);
        secondAnswer.setText("18");

        thirdAnswer = findViewById(R.id.thirdAnswerButton);
        thirdAnswer.setText("45");
    }

    public void backToHome(View view){
        Intent backHome ;
        backHome = new Intent(this,MainActivity.class);
        startActivity(backHome);
    }




    public void firstAnswer(View view) {
        Toast.makeText(this, "Wrong Answer ,Try Again", Toast.LENGTH_SHORT).show();
    }

    public void secondAnswer(View view) {
        Toast.makeText(this,"Wrong Answer ,Try Again",Toast.LENGTH_SHORT).show();
    }

    public void thirdAnswer(View view) {
        Toast.makeText(this,"Hey, Bew Bew Bew Right Answer :)",Toast.LENGTH_SHORT).show();
    }
}
