package turtle.app.antibully;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
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
		 button3.setOnClickListener(new OnClickListener() {
			 @Override
			 public void onClick(View arg0) {
				 Intent intenth = new Intent(context, MainActivity.class);
				 startActivity(intenth);
			 }
		 });
	 }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}