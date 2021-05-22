package com.codedreams.hellowapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView text;

    Integer x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn_clear);
        text = findViewById(R.id.count);
    }

    /**
     * format number into string
     */
    protected String strFormat(Integer i) {
        return String.format(Locale.getDefault(), "%d", i);
    }

    /**
     * increment counter;
     */
    public void handleIncrement(View view) {
        x += 1;
        text.setText(strFormat(x));
    }

    /**
     * decrement counter;
     */
    public void handleDecrement(View view) {
        x -= 1;
        text.setText(strFormat(x));
    }

    /**
     * reset counter;
     */
    public void handleClean(View view) {
        x = 0;
        text.setText(strFormat(x));
    }


}