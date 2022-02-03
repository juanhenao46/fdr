package co.com.dannregional.testing.fdr.utilities.random;

import java.util.Random;

public class RandomNombreNuevoRol {

    public static String generarNuevoNombreRolRandom() {
        Random random = new Random();
        return "Rol automation " + random.nextInt((99999 - 10000)+ 10000);
    }
}