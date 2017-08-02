package com.olegsagenadatrytwo.layoutsandviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "main activity";

    private EditText num1;
    private EditText num2;
    private Button bt;
    private TextView tv;

    private EditText name;
    private EditText gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.etNumberOne);
        num2 = (EditText)findViewById(R.id.etNumberTwo);
        bt = (Button)findViewById(R.id.btButton);
        tv = (TextView)findViewById(R.id.tvResult);

        name = (EditText)findViewById(R.id.name);
        gender = (EditText)findViewById(R.id.gender);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
                tv.setText(result+"");
            }
        });
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");

    }

    public void goToSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String value = num1.getText().toString();
        intent.setAction("SendingValue");
        intent.putExtra(getString(R.string.KEY_VALUE), value);
        startActivity(intent);
    }

    public void submit(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        String n = name.getText().toString();
        String g = gender.getText().toString();
        Person p = new Person(n, g);

        intent.setAction("SendingPerson");
        intent.putExtra("person", p);
        startActivity(intent);

    }
}
