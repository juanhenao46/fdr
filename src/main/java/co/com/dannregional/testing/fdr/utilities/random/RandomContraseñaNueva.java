package co.com.dannregional.testing.fdr.utilities.random;

import java.util.Random;

public class RandomContrase├▒aNueva {

    public static String generarNuevaContrase├▒aRandom() {
        Random random = new Random();
        return "juanfelipehenaolopez" + random.nextInt((10000 - 1000)+ 1000);
    }
}