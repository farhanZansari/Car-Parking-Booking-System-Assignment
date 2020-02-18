package com.example.carparkingbookingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class parkinglist extends AppCompatActivity {


    String[] mobileArray = {"Paid Parking","Green Parking Bahar","Green Parking Dubai Opera","Green Parking Kite Beach",
            "Old Town Visitor's Parking","RTA Car parking","Boulevard Parking, P2","GreenParking Business Central Towers Car Park",
            "Dubai Design District Parking - Parking A","Parking","Wtc Parking","Parking Near Creek Park",
            "Dubai Design District visitor parking","Dubai Trade Center","Island Car Park Rental Bur Dubai",
            "Parking Dubai Creek And Souk","Car parking Zabeel Park Karama","GreenParking Murjan Car Park",
            "DHCC Parking","Car park"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parkinglist);

        ArrayAdapter adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.parkinglistview,mobileArray);

        final ListView listView = (ListView) findViewById(R.id.parking_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                String item = (String) listView.getItemAtPosition(position);
                Intent  intent = new Intent(getApplicationContext(),parkingdetail.class);
                Toast.makeText(getApplicationContext(),item,Toast.LENGTH_LONG).show();
                Bundle b =new Bundle();
                b.putString("parking_name",item);
                intent.putExtras(b);
                startActivity(intent);

            }
        });
    }
}
