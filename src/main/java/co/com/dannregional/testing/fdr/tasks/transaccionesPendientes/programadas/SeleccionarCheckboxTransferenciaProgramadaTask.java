package co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.pagos.PagosProgramados.BTN_OPCION_90_DIAS;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.pagos.PagosProgramados.DRP_RANGO_FECHA;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.transferencias.TransferenciasProgramadas.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SeleccionarCheckboxTransferenciaProgramadaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Scroll.to(DRP_PERIODICIDAD),
                Click.on(DRP_PERIODICIDAD),
                Click.on(BTN_OPCION_UNICA_VEZ),
                esperarEnSegundos(2000),
                Click.on(DRP_RANGO_FECHA),
                Click.on(BTN_OPCION_90_DIAS),
                esperarEnSegundos(2000),
                Click.on(CHK_PRIMER_REGISTRO),
                esperarEnSegundos(1000)
        );
    }
    public static SeleccionarCheckboxTransferenciaProgramadaTask seleccionarCheckboxTransferenciaProgramada() {
        return instrumented(SeleccionarCheckboxTransferenciaProgramadaTask.class);
    }
}
