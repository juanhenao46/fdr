package co.com.dannregional.testing.fdr.tasks.transferencias.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.BarraNavegacion.BTN_TRANSFERENCIAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class AccederAlMenuTransferenciasTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_TRANSFERENCIAS, isCurrentlyEnabled()).forNoMoreThan(7).seconds(),
                Click.on(BTN_TRANSFERENCIAS),
                esperarEnSegundos(1000)
        );
    }
    public static AccederAlMenuTransferenciasTask accederAlMenuTransferencias () {
        return instrumented(AccederAlMenuTransferenciasTask.class);
    }
}
