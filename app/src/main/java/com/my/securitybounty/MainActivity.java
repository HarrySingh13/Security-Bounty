package com.my.securitybounty;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.graphics.Typeface;

public class MainActivity extends Activity {
	
	
	private LinearLayout linear8;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear6;
	private LinearLayout linear9;
	private TextView textview5;
	private TextView textview4;
	private LinearLayout linear10;
	private TextView textview1;
	private EditText edittext1;
	private LinearLayout linear11;
	private TextView textview2;
	private EditText edittext2;
	private LinearLayout linear12;
	private TextView textview3;
	private EditText edittext3;
	private Button button1;
	
	private SharedPreferences info;
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		textview1 = (TextView) findViewById(R.id.textview1);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		textview2 = (TextView) findViewById(R.id.textview2);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		textview3 = (TextView) findViewById(R.id.textview3);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		button1 = (Button) findViewById(R.id.button1);
		info = getSharedPreferences("info", Activity.MODE_PRIVATE);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				info.edit().putString("view", "ok").commit();
				info.edit().putString("name", edittext1.getText().toString()).commit();
				info.edit().putString("num", edittext2.getText().toString()).commit();
				info.edit().putString("addr", edittext3.getText().toString()).commit();
				i.setClass(getApplicationContext(), BypassActivity.class);
				startActivity(i);
			}
		});
	}
	private void initializeLogic() {
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/berton.ttf"), 3);
		if (!info.getString("view", "").contains("ok")) {
			
		}
		else {
			i.setClass(getApplicationContext(), BypassActivity.class);
			startActivity(i);
			finish();
		}
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
