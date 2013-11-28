package turtle.app.antibully;

import android.app.Activity;
import android.os.Bundle;

public class QuizStarterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz_starter);
		
		Button startButton = (Button) findViewById(R.id.button3);
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            finish();
	}
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quiz_starter, menu);
		return true;
	}
}

