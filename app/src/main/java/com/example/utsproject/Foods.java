package com.example.utsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Foods extends AppCompatActivity implements View.OnClickListener{

    private CardView miee, nasii, naskunn, naskerr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);

        miee = (CardView) findViewById(R.id.miez);
        nasii = (CardView) findViewById(R.id.nasiz);
        naskunn = (CardView) findViewById(R.id.naskunz);
        naskerr = (CardView) findViewById(R.id.naskerz);

        miee.setOnClickListener(this);
        nasii.setOnClickListener(this);
        naskunn.setOnClickListener(this);
        naskerr.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent n;


    }
}