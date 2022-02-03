package co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.inscribirCuentas.cuentasIris;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.InscribirCuentas.InscribirCuentaIris.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class IngresarNumeroDeCuentaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_NUMERO_DE_CUENTA, isEnabled()).forNoMoreThan(2).seconds(),
                Enter.theValue(obtener("numero de cuenta")).into(TXT_NUMERO_DE_CUENTA),
                Click.on(BTN_VALIDAR),
                WaitUntil.the(TXT_TIPO_DE_CUENTA, isCurrentlyVisible()).forNoMoreThan(4).seconds()
                );
    }
    public static IngresarNumeroDeCuentaTask ingresarNumeroDeCuenta() {
        return instrumented(IngresarNumeroDeCuentaTask.class);
    }
}
