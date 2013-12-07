package com.example.statetunedcapitolquiz;

import java.io.IOException;
import java.io.InputStream;

import java.util.Random;


import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizActivity extends Activity {
	Random r = new Random();
	private int stateIndex;
	private TextView stateName;
	private ImageView stateImage;
	private Button button1;
	private Button button2;
	private Button button3;	
	State[] states;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity__quiz);
		states = (State[]) getIntent().getSerializableExtra("State Array");
		stateIndex=r.nextInt(3);
		stateName = (TextView) findViewById(R.id.stateName);
		stateImage = (ImageView) findViewById(R.id.stateImage);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		this.loadQuizElements();		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start_quiz, menu);
		return true;
	}
	public void loadQuizElements()
	{
		AssetManager assets = getAssets(); // get app's AssetManager
	    stateName.setText(states[stateIndex].getName());
		String NextStateImage = states[stateIndex].getImage();
	    InputStream stream; // used to read in state images
	    try {
		stream = assets.open(NextStateImage);	
	         
	    // load the asset as a Drawable and display on the flagImageView
	    Drawable stateArt = Drawable.createFromStream(stream, NextStateImage);
	    stateImage.setImageDrawable(stateArt);                       
	    }
	    catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
		
		//need to randomize the buttons below so capitol is on different buttons
		button1.setText(states[stateIndex].getCapitol());
		button2.setText(states[stateIndex].getCity1());
		button3.setText(states[stateIndex].getCity2());
	}
	
	
}
