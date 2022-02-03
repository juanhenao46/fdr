package co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.BarraNavegacion.BTN_TRANSACCIONES_PENDIENTES;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.pantallaTransaccionesPendientes.TransaccionesPendientes.BTN_PROGRAMADAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AccederAlMenuProgramadasTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Click.on(BTN_PROGRAMADAS),
                esperarEnSegundos(1000)
        );
    }
    public static AccederAlMenuProgramadasTask accederAlMenuProgramadas() {
        return instrumented(AccederAlMenuProgramadasTask.class);
    }
}
