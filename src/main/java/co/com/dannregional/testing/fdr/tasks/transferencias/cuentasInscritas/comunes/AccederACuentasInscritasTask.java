package co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;

import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.pantalla.PantallaCuentasInscritas.LBL_SPINNER_CARGA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.tasks.transferencias.comunes.AccederAlMenuTransferenciasTask.accederAlMenuTransferencias;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.pantallaTransferencias.MenuTransferencias.BTN_CUENTAS_INSCRITAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccederACuentasInscritasTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                accederAlMenuTransferencias(),
                WaitUntil.the(BTN_CUENTAS_INSCRITAS, isCurrentlyEnabled()).forNoMoreThan(6).seconds(),
                Click.on(BTN_CUENTAS_INSCRITAS),
                WaitUntil.the(LBL_SPINNER_CARGA, isNotVisible()).forNoMoreThan(4).seconds()
                );
    }
    public static AccederACuentasInscritasTask accederACuentasInscritas () {
        return instrumented(AccederACuentasInscritasTask.class);
    }
}
