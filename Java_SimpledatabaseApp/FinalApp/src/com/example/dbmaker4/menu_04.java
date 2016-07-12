package com.example.dbmaker4;
import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class menu_04 extends Activity {

	private MyDbAdapter dbAdapter;
	public static final String TAG = "MyDbAdapter";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_item);
	
		Log.d(TAG, "DATABASE test :: onCreate()");
		
		//create MyDbapter instance
		dbAdapter = new MyDbAdapter(this);
		
		//open DbAdapter = gets SQLiteDabase
		dbAdapter.open();
		
		Cursor result = dbAdapter.fetchAllNotes();
		
		result.moveToFirst();
		Log.d(TAG, "DATABASE test :: after open db");
		
		while(!result.isAfterLast()){
			//bring the name, tel, price
			String type = result.getString(1);
			String name = result.getString(2);
			String tel = result.getString(3);
			String price = result.getString(4);
			
			//show output on text view 1
			TextView tv1 = (TextView)findViewById(R.id.name);
			TextView tv2= (TextView)findViewById(R.id.tel);
			TextView tv3= (TextView)findViewById(R.id.price);
			Log.d(TAG, "DATABASE test :: list out()");
			
			if(type=="4") {
				Log.d(TAG, "DATABASE test :: 4∏∏ ¿‚±‚()");
				
				tv1.setText(name);
				tv2.setText(tel);
				tv3.setText(price);
			}  
			result.moveToNext();
		
		}
		
	}
}
