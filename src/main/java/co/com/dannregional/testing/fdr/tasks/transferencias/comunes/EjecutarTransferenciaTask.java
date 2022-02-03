package co.com.dannregional.testing.fdr.tasks.transferencias.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.pantalla.PantallaCuentasInscritas.LBL_SPINNER_CARGA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.dannregional.testing.fdr.interactions.bancoIris.IngresarOTPTransferencias.ingresarOTPTransferencias;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasPropias.CuentasPropias.BTN_EJECUTAR_TRANSFERENCIA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class EjecutarTransferenciaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_EJECUTAR_TRANSFERENCIA, isCurrentlyEnabled()).forNoMoreThan(6).seconds(),
                WaitUntil.the(LBL_SPINNER_CARGA, isNotVisible()).forNoMoreThan(4).seconds(),
                Click.on(BTN_EJECUTAR_TRANSFERENCIA),
                ingresarOTPTransferencias(),
                esperarEnSegundos(3000)

        );
    }
    public static EjecutarTransferenciaTask ejecutarTransferencia() {
        return instrumented(EjecutarTransferenciaTask.class);
    }
}
