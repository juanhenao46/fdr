package co.com.dannregional.testing.fdr.tasks.historicoTransacciones.transacciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones.HistoricoTransacciones.*;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.BarraNavegacion.BTN_HISTORICO_TRANSACCIONES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;


public class FiltrarTipoTransferenciaCuentasPropiasTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Click.on(BTN_LIMPIAR_TIPO_TRANSFERENCIA),
                Click.on(DRP_TIPO_TRANSFERENCIA),
                Click.on(BTN_OPCION_CUENTAS_PROPIAS),
                esperarEnSegundos(2000)
        );
    }
    public static FiltrarTipoTransferenciaCuentasPropiasTask filtrarTipoCuentasPropias() {
        return instrumented(FiltrarTipoTransferenciaCuentasPropiasTask.class);
    }
}
