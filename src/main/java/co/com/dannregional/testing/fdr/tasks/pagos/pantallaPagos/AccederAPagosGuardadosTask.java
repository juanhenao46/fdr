package co.com.dannregional.testing.fdr.tasks.pagos.pantallaPagos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.pagos.guardados.PagosGuardados.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;


public class AccederAPagosGuardadosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PAGOS_GUARDADOS, isCurrentlyEnabled()),
                esperarEnSegundos(1000),
                Click.on(BTN_PAGOS_GUARDADOS),
                esperarEnSegundos(1000)
        );
    }
    public static AccederAPagosGuardadosTask accederAPagosGuardados() {
        return instrumented(AccederAPagosGuardadosTask.class);
    }
}
