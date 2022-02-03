package co.com.dannregional.testing.fdr.utilities.random;

import java.util.Random;

public class RandomNombreNuevaEtiqueta {

    public static String generarNuevoNombreEtiquetaRandom() {
        Random random = new Random();
        return "QANueva" + random.nextInt((9999 - 1000)+ 1000);
    }
}