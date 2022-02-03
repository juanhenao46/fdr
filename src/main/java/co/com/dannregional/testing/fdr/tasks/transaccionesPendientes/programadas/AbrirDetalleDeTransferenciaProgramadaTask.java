package co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones.HistoricoTransacciones.DRP_TIPO_TRANSFERENCIA;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.misAutorizaciones.MisAutorizaciones.BTN_PRIMER_OPCION_DEL_LISTADO;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.pagos.PagosProgramados.BTN_OPCION_90_DIAS;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.pagos.PagosProgramados.DRP_RANGO_FECHA;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.transferencias.TransferenciasProgramadas.BTN_OPCION_UNICA_VEZ;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.transferencias.TransferenciasProgramadas.DRP_PERIODICIDAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirDetalleDeTransferenciaProgramadaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Click.on(DRP_PERIODICIDAD),
                Click.on(BTN_OPCION_UNICA_VEZ),
                esperarEnSegundos(2000),
                Click.on(DRP_RANGO_FECHA),
                Click.on(BTN_OPCION_90_DIAS),
                esperarEnSegundos(2000),
                Scroll.to(DRP_TIPO_TRANSFERENCIA),
                Click.on(BTN_PRIMER_OPCION_DEL_LISTADO),
                esperarEnSegundos(2000)
        );
    }
    public static AbrirDetalleDeTransferenciaProgramadaTask abrirDetalleDeTransferenciaProgramada() {
        return instrumented(AbrirDetalleDeTransferenciaProgramadaTask.class);
    }
}
