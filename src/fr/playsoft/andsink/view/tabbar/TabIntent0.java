package fr.playsoft.andsink.view.tabbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TabIntent0 extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TextView tv = new TextView(this);
		
		tv.setText("This is tab 0 in Intent 0");
		
		setContentView(tv);
	}
	
}