package com.adnan.myfirstapp.myfirstuiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "You clicked the Toast button", Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;

        if(mTextView != null) {
            mTextView.setText(Integer.toString(mCount));
        }
    }
}