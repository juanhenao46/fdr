package co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.misAutorizaciones.MisAutorizaciones.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirDetalleDeAutorizacionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Scroll.to(DRP_OPERACION),
                Click.on(BTN_PRIMER_OPCION_DEL_LISTADO),
                esperarEnSegundos(2000)
        );
    }
    public static AbrirDetalleDeAutorizacionTask abrirDetalleDeAutorizacion() {
        return instrumented(AbrirDetalleDeAutorizacionTask.class);
    }
}
