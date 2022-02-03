package co.com.dannregional.testing.fdr.utilities.random;

import java.util.Random;

public class RandomPagoID {

    public static String generarIdentificadorPagoRandom() {
        Random random = new Random();
        return "Pagos" + random.nextInt((10000 - 1000)+ 1000);
    }
}