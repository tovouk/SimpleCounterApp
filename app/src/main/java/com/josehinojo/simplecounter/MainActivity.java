package com.josehinojo.simplecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

/*
This is a very simple android application utilizing the built in onClick attribute in android's xml
for Buttons. This can be found in the res/layout/activity_main.xml file.

The purpose of this app is to show one way of creating a counter application. There are better ways,
but for this example I chose a rather quick way.
 */

public class MainActivity extends AppCompatActivity {
    //int variable to keep track of number
    private int count = 0;

    // Declare variables beforehand
    TextView counterView;
    Button addButton;
    Button subtractButton;

    //code to run on startup
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //define UI element variables
        counterView = (TextView)findViewById(R.id.counterView);
        addButton = (Button)findViewById(R.id.plusButton);
        subtractButton = (Button)findViewById(R.id.minusButton);

        updateCounter();

    }

    //decreases counter
    public void subtractCounter(View view) {
        if (count <= 0) {
            Toast.makeText(this,"We can not go lower than zero!",Toast.LENGTH_SHORT).show();
        } else {
            count -= 1;
            updateCounter();
        }
    }

    //adds to counter
    public void addCounter(View view){
        count +=1;
        updateCounter();
    }

    //sets counterView's text to the count variable
    public void updateCounter(){
        counterView.setText(String.format("%d",count));
    }
}
