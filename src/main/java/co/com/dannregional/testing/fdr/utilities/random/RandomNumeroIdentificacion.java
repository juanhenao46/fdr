package co.com.dannregional.testing.fdr.utilities.random;

import java.util.Random;

public class RandomNumeroIdentificacion {

    public static String generarNumeroIdentificacionRandom() {
        Random random = new Random();
        return String.valueOf(random.nextInt((99999999 - 1000)+ 1000));
    }
}