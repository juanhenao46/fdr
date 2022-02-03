package co.com.dannregional.testing.fdr.tasks.pagos.pantallaPagos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.BarraNavegacion.BTN_PAGOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;


public class AccederAlMenuPagosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PAGOS, isCurrentlyEnabled()).forNoMoreThan(6).seconds(),
                Click.on(BTN_PAGOS),
                esperarEnSegundos(1000)
        );
    }
    public static AccederAlMenuPagosTask accederAlMenuPagos() {
        return instrumented(AccederAlMenuPagosTask.class);
    }
}
