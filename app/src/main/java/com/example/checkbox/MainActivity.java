package com.example.checkbox;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox ch, ch1, ch2, ch3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finding CheckBox by its unique ID
        ch = findViewById(R.id.checkBox);
        ch1 = findViewById(R.id.checkBox2);
        ch2 = findViewById(R.id.checkBox3);
        ch3 = findViewById(R.id.checkBox4);
    }
    public void Check(View v) {
        StringBuilder msg = new StringBuilder();

        if (ch.isChecked())
            msg.append(getString(R.string.painting_));
        if (ch1.isChecked())
            msg.append(getString(R.string.drawing_));
        if (ch2.isChecked())
            msg.append(getString(R.string.mad_experiment));
        if (ch3.isChecked())
            msg.append(getString(R.string.checkbox_));
        // Toast is created to display the
        // message using show() method.
        Toast.makeText(this, msg.toString().trim() + " are selected",
                Toast.LENGTH_LONG).show();
    }
}