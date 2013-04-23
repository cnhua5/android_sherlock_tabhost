package com.example.sherlocktest;

import com.actionbarsherlock.app.SherlockFragment;
import com.example.actionteste.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentB extends SherlockFragment {
Button button;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		 return inflater.inflate(R.layout.fragment_b, container, false);	
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		button = (Button) getActivity().findViewById(R.id.button2);
		button.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
				builder.setTitle("Fragmento B");
				builder.setMessage("s sda sa");
				builder.setPositiveButton("Confirmar", null);
				builder.setNegativeButton("Cancelar", null);
				builder.show();
			}
		});
	}
}
