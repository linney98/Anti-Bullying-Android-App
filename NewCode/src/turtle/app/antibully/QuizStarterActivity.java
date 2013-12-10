package turtle.app.antibully;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class QuizStarterActivity extends Activity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_starter);
        Intent intent = getIntent();
        addListenerOnButton3();

        // Make sure we're running on Honeycomb or higher to use ActionBar APIs
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            // Show the Up button in the action bar.
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
	 public void addListenerOnButton3() {
		 final Context context = this;
		 Button button3 = (Button) findViewById(R.id.button7);
		 Button button1q = (Button) findViewById(R.id.button1q);
		 button3.setOnClickListener(new OnClickListener() {
			 @Override
			 public void onClick(View arg0) {
				 Intent intenth = new Intent(context, MainActivity.class);
				 startActivity(intenth);
			 }
		 });
			 button1q.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View arg0) {
					Intent intenti = new Intent(context, QuizFirstActivity.class);
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
			getMenuInflater().inflate(R.menu.quiz_starter, menu);
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