package co.com.dannregional.testing.fdr.tasks.transferencias.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.ClicEnSiguiente.clicEnSiguiente;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasPropias.CuentasPropias.BTN_NEXT;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasPropias.CuentasPropias.TXT_VALOR;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;

public class IngresarValorTask implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_VALOR, isCurrentlyEnabled()),
                esperarEnSegundos(1000),
                Enter.theValue(obtener("valor")).into(TXT_VALOR),
                esperarEnSegundos(1000),
                clicEnSiguiente()
        );
    }
    public static IngresarValorTask ingresarValor () {
        return instrumented(IngresarValorTask.class);
    }
}
