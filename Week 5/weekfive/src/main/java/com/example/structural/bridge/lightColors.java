package com.example.structural.bridge;

import java.util.Random;

public class lightColors implements IColor {

    String colors[] = { "white", "beige", "sky blue", "grey" };

    @Override
    public String chooseColor() {
        Random random = new Random();
        int ch = random.nextInt(colors.length);

        return colors[ch];
    }

}
