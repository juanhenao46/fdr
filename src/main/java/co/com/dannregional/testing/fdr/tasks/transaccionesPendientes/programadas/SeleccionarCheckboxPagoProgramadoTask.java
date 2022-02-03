package co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.pagos.PagosProgramados.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


public class SeleccionarCheckboxPagoProgramadoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Scroll.to(DRP_TIPO),
                Click.on(DRP_RANGO_FECHA),
                Click.on(BTN_OPCION_90_DIAS),
                esperarEnSegundos(1000),
                WaitUntil.the(CHK_PRIMER_REGISTRO, isEnabled()),
                Click.on(CHK_PRIMER_REGISTRO),
                esperarEnSegundos(1000)
        );
    }
    public static SeleccionarCheckboxPagoProgramadoTask seleccionarCheckboxPagoProgramado() {
        return instrumented(SeleccionarCheckboxPagoProgramadoTask.class);
    }
}
