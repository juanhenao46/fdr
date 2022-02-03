package co.com.dannregional.testing.fdr.tasks.transferencias.bancoIris;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.dannregional.testing.fdr.tasks.transferencias.comunes.AccederAlMenuTransferenciasTask.accederAlMenuTransferencias;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.pantallaTransferencias.MenuTransferencias.BTN_CUENTAS_IRIS;

public class AccederACuentasIrisTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                accederAlMenuTransferencias(),
                esperarEnSegundos(2000),
                Click.on(BTN_CUENTAS_IRIS),
                esperarEnSegundos(2000)
        );
    }
    public static AccederACuentasIrisTask accederABancoIris () {
        return instrumented(AccederACuentasIrisTask.class);
    }
}
