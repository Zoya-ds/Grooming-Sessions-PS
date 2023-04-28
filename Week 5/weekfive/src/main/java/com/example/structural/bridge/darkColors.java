package com.example.structural.bridge;

import java.util.Random;

public class darkColors implements IColor {

    String colors[] = { "black", "brown", "indigo" };

    @Override
    public String chooseColor() {
        Random random = new Random();
        int ch = random.nextInt(colors.length);

        return colors[ch];
    }

}
