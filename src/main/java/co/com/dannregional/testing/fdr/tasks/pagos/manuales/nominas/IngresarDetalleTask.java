package co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.pagos.manuales.PagosManuales.*;
import static co.com.dannregional.testing.fdr.utilities.random.RandomPagoID.generarIdentificadorPagoRandom;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class IngresarDetalleTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_IDENTIFICACION, isCurrentlyEnabled()),
                esperarEnSegundos(1000),
                Enter.theValue(generarIdentificadorPagoRandom()).into(TXT_IDENTIFICACION),
                esperarEnSegundos(3000),
                Click.on(BTN_NEXT)
        );
    }
    public static IngresarDetalleTask ingresarDetalle() {
        return instrumented(IngresarDetalleTask.class);
    }
}
