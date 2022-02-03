package co.com.dannregional.testing.fdr.tasks.historicoTransacciones.transacciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.BarraNavegacion.BTN_HISTORICO_TRANSACCIONES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;


public class AccederAlMenuHistoricoTransaccionesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_HISTORICO_TRANSACCIONES, isCurrentlyEnabled()),
                esperarEnSegundos(2000),
                Click.on(BTN_HISTORICO_TRANSACCIONES),
                esperarEnSegundos(2000)
        );
    }
    public static AccederAlMenuHistoricoTransaccionesTask accederAlMenuHistoricoTransacciones() {
        return instrumented(AccederAlMenuHistoricoTransaccionesTask.class);
    }
}
