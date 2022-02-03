package co.com.dannregional.testing.fdr.tasks.autentificacion.olvidoSuContraseña;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static co.com.dannregional.testing.fdr.userinterfaces.autentificacion.olvidoSuContraseña.CrearNuevaContraseña.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class CrearNuevaContraseñaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USER, isCurrentlyEnabled()),
                Enter.theValue(obtener("user")).into(TXT_USER),
                Enter.theValue(obtener("clave")).into(TXT_NEW_PASSWORD),
                Enter.theValue(obtener("clave")).into(TXT_REPEAT_PASSWORD),
                Click.on(BTN_NEXT)
        );
    }
    public static CrearNuevaContraseñaTask crearNuevaContraseña () {
        return instrumented(CrearNuevaContraseñaTask.class);
    }
}
