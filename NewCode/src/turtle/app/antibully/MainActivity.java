package turtle.app.antibully;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
		 addListenerOnButton1();
		 addListenerOnButton2();
		 addListenerOnButton3();
	 }
	 
	

	public void addListenerOnButton1() {
		 final Context context = this;
		 button1 = (Button) findViewById(R.id.quzbttn);
		 button1.setOnClickListener(new OnClickListener() {
			 @Override
			 public void onClick(View arg0) {
				 Intent intentq = new Intent(context, QuizStarterActivity.class);
				 startActivity(intentq);
			 }
		 });
	 }
			 public void addListenerOnButton2() {
				 final Context context = this;
				 button2 = (Button) findViewById(R.id.crdts);
				 button2.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						Intent intentc = new Intent(context, CrdtsActivity.class);
						startActivity(intentc);
						}
				 	});
			 }
			  public void addListenerOnButton3() {
				  final Context context = this;
				  button3 = (Button) findViewById(R.id.updtbttn);
				  button3.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dl.dropboxusercontent.com/s/c3l4enew6y0miej/Anti-BullyingApp%20ltst.apk"));
						startActivity(browserIntent);
					}
					  
				  });
			  }
	}