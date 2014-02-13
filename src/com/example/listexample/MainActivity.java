package com.example.listexample;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
	private TextView selection;
	ListView list;
	private static final String[] items={"lorem", "ipsum", "dolor",
		"sit", "amet", "consectetuer", "adipiscing", "elit", "morbi", "vel",
		"ligula", "vitae", "arcu", "aliquet", "mollis",
		"etiam", "vel", "erat", "placerat", "ante",
		"porttitor", "sodales", "pellentesque", "augue", "purus"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		selection=(TextView)findViewById(R.id.selection);
		
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_activated_1, items));
	}

	public void onListItemClick(ListView parent, View v, int position,
			long id) {
		selection.setText(items[position]);
	}

}
