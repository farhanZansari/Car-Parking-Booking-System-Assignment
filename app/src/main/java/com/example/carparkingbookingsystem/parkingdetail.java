package com.example.carparkingbookingsystem;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class parkingdetail extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parkingdetail);
        ImageView image_parking = (ImageView)findViewById(R.id.image_parking);
        Bundle b = getIntent().getExtras();
        TextView parkingName=(TextView)findViewById(R.id.parkingName);
        TextView parkingDetail=(TextView)findViewById(R.id.parkingDetails);
        String pName = b.getString("parking_name");
        parkingName.setText(b.getString("parking_name"));
        String[] title = {"Paid Parking","Green Parking Bahar","Green Parking Dubai Opera","Green Parking Kite Beach",
                "Old Town Visitor's Parking","RTA Car parking","Boulevard Parking, P2","GreenParking Business Central Towers Car Park",
                "Dubai Design District Parking - Parking A","Parking","Wtc Parking","Parking Near Creek Park",
                "Dubai Design District visitor parking","Dubai Trade Center","Island Car Park Rental Bur Dubai",
                "Parking Dubai Creek And Souk","Car parking Zabeel Park Karama","GreenParking Murjan Car Park",
                "DHCC Parking","Car park"};
        if ( b.getString("parking_name").equals(title[0])){
            parkingDetail.setText("Parking Lot\n" +
                    "United Arab Emirates");
            image_parking.setImageDrawable(getDrawable(R.drawable.car1));
        } else if (b.getString("parking_name").equals(title[1])){
            parkingDetail.setText("PArking Garage\n" +
                    "Dubai-United Arab Emirates\n" +
                    "Address: Bahar 5 - شارع الممشى - Dubai - United Arab Emirates\n" +
                    "Phone: +971 800 7275464");
            image_parking.setImageDrawable(getDrawable(R.drawable.car2));
        } else if (b.getString("parking_name").equals(title[2])){
            parkingDetail.setText("Parking Garage \n" +
                    "Dubai-United Arab Emirates\n" +
                    "Address: Sheikh Mohammed bin Rashid Blvd - Dubai - United Arab Emirates\n" +
                    "Phone: +971 800 7275464");
            image_parking.setImageDrawable(getDrawable(R.drawable.car3));
        } else if (b.getString("parking_name").equals(title[3])){
            parkingDetail.setText("Parking lot\n" +
                    "Dubai-United Arab Emirates\n" +
                    "Address: Dubai Kite Beach - Dubai - United Arab Emirates\n" +
                    "Phone: +971 800 7275464");
            image_parking.setImageDrawable(getDrawable(R.drawable.car4));
        } else if (b.getString("parking_name").equals(title[4])){
            parkingDetail.setText("Parking lot\n" +
                    "Dubai-United Arab Emirates\n" +
                    "Address: Emaar Blvd - Dubai - United Arab Emirates");
            image_parking.setImageDrawable(getDrawable(R.drawable.car5));
        } else if (b.getString("parking_name").equals(title[5])){
            parkingDetail.setText("Parking lot\n" +
                    "Dubai-United Arab Emirates\n" +
                    "Address: 19 3 B St - Dubai - United Arab Emirates\n" +
                    "Phone: +971 50 626 3251");
            image_parking.setImageDrawable(getDrawable(R.drawable.car6));
        } else if (b.getString("parking_name").equals(title[6])){
            parkingDetail.setText("Parking lot\n" +
                    "Dubai-United Arab Emirates\n" +
                    "Address: 29 Boulevard Tower 1 - 13a Sheikh Mohammed bin Rashid Blvd - Dubai - United Arab Emirates");
            image_parking.setImageDrawable(getDrawable(R.drawable.car7));
        } else if (b.getString("parking_name").equals(title[7])){
            parkingDetail.setText("Parking garage\n" +
                    "Dubai-United Arab Emirates\n" +
                    "Address: Business Central Towers - Dubai - United Arab Emirates\n" +
                    "Phone: +971 800 7275464");
            image_parking.setImageDrawable(getDrawable(R.drawable.car8));
        } else if (b.getString("parking_name").equals(title[8])){
            parkingDetail.setText("Parking lot\n" +
                    "Dubai-United Arab Emirates\n" +
                    "Address: Dubai - United Arab Emirates");
            image_parking.setImageDrawable(getDrawable(R.drawable.car9));
        } else if (b.getString("parking_name").equals(title[9])){
            parkingDetail.setText("Parking lot\n" +
                    "Dubai - United Arab Emirates\n" +
                    "Address: 12 4 A St - Dubai - United Arab Emirates\n" +
                    "Phone: +971 800 9090");
            image_parking.setImageDrawable(getDrawable(R.drawable.car10));
        } else if (b.getString("parking_name").equals(title[10])){
            parkingDetail.setText("Parking lot\n" +
                    "Dubai - United Arab Emirates\n" +
                    "Address: 4 7th St - Dubai - United Arab Emirates");
            image_parking.setImageDrawable(getDrawable(R.drawable.car11));
        } else if (b.getString("parking_name").equals(title[11])){
            parkingDetail.setText("Parking lot\n" +
                    "Dubai - United Arab Emirates\n" +
                    "Address: Dubai - United Arab Emirates");
            image_parking.setImageDrawable(getDrawable(R.drawable.car12));
        } else if (b.getString("parking_name").equals(title[12])){
            parkingDetail.setText("Parking lot\n" +
                    "Dubai - United Arab Emirates\n" +
                    "Open 24 hours");
            image_parking.setImageDrawable(getDrawable(R.drawable.car13));
        } else if (b.getString("parking_name").equals(title[13])){
            parkingDetail.setText("Parking lot\n" +
                    "Dubai - United Arab Emirates\n" +
                    "Address: 6 7th St - Dubai - United Arab Emirates");
            image_parking.setImageDrawable(getDrawable(R.drawable.car14));
        } else if (b.getString("parking_name").equals(title[14])){
            parkingDetail.setText("Parking lot\n" +
                    "Dubai - United Arab Emirates\n" +
                    "Address: Unnamed Road - Dubai - United Arab Emirates\n" +
                    "Phone: +971 55 455 4471");
            image_parking.setImageDrawable(getDrawable(R.drawable.car15));
        } else if (b.getString("parking_name").equals(title[15])){
            parkingDetail.setText("Parking lot\n" +
                    "Dubai - United Arab Emirates\n" +
                    "Address: 2 Al Falah St - Dubai - United Arab Emirates");
            image_parking.setImageDrawable(getDrawable(R.drawable.car16));
        } else if (b.getString("parking_name").equals(title[16])){
            parkingDetail.setText("Parking lot\n" +
                    "Dubai - United Arab Emirates\n" +
                    "Open ⋅ Closes 10PM\n" +
                    "Address: United Arab Emirates - Dubai - United Arab Emirates\n" +
                    "Phone: +971 800 600");
            image_parking.setImageDrawable(getDrawable(R.drawable.car17));
        } else if (b.getString("parking_name").equals(title[17])){
            parkingDetail.setText("Parking garage\n" +
                    "Dubai - United Arab Emirates\n" +
                    "Open 24 hours\n" +
                    "Address: Murjan - Dubai - United Arab Emirates\n" +
                    "Phone: +971 800 7275464");
            image_parking.setImageDrawable(getDrawable(R.drawable.car18));
        } else if (b.getString("parking_name").equals(title[18])){
            parkingDetail.setText("Parking garage\n" +
                    "Dubai - United Arab Emirates\n" +
                    "Address: 267 Oud Metha Rd - Dubai - United Arab Emirates");
            image_parking.setImageDrawable(getDrawable(R.drawable.car19));
        } else if (b.getString("parking_name").equals(title[19])){
            parkingDetail.setText("Parking lot\n" +
                    "Dubai - United Arab Emirates\n" +
                    "Address: Dubai - United Arab Emirates");
            image_parking.setImageDrawable(getDrawable(R.drawable.car20));
        }

    }
}
