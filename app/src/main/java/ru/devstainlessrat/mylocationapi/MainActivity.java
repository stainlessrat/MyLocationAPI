package ru.devstainlessrat.mylocationapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button startLocationUpdatesButton, stopLocationUpdatesButton;
    private TextView locationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        startLocationUpdatesButton = findViewById(R.id.start_location_updates_button);
        stopLocationUpdatesButton = findViewById(R.id.stop_location_updates_button);
        locationTextView = findViewById(R.id.locaciot_text_view);
    }
}
