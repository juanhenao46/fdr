package co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.pagos.manuales.PagosManuales.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GuardarPagoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                Click.on(BTN_GUARDAR_PAGO),
                esperarEnSegundos(1000)
        );
    }
    public static GuardarPagoTask guardarPago() {
        return instrumented(GuardarPagoTask.class);
    }
}
