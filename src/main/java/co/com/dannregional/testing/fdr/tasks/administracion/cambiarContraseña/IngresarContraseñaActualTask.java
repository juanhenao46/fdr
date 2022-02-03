package co.com.dannregional.testing.fdr.tasks.administracion.cambiarContraseña;

import co.com.dannregional.testing.fdr.utilities.random.RandomContraseñaNueva;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.cambiarContraseña.CambiarContraseña.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class IngresarContraseñaActualTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                Enter.theValue(obtener("clave")).into(TXT_CONTRASEÑA_ACTUAL),
                esperarEnSegundos(1000)
        );
    }
    public static IngresarContraseñaActualTask ingresarContraseñaActual() {
        return instrumented(IngresarContraseñaActualTask.class);
    }
}
