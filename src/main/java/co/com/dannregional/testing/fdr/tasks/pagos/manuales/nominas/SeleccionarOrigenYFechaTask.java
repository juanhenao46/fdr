package co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.pagos.manuales.PagosManuales.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOrigenYFechaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                Click.on(TXT_FECHA_EJECUCION),
                esperarEnSegundos(1000),
                Click.on(BTN_MESES),
                esperarEnSegundos(1000),
                Click.on(BTN_MES.of(obtener("mes"))),
                esperarEnSegundos(1000),
                Click.on(BTN_DIA.of(obtener("dia"))),
                esperarEnSegundos(1000),
                Click.on(BTN_NEXT)
        );
    }
    public static SeleccionarOrigenYFechaTask seleccionarOrigenYFecha() {
        return instrumented(SeleccionarOrigenYFechaTask.class);
    }
}
