package co.com.dannregional.testing.fdr.tasks.autentificacion.logueo;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static co.com.dannregional.testing.fdr.userinterfaces.autentificacion.logueo.FdrLogin.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IngresarUsuarioTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(obtener("nit")).into(TXT_NIT),
                Enter.theValue(obtener("usuario")).into(TXT_USER),
                Enter.theValue(obtener("clave")).into(TXT_PASSWORD),
                Click.on(BTN_NEXT),
                esperarEnSegundos(16000)
        );
    }

    public static IngresarUsuarioTask ingresarUsuario () {
        return instrumented(IngresarUsuarioTask.class);
    }
}