package co.com.dannregional.testing.fdr.utilities.random;

import java.util.Random;

public class RandomNumeroCuenta {

    public static String generarNumeroCuentaRandom() {
        Random random = new Random();
        final String numeroCuenta = String.valueOf(random.nextInt((int) ((9999999999999999L - 1000000000L) + 1000000000L)));
        return numeroCuenta;
    }
}