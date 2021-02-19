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
import android.widget.ImageView;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationListener;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import java.text.DecimalFormat;
import android.Manifest;
import android.content.pm.PackageManager;

public class IndexActivity extends Activity {
	
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear6;
	private ImageView imageview1;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear10;
	private LinearLayout linear12;
	private LinearLayout linear11;
	private TextView textview12;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private Button button5;
	private Button button2;
	private Button button3;
	private Button button1;
	private Button button4;
	private TextView textview8;
	private TextView textview6;
	private TextView textview9;
	private TextView textview5;
	private TextView textview10;
	private TextView textview11;
	
	private Intent i = new Intent();
	private SharedPreferences info;
	private LocationManager lm;
	private LocationListener _lm_location_listener;
	private AlertDialog.Builder d;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.index);
		initialize(_savedInstanceState);
		if (Build.VERSION.SDK_INT >= 23) {
			if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
			|| checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
			|| checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_DENIED) {
				requestPermissions(new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.ACCESS_FINE_LOCATION}, 1000);
			}
			else {
				initializeLogic();
			}
		}
		else {
			initializeLogic();
		}
	}
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);
		button5 = (Button) findViewById(R.id.button5);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button1 = (Button) findViewById(R.id.button1);
		button4 = (Button) findViewById(R.id.button4);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview11 = (TextView) findViewById(R.id.textview11);
		info = getSharedPreferences("info", Activity.MODE_PRIVATE);
		lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		d = new AlertDialog.Builder(this);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_send(info.getString("num1", ""), "Help,\nI am in danger,\nMy coordinates are :".concat("Latitude ".concat(textview6.getText().toString()).concat("Longitude ".concat(textview5.getText().toString())).concat("My details are".concat(info.getString("name", "").concat(info.getString("num", "").concat(info.getString("addr", "").concat("Family details:".concat(info.getString("name1", "").concat(info.getString("num1", "").concat(info.getString("addr1", "").concat(info.getString("name2", "").concat(info.getString("num2", "").concat(info.getString("addr2", ""))))))))))))));
				_send(info.getString("num2", ""), "Help,\nI am in danger,\nMy coordinates are :".concat("Latitude ".concat(textview6.getText().toString()).concat("Longitude ".concat(textview5.getText().toString())).concat("My details are".concat(info.getString("name", "").concat(info.getString("num", "").concat(info.getString("addr", "").concat("Family details:".concat(info.getString("name1", "").concat(info.getString("num1", "").concat(info.getString("addr1", "").concat(info.getString("name2", "").concat(info.getString("num2", "").concat(info.getString("addr2", ""))))))))))))));
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Call, coming soon ");
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Website, coming soon");
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Inquire, coming soon");
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Contact, coming soon");
			}
		});
		
		_lm_location_listener = new LocationListener() {
			@Override
			public void onLocationChanged(Location _param1) {
				final double _lat = _param1.getLatitude();
				final double _lng = _param1.getLongitude();
				final double _acc = _param1.getAccuracy();
				textview6.setText(String.valueOf(_lat));
				textview5.setText(String.valueOf(_lng));
				textview11.setText(String.valueOf(_acc));
			}
			@Override
			public void onStatusChanged(String provider, int status, Bundle extras) {}
			@Override
			public void onProviderEnabled(String provider) {}
			@Override
			public void onProviderDisabled(String provider) {}
		};
	}
	private void initializeLogic() {
		i.setClass(getApplicationContext(), SplashActivity.class);
		startActivity(i);
		
		textview5.setVisibility(View.VISIBLE);
		textview6.setVisibility(View.VISIBLE);
		if (Build.VERSION.SDK_INT >= 23) {if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
				lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1, 1, _lm_location_listener);
			}
		}
		else {
			lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1, 1, _lm_location_listener);
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
	
	@Override
	public void onBackPressed() {
		d.setTitle("Title");
		d.setMessage("Do you want to exit the application? ");
		d.setPositiveButton("Yes ", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				finishAffinity();
			}
		});
		d.setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		d.create().show();
	}
	private void _send (final String _num, final String _msg) {
		try {
			android.telephony.SmsManager smsManager = android.telephony.SmsManager.getDefault();     smsManager.sendTextMessage(_num, null, _msg, null, null);
			Toast.makeText(getApplicationContext(), "Help Alert Sent!",        Toast.LENGTH_LONG).show(); 
		} 
		catch (Exception e) {     Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
			e.printStackTrace();     
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
