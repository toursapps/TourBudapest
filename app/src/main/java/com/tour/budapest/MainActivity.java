package com.tour.budapest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textAirport;
    private TextView textPublicTransport;
    private TextView textWhatToVisit;
    private TextView textWhereToEat;
    private TextView textWhereToParty;
    private TextView textMoney;

    private ImageView imageAirport;
    private ImageView imagePublicTransport;
    private ImageView imageWhatToVisit;
    private ImageView imageWhereToEat;
    private ImageView imageWhereToParty;
    private ImageView imageMoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textAirport = (TextView) findViewById(R.id.main_text_airport);
        textPublicTransport = (TextView) findViewById(R.id.main_text_public_transport);
        textWhatToVisit = (TextView) findViewById(R.id.main_text_what_to_visit);
        textWhereToEat = (TextView) findViewById(R.id.main_text_where_to_eat);
        textWhereToParty = (TextView) findViewById(R.id.main_text_where_to_party);
        textMoney = (TextView) findViewById(R.id.main_text_money);

        imageAirport = (ImageView) findViewById(R.id.main_img_airport);
        imagePublicTransport = (ImageView) findViewById(R.id.main_img_public_transport);
        imageWhatToVisit = (ImageView) findViewById(R.id.main_img_what_to_visit);
        imageWhereToEat = (ImageView) findViewById(R.id.main_img_where_to_eat);
        imageWhereToParty = (ImageView) findViewById(R.id.main_img_where_to_party);
        imageMoney = (ImageView) findViewById(R.id.main_img_money);

        textAirport.setOnClickListener(v -> {
            Toast.makeText(this, "Airport text clicked", Toast.LENGTH_SHORT).show();
        });

        textPublicTransport.setOnClickListener(v -> {
            Toast.makeText(this, "Public Transport text clicked", Toast.LENGTH_SHORT).show();
        });

        textWhatToVisit.setOnClickListener(v -> {
            Toast.makeText(this, " What To Visit text clicked", Toast.LENGTH_SHORT).show();
        });

        textWhereToEat.setOnClickListener(v -> {
            Toast.makeText(this, "Where to Eat text clicked", Toast.LENGTH_SHORT).show();
        });

        textWhereToParty.setOnClickListener(v -> {
            Toast.makeText(this, "Where To Party text clicked", Toast.LENGTH_SHORT).show();
        });

        textMoney.setOnClickListener(v -> {
            Toast.makeText(this, "Money text clicked", Toast.LENGTH_SHORT).show();
        });

        // Images onClicks

        imageAirport.setOnClickListener(v -> {
            Toast.makeText(this, "Airport image clicked", Toast.LENGTH_SHORT).show();
        });

        imagePublicTransport.setOnClickListener(v -> {
            Toast.makeText(this, "Public Transport image clicked", Toast.LENGTH_SHORT).show();
        });

        imageWhatToVisit.setOnClickListener(v -> {
            Toast.makeText(this, " What To Visit image clicked", Toast.LENGTH_SHORT).show();
        });

        imageWhereToEat.setOnClickListener(v -> {
            Toast.makeText(this, "Where to Eat image clicked", Toast.LENGTH_SHORT).show();
        });

        imageWhereToParty.setOnClickListener(v -> {
            Toast.makeText(this, "Where To Party image clicked", Toast.LENGTH_SHORT).show();
        });

        imageMoney.setOnClickListener(v -> {
            Toast.makeText(this, "Money image clicked", Toast.LENGTH_SHORT).show();
        });
    }
}