package co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.IngresarOTPTransferencias.ingresarOTPTransferencias;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.autorizacionesPendientes.AutorizacionesPendientes.BTN_CONFIRMAR_ELIMINAR;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.autorizacionesPendientes.AutorizacionesPendientes.BTN_ELIMINAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class EliminarTransaccionModalTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ELIMINAR),
                esperarEnSegundos(1000),
                Click.on(BTN_CONFIRMAR_ELIMINAR),
                esperarEnSegundos(1000),
                ingresarOTPTransferencias()
        );
    }
    public static EliminarTransaccionModalTask eliminarTransaccionModal() {
        return instrumented(EliminarTransaccionModalTask.class);
    }
}
