package com.mhalong.androidex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spin;
    TextView result;
    ImageView ImageTurtle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageTurtle = (ImageView) findViewById(R.id.ImageTurtle);
        spin = (Spinner) findViewById(R.id.tmnt);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                result = (TextView) findViewById(R.id.result);
                result.setText("You chose " + spin.getSelectedItem());
                if (position == 0) {
                    ImageTurtle.setImageResource(R.drawable.leo);
                } else if (position == 1) {
                    ImageTurtle.setImageResource(R.drawable.mike);
                } else if (position == 2) {
                    ImageTurtle.setImageResource(R.drawable.dona);
                } else if (position == 3) {
                    ImageTurtle.setImageResource(R.drawable.rap);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
