package co.com.dannregional.testing.fdr.tasks.administracion.identificadorCuenta;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.identificadorCuenta.IdentificadorDeCuentas.*;
import static co.com.dannregional.testing.fdr.utilities.random.RandomEditarNombreEtiqueta.generarEditarNombreEtiqueta;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class EditarIdentificadorDeCuentaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                Click.on(BTN_EDITAR_CUENTA),
                esperarEnSegundos(1000),
                Enter.theValue(generarEditarNombreEtiqueta()).into(TXT_NOMBRE_CUENTA),
                esperarEnSegundos(1000),
                Click.on(BTN_GUARDAR),
                esperarEnSegundos(1000)
        );
    }
    public static EditarIdentificadorDeCuentaTask editarIdentificadorDeCuenta() {
        return instrumented(EditarIdentificadorDeCuentaTask.class);
    }
}
