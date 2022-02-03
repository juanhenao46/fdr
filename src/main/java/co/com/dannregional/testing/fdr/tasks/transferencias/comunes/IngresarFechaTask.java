package co.com.dannregional.testing.fdr.tasks.transferencias.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasPropias.CuentasPropias.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class IngresarFechaTask implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
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
    public static IngresarFechaTask ingresarFecha () {
        return instrumented(IngresarFechaTask.class);
    }
}
