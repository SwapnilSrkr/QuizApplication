package com.example.android.quizapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        CardView phy = findViewById(R.id.phy_card);
        // Set a click listener on that View
        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phyIntent = new Intent(PlayActivity.this, PhysicsActivity.class);
                startActivity(phyIntent);
            }
        });

        CardView chem = findViewById(R.id.chem_card);
        // Set a click listener on that View
        chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chemIntent = new Intent(PlayActivity.this, ChemistryActivity.class);
                startActivity(chemIntent);
            }
        });

        CardView bio = findViewById(R.id.bio_card);
        // Set a click listener on that View
        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bioIntent = new Intent(PlayActivity.this, BiologyActivity.class);
                startActivity(bioIntent);
            }
        });

        CardView more = findViewById(R.id.more_card);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Patience is the key";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
}