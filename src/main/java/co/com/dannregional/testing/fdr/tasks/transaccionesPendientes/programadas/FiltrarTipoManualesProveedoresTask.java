package co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.pagos.PagosProgramados.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class FiltrarTipoManualesProveedoresTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                Click.on(BTN_LIMPIAR_TIPO),
                esperarEnSegundos(1000),
                Click.on(DRP_TIPO),
                Click.on(BTN_OPCION_MANUALES_PROVEEDORES),
                esperarEnSegundos(2000)
        );
    }
    public static FiltrarTipoManualesProveedoresTask filtrarTipoManualesProveedores() {
        return instrumented(FiltrarTipoManualesProveedoresTask.class);
    }
}
