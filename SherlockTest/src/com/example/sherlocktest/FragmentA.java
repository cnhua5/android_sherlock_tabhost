package com.example.sherlocktest;

import com.actionbarsherlock.app.SherlockFragment;
import com.example.actionteste.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentA extends SherlockFragment {

	Button button;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		 return inflater.inflate(R.layout.fragment_a, container, false);	
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		button = (Button) getActivity().findViewById(R.id.button1);
		button.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getActivity(),"Fragmento A", Toast.LENGTH_SHORT).show();
			}
		});
	}
}
