package turtle.app.antibully;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class QuizSecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz_second);
		// Show the Up button in the action bar.
		setupActionBar();
		buttonCorrect();
		buttonIncorrect1();
		buttonIncorrect2();
		buttonIncorrect3();
	}

	public void buttonCorrect() {
		Button buttonCorrect;
		buttonCorrect = (Button) findViewById(R.id.q2bttn4);
		final Context context = this;
		buttonCorrect.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast toastc = Toast.makeText(getApplicationContext(), "Correct! :-)", Toast.LENGTH_LONG);
				 toastc.show();
				 Intent intenth = new Intent(context, QuizThirdActivity.class);
				 startActivity(intenth);
			}
			
		});
	}
		public void buttonIncorrect1() {
			Button buttonIncorrect;
			buttonIncorrect = (Button) findViewById(R.id.q2bttn1);
			final Context context = this;
			buttonIncorrect.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					 Intent intenth = new Intent(context, QuizFailedActivity.class);
					 startActivity(intenth);
				}
				
			});
		}
		public void buttonIncorrect2() {
			Button buttonIncorrect;
			buttonIncorrect = (Button) findViewById(R.id.q2bttn2);
			final Context context = this;
			buttonIncorrect.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					 Intent intenth = new Intent(context, QuizFailedActivity.class);
					 startActivity(intenth);
				}
				
			});
		}

		public void buttonIncorrect3() {
			Button buttonIncorrect;
			buttonIncorrect = (Button) findViewById(R.id.q2bttn3);
			final Context context = this;
			buttonIncorrect.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					 Intent intenth = new Intent(context, QuizFailedActivity.class);
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
		getMenuInflater().inflate(R.menu.quiz_second, menu);
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
