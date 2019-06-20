package com.example.nipun.fishgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    private Button startGameAgain;

    private TextView DisplayScore;
    private String Score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        Score = getIntent().getExtras().get("score").toString();

        startGameAgain = (Button) findViewById(R.id.play_again_btn);
        DisplayScore = (TextView) findViewById(R.id.display_score);

        startGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mainIntent = new Intent(GameOverActivity.this, MainActivity.class);
                startActivity(mainIntent);

            }
        });

        DisplayScore.setText("Score = " + Score);
    }
}
