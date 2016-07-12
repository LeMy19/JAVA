package com.example.dbmaker4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Button;

public class MainActivity extends Activity {

	Button search_bt; 
	Button best_bt; 
	Button scrap_bt; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//startActivity(new Intent(this, Splash.class));
		
		search_bt = (Button)findViewById(R.id.button);
		best_bt = (Button)findViewById(R.id.button1);
		scrap_bt = (Button)findViewById(R.id.button2);

		registerForContextMenu(search_bt);
		registerForContextMenu(best_bt);
		registerForContextMenu(scrap_bt);
		//best_bt.setOnClickListener((View.OnClickListener)this);
		//scrap_bt.setOnClickListener((View.OnClickListener)this);
	}
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
		if( v == search_bt ){
			menu.setHeaderTitle("맛집 종류를 고르세요");
			menu.add(0,1,0,"치킨");
			menu.add(0,2,0,"중국집");
			menu.add(0,3,0,"피자");
			menu.add(0,4,0,"한식(분식)");
			menu.add(0,5,0,"족발보쌈");
			menu.add(0,6,0,"야식");
			menu.add(0,7,0,"찜,탕");
			menu.add(0,8,0,"회,돈까스,일식");
			menu.add(0,9,0,"도시락");
			menu.add(0,10,0,"패스트푸드");
			menu.add(0,11,0,"모두보기");
		} else if(v == best_bt){
			startActivity(new Intent(this, BestActivity.class));
		} else if(v == scrap_bt){
			startActivity(new Intent(this, ScrapActivity.class));
		} else {
			
		}
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		
		switch(item.getItemId()) {
		case 1:
			//Intent intent = new Intent(MainActivity.this, menu_01.class);
            //startActivity(intent);
			startActivity(new Intent(this, menu_01.class));
			return true;
		case 2:
			startActivity(new Intent(this, menu_02.class));
			return true;
		case 3:
			startActivity(new Intent(this, menu_03.class));
			return true;
		case 4:
			startActivity(new Intent(this, menu_04.class));
			return true;
		case 5:
			startActivity(new Intent(this, menu_05.class));
			return true;
		case 6:
			startActivity(new Intent(this, menu_06.class));
			return true;
		case 7:
			startActivity(new Intent(this, menu_07.class));
			return true;
		case 8:
			startActivity(new Intent(this, menu_08.class));
			return true;
		case 9:
			startActivity(new Intent(this, menu_09.class));
			return true;
		case 10:
			startActivity(new Intent(this, menu_10.class));
			return true;
		case 11:
			startActivity(new Intent(this, menu_11.class));
			return true;
										
		}
		// TODO Auto-generated method stub
		return super.onContextItemSelected(item);
	}

	
}
