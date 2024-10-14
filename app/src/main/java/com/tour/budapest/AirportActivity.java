package com.tour.budapest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AirportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_airport);

        TextView textBus100ELink = findViewById(R.id.airport_bus_100e_link);

        textBus100ELink.setOnClickListener(v -> {
            Intent intent = new Intent(this, Bus100ERouteActivity.class);
            startActivity(intent);
        });
    }
}