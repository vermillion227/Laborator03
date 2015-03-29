package com.example.phonedialer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupWindow;

public class PhoneDialerActivity extends Activity {

	private ButtonClickListener buttonClickListener = new ButtonClickListener();
	
	private class ButtonClickListener implements Button.OnClickListener {

		@Override
		@SuppressWarnings("all")
		public void onClick(View view) {
			EditText phone_nr = (EditText) findViewById(R.id.editText1);
			if (view.getId() == ((ImageButton)findViewById(R.id.imageButton2)).getId()) {
				Log.d("Caracter", "aici");
				Editable text = phone_nr.getText();
				if (text.length() >= 2) {
					CharSequence new_text = text.subSequence(0, text.length() - 2);
					phone_nr.setText(new_text);
				} else {
					phone_nr.setText("");
				}
			} else {
				if ((view).getId() == ((ImageButton)findViewById(R.id.imageButton1)).getId()) {
					Log.d("Caracter", "aici2");
					Intent intent = new Intent(Intent.ACTION_CALL);
					intent.setData(Uri.parse("tel:"+phone_nr));
					startActivity(intent);
				} else {
					if ((view).getId() == ((ImageButton)findViewById(R.id.imageButton3)).getId()) {
						finish();
					} else {
						Log.d("Caracter", "aici ortii matii");
						Log.d("Caracter", ((Button)view).getText().toString());
						phone_nr.append(((Button)view).getText());
					}
				}
			}
		}		
	}

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_phone_dialer);
		Button b1 = (Button)findViewById(R.id.button1);
		b1.setOnClickListener(buttonClickListener);
		
		Button b2 = (Button)findViewById(R.id.button2);
		b2.setOnClickListener(buttonClickListener);
		
		Button b3 = (Button)findViewById(R.id.button3);
		b3.setOnClickListener(buttonClickListener);
		
		Button b4 = (Button)findViewById(R.id.button4);
		b4.setOnClickListener(buttonClickListener);
		
		Button b5 = (Button)findViewById(R.id.button5);
		b5.setOnClickListener(buttonClickListener);
		
		Button b6 = (Button)findViewById(R.id.button6);
		b6.setOnClickListener(buttonClickListener);
		
		Button b7 = (Button)findViewById(R.id.button7);
		b7.setOnClickListener(buttonClickListener);
		
		Button b8 = (Button)findViewById(R.id.button8);
		b8.setOnClickListener(buttonClickListener);
		
		Button b9 = (Button)findViewById(R.id.button9);
		b9.setOnClickListener(buttonClickListener);
		
		Button b10 = (Button)findViewById(R.id.button10);
		b10.setOnClickListener(buttonClickListener);
		
		ImageButton ib1 = (ImageButton)findViewById(R.id.imageButton1);
		ib1.setOnClickListener(buttonClickListener);
		
		ImageButton ib2 = (ImageButton)findViewById(R.id.imageButton2);
		ib2.setOnClickListener(buttonClickListener);
		
		ImageButton ib3 = (ImageButton)findViewById(R.id.imageButton3);
		ib3.setOnClickListener(buttonClickListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.phone_dialer, menu);
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
