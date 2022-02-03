package co.com.dannregional.testing.fdr.tasks.historicoTransacciones.pagosLotes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.pagosLotes.HistoricoPagosLotes.*;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones.HistoricoTransacciones.BTN_OPCION_90_DIAS;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones.HistoricoTransacciones.DRP_RANGO_FECHA;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class FiltrarTipoPagoManualesNominasTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Click.on(DRP_RANGO_FECHA),
                Click.on(BTN_OPCION_90_DIAS),
                esperarEnSegundos(1000),
                Click.on(DRP_TIPO_PAGO),
                Click.on(BTN_OPCION_MANUALES_NOMINAS),
                esperarEnSegundos(2000),
                Scroll.to(DRP_TIPO_PAGO),
                esperarEnSegundos(1000)
        );
    }
    public static FiltrarTipoPagoManualesNominasTask filtrarTipoPagoManualesNominas() {
        return instrumented(FiltrarTipoPagoManualesNominasTask.class);
    }
}
