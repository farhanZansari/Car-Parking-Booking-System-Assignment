package com.example.carparkingbookingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SelectParking extends AppCompatActivity {

    TextView cNameView, cNumberView, cTimeView, cDateView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_parking2);
        setTitle("Select Parking");

        cNameView = (TextView)findViewById(R.id.cParkName);
        cNumberView = (TextView)findViewById(R.id.cParkNum);
        cTimeView = (TextView)findViewById(R.id.cParkTime);
        cDateView = (TextView)findViewById(R.id.cParkDate);

        Bundle b = getIntent().getExtras();
        String a = b.getString("date");
        String c = b.getString("time");
        String d = b.getString("carname");
        String e = b.getString("carnumber");



        cNameView.setText(d);
        cNumberView.setText(e);
        cTimeView.setText(c);
        cDateView.setText(a);

    }
}
