package com.example.carparkingbookingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText cName, cNumber;
    Button nbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Enter Car Info");

        cName = findViewById(R.id.carName);
        cNumber = findViewById(R.id.carNumber);
        nbtn = findViewById(R.id.button);


        nbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String carName = cName.getText().toString();
                final String carNumber = cNumber.getText().toString();
                if (carName.isEmpty()){
                    cName.setError("Please Enter Car Name!");
                    cName.requestFocus();
                }else if (carNumber.isEmpty()){
                    cNumber.setError("Please Enter Car Number!");
                    cNumber.requestFocus();
                }else if (carName.isEmpty()&&carNumber.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please Enter the information",Toast.LENGTH_LONG).show();
                }else {
                    nbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(MainActivity.this, SelectSchedule.class);
                            i.putExtra("name",carName);
                            i.putExtra("number",carNumber);
                            startActivity(i);
                            finish();
                        }
                    });
                }
            }
        });


    }
}
