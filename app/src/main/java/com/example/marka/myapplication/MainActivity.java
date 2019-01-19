package com.example.marka.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private int mcount;
    private TextView mshowcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowcount = (TextView) findViewById(R.id.show_count);
    }
public void countup(View view){
        mcount++;
        if (mshowcount != null){
            mshowcount.setText(Integer.toString(mcount));
        }
}
public void showtoast(View view){
        Toast toast = Toast.makeText(this, "Fuck You Dawn", Toast.LENGTH_LONG);
        toast.show();
}
}
