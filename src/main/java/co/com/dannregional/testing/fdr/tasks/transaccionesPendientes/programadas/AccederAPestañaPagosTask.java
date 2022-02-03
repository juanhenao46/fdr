package co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.pagos.PagosProgramados.BTN_PESTAÑA_PAGOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AccederAPestañaPagosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                Click.on(BTN_PESTAÑA_PAGOS),
                esperarEnSegundos(1000)
        );
    }
    public static AccederAPestañaPagosTask accederAPestañaPagos() {
        return instrumented(AccederAPestañaPagosTask.class);
    }
}
