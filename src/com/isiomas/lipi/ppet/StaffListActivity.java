package com.isiomas.lipi.ppet;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StaffListActivity extends Activity {
	private String[] monthsArray = { "JAN", "FEB", "MAR", "APR", "MAY", "JUNE", "JULY",
 "AUG", "SEPT", "OCT", "NOV", "DEC" };

	private ListView monthsListView;
	private ArrayAdapter arrayAdapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.staff);

		monthsListView = (ListView) findViewById(R.id.staff_list);

		// this-The current activity context.
		// Second param is the resource Id for list layout row item
		// Third param is input array 
		arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, monthsArray);
		monthsListView.setAdapter(arrayAdapter);
	}
}