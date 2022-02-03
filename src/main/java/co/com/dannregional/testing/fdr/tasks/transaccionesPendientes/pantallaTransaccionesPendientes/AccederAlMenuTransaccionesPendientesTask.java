package co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.pantallaTransaccionesPendientes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.BarraNavegacion.BTN_HISTORICO_TRANSACCIONES;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.BarraNavegacion.BTN_TRANSACCIONES_PENDIENTES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;


public class AccederAlMenuTransaccionesPendientesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Click.on(BTN_TRANSACCIONES_PENDIENTES),
                esperarEnSegundos(1000)
        );
    }
    public static AccederAlMenuTransaccionesPendientesTask accederAlMenuTransaccionesPendientes() {
        return instrumented(AccederAlMenuTransaccionesPendientesTask.class);
    }
}
