package co.com.dannregional.testing.fdr.tasks.historicoTransacciones.transacciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones.HistoricoTransacciones.*;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.BarraNavegacion.BTN_HISTORICO_TRANSACCIONES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;


public class FiltrarTipoTransferenciaOtrosBancosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Click.on(DRP_RANGO_FECHA),
                Click.on(BTN_OPCION_90_DIAS),
                esperarEnSegundos(1000),
                Click.on(DRP_TIPO_TRANSFERENCIA),
                Click.on(BTN_OPCION_OTROS_BANCOS),
                esperarEnSegundos(2000),
                Scroll.to(DRP_TIPO_TRANSFERENCIA),
                esperarEnSegundos(1000)
        );
    }
    public static FiltrarTipoTransferenciaOtrosBancosTask filtrarTipoOtrosBancos() {
        return instrumented(FiltrarTipoTransferenciaOtrosBancosTask.class);
    }
}
