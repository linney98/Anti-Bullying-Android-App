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
        addListenerOnButton5();
		// Show the Up button in the action bar.
		setupActionBar();
	}

	private void addListenerOnButton5() {
		final Context context = this;
		 Button button5 = (Button) findViewById(R.id.button5);
		 button5.setOnClickListener(new OnClickListener() {
			 @Override
			 public void onClick(View arg0) {
				 Toast toast = Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_LONG);
				 toast.show();
				 Intent intenth = new Intent(context, MainActivity.class);
				 startActivity(intenth);
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
