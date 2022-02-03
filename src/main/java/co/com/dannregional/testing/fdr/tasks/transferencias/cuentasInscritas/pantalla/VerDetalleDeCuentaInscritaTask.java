package co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.pantalla;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.pantalla.PantallaCuentasInscritas.BTN_CUENTA;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerDetalleDeCuentaInscritaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CUENTA.of(obtener("numero de cuenta"))),
                esperarEnSegundos(1000)
        );
    }
    public static VerDetalleDeCuentaInscritaTask verDetalleDeCuentaInscrita() {
        return instrumented(VerDetalleDeCuentaInscritaTask.class);
    }
}
