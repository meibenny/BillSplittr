package bendev.billsplittr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class PersonalPurchases extends ActionBarActivity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_personal_purchases);
		Intent intent = getIntent();
		String message = intent.getStringExtra(WelcomeScreen.EXTRA_MESSAGE);
//		TextView textView = new TextView(this);
//		textView.setTextSize(40);
//		textView.setText(message);
		
	//	setContentView(textView);
 		
	}
//
	
	public void inject(View view){
		LinearLayout linearLayout = (LinearLayout) findViewById(R.id.editTextGroupLayout);
	    EditText editTextView = new EditText(this);
	    editTextView.setGravity(Gravity.CENTER);

	    LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT,
	        LayoutParams.WRAP_CONTENT, 1);

	    editTextView.setLayoutParams(params);

	    linearLayout.addView(editTextView);
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.personal_purchases, menu);
		return true;
	}
//
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
//
////	/**
////	 * A placeholder fragment containing a simple view.
////	 */
////	public static class PlaceholderFragment extends Fragment {
////
////		public PlaceholderFragment() {
////		}
////
////		@Override
////		public View onCreateView(LayoutInflater inflater, ViewGroup container,
////				Bundle savedInstanceState) {
////			View rootView = inflater.inflate(
////					R.layout.fragment_personal_purchases, container, false);
////			return rootView;
////		}
////	}

}
