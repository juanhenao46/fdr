package co.com.dannregional.testing.fdr.tasks.historicoTransacciones.transacciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones.HistoricoTransacciones.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirDetalleDeTransferenciaHistoricoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Scroll.to(DRP_TIPO_TRANSFERENCIA),
                Click.on(DRP_ESTADO),
                Click.on(BTN_OPCION_EXITOSA),
                esperarEnSegundos(2000),
                Click.on(BTN_PRIMER_OPCION_DEL_LISTADO),
                esperarEnSegundos(2000)
        );
    }
    public static AbrirDetalleDeTransferenciaHistoricoTask abrirDetalleDeTransferenciaHistorico() {
        return instrumented(AbrirDetalleDeTransferenciaHistoricoTask.class);
    }
}
