package com.example.carparkingbookingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

public class SelectSchedule extends AppCompatActivity implements
        View.OnClickListener{

    TextView carNameView, carNumberView;
    Button btnDatePicker, btnTimePicker, btnSelectParking;
    TextInputEditText txtDate, txtTime;
    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_parking);
        setTitle("Schedule Date|Time");

        carNameView = findViewById(R.id.setCname);
        carNumberView = findViewById(R.id.setCnumber);

        btnDatePicker=(Button)findViewById(R.id.btn_date);
        btnTimePicker=(Button)findViewById(R.id.btn_time);
        btnSelectParking=(Button)findViewById(R.id.selectParking);
        txtDate=(TextInputEditText) findViewById(R.id.in_date);
        txtTime=(TextInputEditText) findViewById(R.id.in_time);

        btnDatePicker.setOnClickListener(this);
        btnTimePicker.setOnClickListener(this);

        Intent intent = getIntent();
        String cName = intent.getStringExtra("name");
        String cNumber = intent.getStringExtra("number");

        carNameView.setText(cName);
        carNumberView.setText(cNumber);

        btnSelectParking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inet =new Intent(SelectSchedule.this,SelectParking.class);
                Toast.makeText(getApplicationContext(),txtDate.getText().toString(),Toast.LENGTH_LONG).show();
                Bundle b = new Bundle();
                b.putString("date",txtDate.getText().toString());
                b.putString("time",txtTime.getText().toString());
                b.putString("carname",carNameView.getText().toString());
                b.putString("carnumber",carNumberView.getText().toString());
                inet.putExtras(b);
                startActivity(inet);
                finish();
            }
        });






    }
    @Override
    public void onClick(View v) {

        if (v == btnDatePicker) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
        if (v == btnTimePicker) {

            // Get Current Time
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            // Launch Time Picker Dialog
            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {

                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay,
                                              int minute) {

                            txtTime.setText(hourOfDay + ":" + minute);
                        }
                    }, mHour, mMinute, false);
            timePickerDialog.show();
        }
    }
}
