package co.com.dannregional.testing.fdr.tasks.historicoTransacciones.pagosLotes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.pagosLotes.HistoricoPagosLotes.BTN_HISTORICO_PAGOS_LOTES;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AccederAlHistoricoPagosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                Click.on(BTN_HISTORICO_PAGOS_LOTES),
                esperarEnSegundos(2000)
        );
    }
    public static AccederAlHistoricoPagosTask accederAlHistoricoPagos() {
        return instrumented(AccederAlHistoricoPagosTask.class);
    }
}
