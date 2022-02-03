package co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.pantalla;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollToTarget;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.pantalla.PantallaCuentasInscritas.*;

import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarCuentaEnElFiltroTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(obtener("titular de cuenta")).into(TXT_TITULAR_O_DESCRIPCION),
                esperarEnSegundos(1000),
                Scroll.to(TXT_TITULAR_O_DESCRIPCION)
        );
    }
    public static BuscarCuentaEnElFiltroTask buscarCuentaEnElFiltro() {
        return instrumented(BuscarCuentaEnElFiltroTask.class);
    }
}
