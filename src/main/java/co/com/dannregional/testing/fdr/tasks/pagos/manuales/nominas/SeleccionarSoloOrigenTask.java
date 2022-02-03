package co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.pagos.manuales.PagosManuales.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class SeleccionarSoloOrigenTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DRP_PRODUCTO_ORIGEN, isCurrentlyEnabled()),
                esperarEnSegundos(1000),
                Click.on(DRP_PRODUCTO_ORIGEN),
                Click.on(BTN_ORIGEN.of(obtener("cuenta origen"))),
                esperarEnSegundos(1000),
                Click.on(BTN_NEXT)
        );
    }
    public static SeleccionarSoloOrigenTask seleccionarSoloOrigen() {
        return instrumented(SeleccionarSoloOrigenTask.class);
    }
}
