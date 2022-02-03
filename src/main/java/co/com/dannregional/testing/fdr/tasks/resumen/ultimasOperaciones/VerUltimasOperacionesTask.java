package co.com.dannregional.testing.fdr.tasks.resumen.ultimasOperaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.Resumen.BTN_VER_TODO;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.ultimasOperaciones.DetalleUltimasOperaciones.LBL_SALDO_TOTAL;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.ultimasOperaciones.DetalleUltimasOperaciones.BTN_VOLVER_AL_RESUMEN;

public class VerUltimasOperacionesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_VER_TODO, isCurrentlyEnabled()),
                Scroll.to(BTN_VER_TODO).andAlignToBottom(),
                Click.on(BTN_VER_TODO),
                WaitUntil.the(LBL_SALDO_TOTAL, isPresent()),
                esperarEnSegundos(4000),
                Scroll.to(LBL_SALDO_TOTAL).andAlignToTop(),
                esperarEnSegundos(1000),
                Scroll.to(BTN_VOLVER_AL_RESUMEN).andAlignToTop()
        );
    }

    public static VerUltimasOperacionesTask verUltimasOperaciones() {
        return instrumented(VerUltimasOperacionesTask.class);
    }
}
