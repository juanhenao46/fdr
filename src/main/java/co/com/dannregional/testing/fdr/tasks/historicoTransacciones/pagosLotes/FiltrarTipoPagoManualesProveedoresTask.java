package co.com.dannregional.testing.fdr.tasks.historicoTransacciones.pagosLotes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.pagosLotes.HistoricoPagosLotes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class FiltrarTipoPagoManualesProveedoresTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Click.on(BTN_LIMPIAR_TIPO_PAGO),
                esperarEnSegundos(1000),
                Click.on(DRP_TIPO_PAGO),
                Click.on(BTN_OPCION_MANUALES_PROVEEDORES),
                esperarEnSegundos(2000)
        );
    }
    public static FiltrarTipoPagoManualesProveedoresTask filtrarTipoPagoManualesProveedores() {
        return instrumented(FiltrarTipoPagoManualesProveedoresTask.class);
    }
}
