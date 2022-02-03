package co.com.dannregional.testing.fdr.utilities.random;

import java.util.Random;

public class RandomNombreLote {

    public static String genenrarNuevoNombreLote() {
        Random random = new Random();
        return "Lotes " + random.nextInt((99999 - 10000)+ 10000);
    }
}