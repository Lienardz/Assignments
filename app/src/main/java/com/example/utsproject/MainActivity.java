package com.example.utsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView drinkz, foodz, snackz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinkz = (CardView) findViewById(R.id.drinksz);
        foodz = (CardView) findViewById(R.id.foodsz);
        snackz = (CardView) findViewById(R.id.snacksz);

        drinkz.setOnClickListener(this);
        foodz.setOnClickListener(this);
        snackz.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent n;

        switch (view.getId()){
            case R.id.drinksz : n = new Intent(this,Drinkss.class) ; startActivity(n); break;
            case R.id.foodsz : n = new Intent(this,Foods.class) ; startActivity(n); break;
            case R.id.snacksz : n = new Intent(this,Snacks.class) ; startActivity(n); break;
            default:break;
        }
    }
}