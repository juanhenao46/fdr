package co.com.dannregional.testing.fdr.tasks.resumen.detalleDeCuenta;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.Resumen.*;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.detalleDeCuenta.DetalleCuenta.BTN_VOLVER_AL_RESUMEN;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class VerDetalleCuentaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(3000),
                Click.on(BTN_CUENTA.of(obtener("cuenta"))),
                WaitUntil.the(BTN_VOLVER_AL_RESUMEN, isCurrentlyVisible()),
                esperarEnSegundos(3000)
        );
    }
    public static VerDetalleCuentaTask verDetalleCuenta() {
        return instrumented(VerDetalleCuentaTask.class);
    }
}
