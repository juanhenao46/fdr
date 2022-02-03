package co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.pagos.PagosProgramados.BTN_PRIMER_OPCION_DEL_LISTADO;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.pagos.PagosProgramados.DRP_TIPO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirDetalleDePagoProgramadoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Scroll.to(DRP_TIPO),
                Click.on(BTN_PRIMER_OPCION_DEL_LISTADO),
                esperarEnSegundos(2000)
        );
    }
    public static AbrirDetalleDePagoProgramadoTask abrirDetalleDePagoProgramado() {
        return instrumented(AbrirDetalleDePagoProgramadoTask.class);
    }
}
