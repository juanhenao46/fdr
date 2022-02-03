package co.com.dannregional.testing.fdr.tasks.transferencias.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.tasks.transferencias.comunes.IngresarOrigenYDestinoTask.ingresarOrigenYDestino;
import static co.com.dannregional.testing.fdr.tasks.transferencias.comunes.IngresarValorTask.ingresarValor;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasPropias.CuentasPropias.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TransferenciaExitosaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ingresarOrigenYDestino(),
                ingresarValor(),
                esperarEnSegundos(1000),
                Click.on(BTN_NEXT),
                esperarEnSegundos(1000),
                Click.on(BTN_NEXT)
        );
    }
    public static TransferenciaExitosaTask transferenciaCuentasPropiasExitosa () {
        return instrumented(TransferenciaExitosaTask.class);
    }
}
