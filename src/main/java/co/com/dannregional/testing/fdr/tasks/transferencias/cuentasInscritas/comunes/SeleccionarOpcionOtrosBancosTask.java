package co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.InscribirCuentas.InscribirCuentaOtrosBancos.BTN_OTROS_BANCOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcionOtrosBancosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                Click.on(BTN_OTROS_BANCOS)
        );
    }
    public static SeleccionarOpcionOtrosBancosTask seleccionarOpcionOtrosBancos() {
        return instrumented(SeleccionarOpcionOtrosBancosTask.class);
    }
}
