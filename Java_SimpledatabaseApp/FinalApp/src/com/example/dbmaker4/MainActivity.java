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
			menu.setHeaderTitle("���� ������ ������");
			menu.add(0,1,0,"ġŲ");
			menu.add(0,2,0,"�߱���");
			menu.add(0,3,0,"����");
			menu.add(0,4,0,"�ѽ�(�н�)");
			menu.add(0,5,0,"���ߺ���");
			menu.add(0,6,0,"�߽�");
			menu.add(0,7,0,"��,��");
			menu.add(0,8,0,"ȸ,���,�Ͻ�");
			menu.add(0,9,0,"���ö�");
			menu.add(0,10,0,"�н�ƮǪ��");
			menu.add(0,11,0,"��κ���");
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
