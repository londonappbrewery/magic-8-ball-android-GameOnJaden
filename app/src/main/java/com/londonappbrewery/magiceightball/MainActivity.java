package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView ballDisplay;
    final int[] ballArray = {R.drawable.ball1,
                             R.drawable.ball2,
                             R.drawable.ball3,
                             R.drawable.ball4,
                             R.drawable.ball5};
    Button MyButton;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ballDisplay = (ImageView)findViewById(R.id.image_eightBall);
       MyButton = (Button)findViewById(R.id.Ask_button);

       MyButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Random Random_number_generator = new Random();

               number = Random_number_generator.nextInt(5);

               ballDisplay.setImageResource(ballArray[number]);

           }
       });

    }
}
