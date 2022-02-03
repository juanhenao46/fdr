package co.com.dannregional.testing.fdr.tasks.pagos.pantallaPagos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.pagos.manuales.PagosManuales.BTN_PAGOS_MANUALES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;


public class AccederAPagosManualesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PAGOS_MANUALES, isCurrentlyEnabled()).forNoMoreThan(6).seconds(),
                Click.on(BTN_PAGOS_MANUALES),
                esperarEnSegundos(1000)
        );
    }
    public static AccederAPagosManualesTask accederAPagosManuales() {
        return instrumented(AccederAPagosManualesTask.class);
    }
}
