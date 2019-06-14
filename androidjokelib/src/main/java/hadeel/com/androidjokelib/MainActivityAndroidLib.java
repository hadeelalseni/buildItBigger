package hadeel.com.androidjokelib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityAndroidLib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_android_lib);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke_intent");

        TextView joke_tv = (TextView) findViewById(R.id.joke_tv);
        joke_tv.setText(joke);
    }
}
