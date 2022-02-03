package co.com.dannregional.testing.fdr.tasks.pagos.guardados;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.tasks.pagos.pantallaPagos.AccederAPagosGuardadosTask.accederAPagosGuardados;
import static co.com.dannregional.testing.fdr.tasks.pagos.pantallaPagos.AccederAlMenuPagosTask.accederAlMenuPagos;
import static co.com.dannregional.testing.fdr.userinterfaces.pagos.guardados.PagosGuardados.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditarPagoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                accederAlMenuPagos(),
                accederAPagosGuardados(),
                Click.on(DRP_OPCIONES),
                Click.on(BTN_OPCION_EDITAR),
                esperarEnSegundos(2000)
        );
    }
    public static EditarPagoTask editarPago() {
        return instrumented(EditarPagoTask.class);
    }
}
