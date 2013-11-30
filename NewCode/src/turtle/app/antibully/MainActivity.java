package turtle.app.antibully;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);Button startQuiz = (Button) findViewById(R.id.button1);
		startQuiz.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v2) {
				Toast.makeText(MainActivity.this, "Transferring to Quiz page!", Toast.LENGTH_LONG).show();
				startQuiz();
				
			}
		});
	}
	
	public void startQuiz() {
		Intent q = new Intent(MainActivity.this, QuizStarterActivity.class);
		startActivity(q);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
