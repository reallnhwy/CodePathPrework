package com.example.prework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.text);

    // User can tap on the button to change the text color of the label
    findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // change the text color of the label
            ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.red));
        }
    });

    // User can tap on the button to change the color of the background
    findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //change the color of the background color
            findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.white));
        }
    });

    // User cant tap on the button to change the text string of the label - Android is Awesome!
    findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //change the text
            ((TextView)findViewById(R.id.text)).setText("Android is Awesome!");
        }
    });

    // User can tap on the background view to reset all views to default settings

    findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // 1. Reset the text to "Hello from Y Du" id - @id/text
            textView.setText("Hello from Y Du!");

            // 2. Reset the color of the text
            // .og color - #246674 - darkblue, text id - @id/text
            textView.setTextColor(getResources().getColor(R.color.darkblue));

            // 3. Reset the color of the background
            // .og color - #fff0b4 - beige, background id - @id/parent
            findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.beige));
        }
    });

    // User can tap on the button to update with the text from the text field
    findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // change the text view to what is in the edit text view
            String userEnteredText = ((EditText)findViewById(R.id.editText)).getText().toString();
            // if the text field is empty, update label with default text String
            if(userEnteredText.isEmpty()) {
                textView.setText("Enter your own text!");
            } else {
                textView.setText(userEnteredText);
            }
        }
    });

}
}