package co.com.dannregional.testing.fdr.tasks.transferencias.otrosBancos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.tasks.transferencias.comunes.AccederAlMenuTransferenciasTask.accederAlMenuTransferencias;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.pantallaTransferencias.MenuTransferencias.BTN_OTROS_BANCOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccederAOtrosBancosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                accederAlMenuTransferencias(),
                esperarEnSegundos(2000),
                Click.on(BTN_OTROS_BANCOS),
                esperarEnSegundos(2000)
        );
    }
    public static AccederAOtrosBancosTask accederAOtrosBancosTask() {
        return instrumented(AccederAOtrosBancosTask.class);
    }
}
