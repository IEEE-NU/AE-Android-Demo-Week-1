package com.ieee.aedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Initialize local variables for the various Views we're using
    Button helloButton;
    TextView helloText;
    EditText numberInput;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the views
        helloButton = (Button) findViewById(R.id.helloButton);
        helloText = (TextView) findViewById(R.id.helloText);
        numberInput = (EditText) findViewById(R.id.numberInput);
        checkBox = (CheckBox) findViewById(R.id.checkBox);

        // Set a listener on the button
        helloButton.setOnClickListener(this);
    }

    public int plusOne(int i) {
        return i + 1;
    }

    @Override
    public void onClick(View v) {
        // Set the text to be purple
        helloText.setTextColor(getResources().getColor(android.R.color.holo_purple));
//        helloText.setText(Integer.toString(4));

        // Set the text to the contents of the input field and clear the input field
        String num = numberInput.getText().toString();
        helloText.setText(num);
        numberInput.getText().clear();

        // Toggle the checkbox
        checkBox.toggle();
        // log a message that you can see in Android Studio in the Android Monitor -> logcat tab
        Log.i("AE Demo", "Button clicked");
    }
}
