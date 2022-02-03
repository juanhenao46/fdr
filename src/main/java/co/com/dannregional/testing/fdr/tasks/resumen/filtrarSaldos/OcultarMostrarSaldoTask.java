package co.com.dannregional.testing.fdr.tasks.resumen.filtrarSaldos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.Resumen.BTN_OJO_SALDO_TOTAL;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.Resumen.LBL_CIFRA_EN_MILES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class OcultarMostrarSaldoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_OJO_SALDO_TOTAL, isCurrentlyEnabled()),
                esperarEnSegundos(1000),
                Click.on(BTN_OJO_SALDO_TOTAL),
                Scroll.to(LBL_CIFRA_EN_MILES),
                Scroll.to(BTN_OJO_SALDO_TOTAL).andAlignToBottom(),
                esperarEnSegundos(2000)
        );
    }
    public static OcultarMostrarSaldoTask ocultarMostrarSaldo() {
        return instrumented(OcultarMostrarSaldoTask.class);
    }
}
