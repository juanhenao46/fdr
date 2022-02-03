package co.com.dannregional.testing.fdr.tasks.autentificacion.olvidoSuContraseña;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.autentificacion.olvidoSuContraseña.OlvidoContraseña.*;
import static co.com.dannregional.testing.fdr.userinterfaces.autentificacion.logueo.FdrLogin.BTN_OLVIDO_CONTRASEÑA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class RecuperarContraseñaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(4000),
                Click.on(BTN_OLVIDO_CONTRASEÑA),
                Enter.theValue(obtener("nit")).into(TXT_NIT),
                Enter.theValue(obtener("documento")).into(TXT_DOCUMENTO),
                Enter.theValue(obtener("usuario")).into(TXT_USER),
                Enter.theValue(obtener("correo")).into(TXT_CORREO),
                Click.on(BTN_NEXT),
                esperarEnSegundos(3000)
        );
    }

    public static RecuperarContraseñaTask recuperarContraseña() {
        return instrumented(RecuperarContraseñaTask.class);
    }
}
