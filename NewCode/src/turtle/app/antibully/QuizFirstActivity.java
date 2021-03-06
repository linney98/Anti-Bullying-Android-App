package turtle.app.antibully;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class QuizFirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz_first);
		Intent intent = getIntent();
        addListenerOnButton5Up();
		// Show the Up button in the action bar.
		setupActionBar();
	}

	private void addListenerOnButton5Up() {
		final Context context = this;
		 Button button5 = (Button) findViewById(R.id.button5);
		 Button button6 = (Button) findViewById(R.id.button6);
		 Button button7 = (Button) findViewById(R.id.button7);
		 Button button8 = (Button) findViewById(R.id.button8);
		 button5.setOnClickListener(new OnClickListener() {
			 @Override
			 public void onClick(View arg0) {
				 Toast toastc = Toast.makeText(getApplicationContext(), "Correct! :-)", Toast.LENGTH_LONG);
				 toastc.show();
				 Intent intenth = new Intent(context, QuizSecondActivity.class);
				 startActivity(intenth);
			 }
		 });
		 button7.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intenti = new Intent(context, QuizFailedActivity.class);
				 startActivity(intenti);
			}
		 });
		 button6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					Intent intenti = new Intent(context, QuizFailedActivity.class);
					 startActivity(intenti);
				}
			 });
		 button8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					Intent intenti = new Intent(context, QuizFailedActivity.class);
					 startActivity(intenti);
				}
			 });
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quiz_first, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
