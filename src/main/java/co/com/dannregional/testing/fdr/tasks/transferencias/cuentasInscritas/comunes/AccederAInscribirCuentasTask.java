package co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.pantalla.PantallaCuentasInscritas.BTN_INSCRIBIR_CUENTA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AccederAInscribirCuentasTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_INSCRIBIR_CUENTA, isCurrentlyEnabled()).forNoMoreThan(5).seconds(),
                Click.on(BTN_INSCRIBIR_CUENTA),
                esperarEnSegundos(1000)
        );
    }
    public static AccederAInscribirCuentasTask accederAInscribirCuentas() {
        return instrumented(AccederAInscribirCuentasTask.class);
    }
}
