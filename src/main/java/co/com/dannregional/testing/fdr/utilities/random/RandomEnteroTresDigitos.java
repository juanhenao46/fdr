package co.com.dannregional.testing.fdr.utilities.random;

import java.util.Random;

public class RandomEnteroTresDigitos {

    public static String generarEnterosRandom() {
        Random random = new Random();
        return String.valueOf(random.nextInt((999 - 1000)+ 1000));
    }
}