package com.example.laboratorio6;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare ALL buttons preemptively
        Button alarmButton = (Button) this.findViewById(R.id.alarmButton);
        Button arcadeButton = (Button) this.findViewById(R.id.arcadeButton);
        Button dogButton = (Button) this.findViewById(R.id.dogButton);
        Button gooseButton = (Button) this.findViewById(R.id.gooseButton);
        Button coinButton = (Button) this.findViewById(R.id.coinButton);
        Button whooshButton = (Button) this.findViewById(R.id.whooshButton);

        // Color presets
        alarmButton.setBackgroundColor(getResources().getColor(R.color.DarkGoldenrod));
        arcadeButton.setBackgroundColor(getResources().getColor(R.color.DarkViolet));
        dogButton.setBackgroundColor(getResources().getColor(R.color.SaddleBrown));
        gooseButton.setBackgroundColor(getResources().getColor(R.color.SlateGray));
        coinButton.setBackgroundColor(getResources().getColor(R.color.Gold));
        whooshButton.setBackgroundColor(getResources().getColor(R.color.Plum));

        // Media players:
        final MediaPlayer alarmSound = MediaPlayer.create(this, R.raw.alarm);
        alarmButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                alarmSound.start();
                alarmButton.setBackgroundColor(getResources().getColor(R.color.Tan));
                arcadeButton.setBackgroundColor(getResources().getColor(R.color.DarkViolet));
                dogButton.setBackgroundColor(getResources().getColor(R.color.SaddleBrown));
                gooseButton.setBackgroundColor(getResources().getColor(R.color.SlateGray));
                coinButton.setBackgroundColor(getResources().getColor(R.color.Gold));
                whooshButton.setBackgroundColor(getResources().getColor(R.color.Plum));
            }
        });

        final MediaPlayer arcadeSound = MediaPlayer.create(this, R.raw.arcade);
        arcadeButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                arcadeSound.start();
                alarmButton.setBackgroundColor(getResources().getColor(R.color.DarkGoldenrod));
                arcadeButton.setBackgroundColor(getResources().getColor(R.color.Lavender));
                dogButton.setBackgroundColor(getResources().getColor(R.color.SaddleBrown));
                gooseButton.setBackgroundColor(getResources().getColor(R.color.SlateGray));
                coinButton.setBackgroundColor(getResources().getColor(R.color.Gold));
                whooshButton.setBackgroundColor(getResources().getColor(R.color.Plum));
            }
        });

        final MediaPlayer dogSound = MediaPlayer.create(this, R.raw.dog);
        dogButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                dogSound.start();
                alarmButton.setBackgroundColor(getResources().getColor(R.color.DarkGoldenrod));
                arcadeButton.setBackgroundColor(getResources().getColor(R.color.DarkViolet));
                dogButton.setBackgroundColor(getResources().getColor(R.color.RosyBrown));
                gooseButton.setBackgroundColor(getResources().getColor(R.color.SlateGray));
                coinButton.setBackgroundColor(getResources().getColor(R.color.Gold));
                whooshButton.setBackgroundColor(getResources().getColor(R.color.Plum));
            }
        });

        final MediaPlayer gooseSound = MediaPlayer.create(this, R.raw.geese);
        gooseButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                gooseSound.start();
                alarmButton.setBackgroundColor(getResources().getColor(R.color.DarkGoldenrod));
                arcadeButton.setBackgroundColor(getResources().getColor(R.color.DarkViolet));
                dogButton.setBackgroundColor(getResources().getColor(R.color.SaddleBrown));
                gooseButton.setBackgroundColor(getResources().getColor(R.color.Silver));
                coinButton.setBackgroundColor(getResources().getColor(R.color.Gold));
                whooshButton.setBackgroundColor(getResources().getColor(R.color.Plum));
            }
        });

        final MediaPlayer coinSound = MediaPlayer.create(this, R.raw.coinwin);
        coinButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                coinSound.start();
                alarmButton.setBackgroundColor(getResources().getColor(R.color.DarkGoldenrod));
                arcadeButton.setBackgroundColor(getResources().getColor(R.color.DarkViolet));
                dogButton.setBackgroundColor(getResources().getColor(R.color.SaddleBrown));
                gooseButton.setBackgroundColor(getResources().getColor(R.color.SlateGray));
                coinButton.setBackgroundColor(getResources().getColor(R.color.Wheat));
                whooshButton.setBackgroundColor(getResources().getColor(R.color.Plum));
            }
        });

        final MediaPlayer whooshSound = MediaPlayer.create(this, R.raw.whoosh);
        whooshButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                whooshSound.start();
                alarmButton.setBackgroundColor(getResources().getColor(R.color.DarkGoldenrod));
                arcadeButton.setBackgroundColor(getResources().getColor(R.color.DarkViolet));
                dogButton.setBackgroundColor(getResources().getColor(R.color.SaddleBrown));
                gooseButton.setBackgroundColor(getResources().getColor(R.color.SlateGray));
                coinButton.setBackgroundColor(getResources().getColor(R.color.Gold));
                whooshButton.setBackgroundColor(getResources().getColor(R.color.MediumPurple));
            }
        });

    }
}