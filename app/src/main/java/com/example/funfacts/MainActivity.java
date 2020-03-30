package com.example.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    // Declare our View Variables
    private TextView facttextview;
    private Button showfactbutton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Assign the views from the layout file to the corresponding variables
        facttextview = (TextView) findViewById(R.id.facttextView);
        showfactbutton = (Button) findViewById(R.id.showfactbutton);

        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fact = factBook.getFact();
                int color = colorWheel.getColor();
                //update the screen with our new fact
                facttextview.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showfactbutton.setTextColor(color);
            }
        };
        showfactbutton.setOnClickListener(listener);

        Toast.makeText(this, "Jai Corona", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "we'relogging");
    }
}
