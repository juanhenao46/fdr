package co.com.dannregional.testing.fdr.interactions.bancoIris;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasPropias.CuentasPropias.BTN_NEXT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicEnSiguiente implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NEXT),
                esperarEnSegundos(1000)
        );
    }
    public static ClicEnSiguiente clicEnSiguiente() {
        return instrumented(ClicEnSiguiente.class);
    }
}
