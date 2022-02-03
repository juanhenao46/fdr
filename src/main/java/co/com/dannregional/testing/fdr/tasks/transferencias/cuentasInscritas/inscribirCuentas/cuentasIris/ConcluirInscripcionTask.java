package co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.inscribirCuentas.cuentasIris;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.InscribirCuentas.InscribirCuentaIris.BTN_CONCLUIR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConcluirInscripcionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CONCLUIR),
                esperarEnSegundos(2000)
        );
    }
    public static ConcluirInscripcionTask concluirInscripcion() {
        return instrumented(ConcluirInscripcionTask.class);
    }
}
