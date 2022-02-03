package co.com.dannregional.testing.fdr.interactions.comunes;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Esperar implements Interaction {

    private static int tiempoEspera;

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
                        Thread.sleep(tiempoEspera);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static Esperar esperarEnSegundos (int tiempo) {
        tiempoEspera = tiempo;
        return instrumented(Esperar.class);
    }
}
