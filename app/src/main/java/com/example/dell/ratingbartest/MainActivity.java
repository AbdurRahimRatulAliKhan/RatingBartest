package com.example.dell.ratingbartest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratinngBarId);
        textView = findViewById(R.id.tvResult);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                if (rating == 5 ){
                    textView.setText("Excelent: " + rating);
                } else if(rating == 4) {
                    textView.setText("Very Good: " + rating);
                } else if(rating == 3) {
                    textView.setText("Good: " + rating);
                }
                else if(rating == 2) {
                    textView.setText("Bad: " + rating);
                }else if(rating == 1) {
                    textView.setText("Very Bad: " + rating);
                }
            }
        });
    }
}
