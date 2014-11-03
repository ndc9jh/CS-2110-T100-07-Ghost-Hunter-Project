package com.example.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;


public class MainActivity extends ActionBarActivity {

int button1clicks = 0;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener() {
			
			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {
				button1clicks++;
				
				if(button1clicks == 1) {
					button1.setTextColor(Color.RED);
					button1.setBackgroundColor(Color.YELLOW);
					button1.setText("DON'T PUSH");
				}
				
				if(button1clicks == 2) {
					button1.setTextColor(Color.YELLOW);
					button1.setBackgroundColor(Color.RED);
					button1.setRotation(100);
				}
				
				if(button1clicks == 3) {
					button1.setTextColor(Color.WHITE);
					button1.setBackgroundColor(Color.BLACK);
				}
				
				if(button1clicks == 4) {
					button1.setBackgroundColor(Color.WHITE);
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}
