package com.olegsagenadatrytwo.layoutsandviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        switch (intent.getAction()){
            case "SendingPerson":

                Person person = (Person) intent.getSerializableExtra("person");

                Log.d(TAG, "onCreate: " + person.getName() + " " + person.gender);
                break;
            case "SendingValue":
                String v = intent.getStringExtra(getString(R.string.KEY_VALUE));

                tv = (TextView)findViewById(R.id.text);
                tv.setText(v);
                break;
        }

    }
}
