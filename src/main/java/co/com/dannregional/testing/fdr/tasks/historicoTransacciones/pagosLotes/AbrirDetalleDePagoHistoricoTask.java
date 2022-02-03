package co.com.dannregional.testing.fdr.tasks.historicoTransacciones.pagosLotes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.pagosLotes.HistoricoPagosLotes.DRP_TIPO_PAGO;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones.HistoricoTransacciones.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirDetalleDePagoHistoricoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Click.on(DRP_RANGO_FECHA),
                Click.on(BTN_OPCION_90_DIAS),
                esperarEnSegundos(1000),
                Scroll.to(DRP_TIPO_PAGO),
                Click.on(BTN_PRIMER_OPCION_DEL_LISTADO),
                esperarEnSegundos(2000)
        );
    }
    public static AbrirDetalleDePagoHistoricoTask abrirDetalleDePagoHistorico() {
        return instrumented(AbrirDetalleDePagoHistoricoTask.class);
    }
}
