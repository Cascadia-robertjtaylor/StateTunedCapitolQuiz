package com.example.statetunedcapitolquiz;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizActivity extends Activity {
	ArrayList<State> states = new ArrayList<State>();
	Random r = new Random();
	private int stateIndex;
	private State stateToQuiz;
	private TextView stateName;
	private ImageView stateImage;
	private Button button1;
	private Button button2;
	private Button button3;	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity__quiz);
		stateIndex=r.nextInt(50);
		stateToQuiz = states<stateIndex>;
		stateName = (TextView) findViewById(R.id.stateName);
		stateImage = (ImageView) findViewById(R.id.stateImage);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start_quiz, menu);
		return true;
	}
	
}
