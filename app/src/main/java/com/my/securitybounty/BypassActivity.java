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
import android.content.Intent;
import android.net.Uri;
import android.content.SharedPreferences;
import android.view.View;

public class BypassActivity extends Activity {
	
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear6;
	private LinearLayout linear11;
	private TextView textview1;
	private TextView textview2;
	private LinearLayout linear8;
	private TextView textview3;
	private EditText edittext1;
	private LinearLayout linear9;
	private TextView textview4;
	private EditText edittext2;
	private LinearLayout linear10;
	private TextView textview5;
	private EditText edittext3;
	private LinearLayout linear15;
	private TextView textview6;
	private EditText edittext4;
	private LinearLayout linear16;
	private TextView textview7;
	private EditText edittext5;
	private LinearLayout linear17;
	private TextView textview8;
	private EditText edittext6;
	private Button button1;
	
	private Intent i = new Intent();
	private SharedPreferences info;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.bypass);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview3 = (TextView) findViewById(R.id.textview3);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		textview4 = (TextView) findViewById(R.id.textview4);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		textview5 = (TextView) findViewById(R.id.textview5);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		textview6 = (TextView) findViewById(R.id.textview6);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		textview7 = (TextView) findViewById(R.id.textview7);
		edittext5 = (EditText) findViewById(R.id.edittext5);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		textview8 = (TextView) findViewById(R.id.textview8);
		edittext6 = (EditText) findViewById(R.id.edittext6);
		button1 = (Button) findViewById(R.id.button1);
		info = getSharedPreferences("info", Activity.MODE_PRIVATE);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				info.edit().putString("view2", "ok").commit();
				info.edit().putString("name1", edittext1.getText().toString()).commit();
				info.edit().putString("num1", edittext2.getText().toString()).commit();
				info.edit().putString("addr1", edittext2.getText().toString()).commit();
				info.edit().putString("name2", edittext4.getText().toString()).commit();
				info.edit().putString("num2", edittext5.getText().toString()).commit();
				info.edit().putString("addr2", edittext6.getText().toString()).commit();
				i.setClass(getApplicationContext(), IndexActivity.class);
				startActivity(i);
			}
		});
	}
	private void initializeLogic() {
		if (!info.getString("view2", "").contains("ok")) {
			
		}
		else {
			i.setClass(getApplicationContext(), IndexActivity.class);
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
