package co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.autorizacionesPendientes.AutorizacionesPendientes.BTN_MIS_AUTORIZACIONES;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AccederALaPesta├▒aMisAutorizacionesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Click.on(BTN_MIS_AUTORIZACIONES),
                esperarEnSegundos(3000)
        );
    }
    public static AccederALaPesta├▒aMisAutorizacionesTask accederPesta├▒aMisAutorizaciones() {
        return instrumented(AccederALaPesta├▒aMisAutorizacionesTask.class);
    }
}
