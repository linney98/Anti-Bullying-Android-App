package turtle.app.antibully;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	 public Button button1;
	 public Button button2;
	 public Button button3;
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 setContentView(R.layout.activity_main);
		 addListenerOnButton();
	 }
	 
	 public void addListenerOnButton() {
		 final Context context = this;
		 button1 = (Button) findViewById(R.id.button1);
		 button1.setOnClickListener(new OnClickListener() {
			 @Override
			 public void onClick(View arg0) {
				 Intent intentq = new Intent(context, QuizStarterActivity.class);
				 startActivity(intentq);
			 }
		 });
	 }
	 
	}