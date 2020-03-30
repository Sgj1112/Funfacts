package com.example.funfacts;

import android.graphics.Color;

import java.util.Random;

class ColorWheel {
    private String[] colors = {
            "#3079ab",
            "#53bbb4",
            "#e0ab18",
            "#f092b0",
            "#39add1",
            "#637a91",
            "#838cc7",
            "#c25975"
    };
    //Fields or member variables - Properties about the object
    //Methods - Actions  the objects can take

    int getColor() {
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        int color = Color.parseColor(colors[randomNumber]);
        return color;
    }
}
