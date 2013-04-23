package com.example.sherlocktest;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.widget.SearchView;
import com.example.actionteste.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.widget.Toast;

public class MainActivity extends SherlockFragmentActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ActionBar bar = getSupportActionBar();
		bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		ActionBar.Tab tab1 = bar.newTab();
		ActionBar.Tab tab2 = bar.newTab();
		tab1.setText("Escanner");
		tab2.setText("Configurações");
		tab1.setTabListener(new MyTabListener());
		tab2.setTabListener(new MyTabListener());
		bar.addTab(tab1);
		bar.addTab(tab2);
	}
	
	private class MyTabListener implements ActionBar.TabListener{
		@Override
		public void onTabReselected(Tab tab, android.support.v4.app.FragmentTransaction ft) {}
		
		@Override
		public void onTabSelected(Tab tab, android.support.v4.app.FragmentTransaction ft) {
			
			if(tab.getPosition()==0) {
				FragmentA frag = new FragmentA();
				ft.replace(android.R.id.content, frag);
			} else {
				FragmentB frag = new FragmentB();
				ft.replace(android.R.id.content, frag);
			}
		}
		
		@Override
		public void onTabUnselected(Tab tab,android.support.v4.app.FragmentTransaction ft) {}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		   MenuInflater inflater = getSupportMenuInflater();
		   inflater.inflate(R.menu.main_menu, menu);
		   return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	   
		switch (item.getItemId()) {
		case R.id.menu_search:
			Toast.makeText(this,"Pesquisar", Toast.LENGTH_SHORT).show();
			return true;
			
		case R.id.menu_adcionar:
			Toast.makeText(this,"Adicionar", Toast.LENGTH_SHORT).show();
			return true;
			
		case R.id.menu_deletar:
			Toast.makeText(this,"Deletar", Toast.LENGTH_SHORT).show();
			return true;

		default:
	    	  return super.onOptionsItemSelected(item);
		}
	}
}
