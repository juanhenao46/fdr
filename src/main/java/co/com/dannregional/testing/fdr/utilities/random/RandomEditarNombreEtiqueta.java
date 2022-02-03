package co.com.dannregional.testing.fdr.utilities.random;

import java.util.Random;

public class RandomEditarNombreEtiqueta {

    public static String generarEditarNombreEtiqueta() {
        Random random = new Random();
        return "QAEditar" + random.nextInt((9999 - 1000)+ 1000);
    }
}