package co.com.dannregional.testing.fdr.tasks.salir;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static co.com.dannregional.testing.fdr.userinterfaces.salir.cerrarSesión.CerrarSesion.*;

public class CerrarSesionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_SALIR, isEnabled()),
                Scroll.to(BTN_SALIR).andAlignToTop(),
                Click.on(BTN_SALIR),
                WaitUntil.the(BTN_CONFIRMAR_SALIR, isEnabled()),
                Click.on(BTN_CONFIRMAR_SALIR)
        );
    }
    public static CerrarSesionTask cerrarSesion() {
        return instrumented(CerrarSesionTask.class);
    }
}
