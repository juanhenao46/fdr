package co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.IngresarOTPTransferencias.ingresarOTPTransferencias;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.misAutorizaciones.MisAutorizaciones.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AutorizarTransaccionesSeleccionadasCheckTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                Click.on(BTN_AUTORIZAR),
                esperarEnSegundos(1000),
                Click.on(BTN_CONFIRMAR_AUTORIZAR),
                esperarEnSegundos(1000),
                ingresarOTPTransferencias()
        );
    }
    public static AutorizarTransaccionesSeleccionadasCheckTask autorizarTransaccionesSeleccionadasCheck() {
        return instrumented(AutorizarTransaccionesSeleccionadasCheckTask.class);
    }
}
