package co.com.dannregional.testing.fdr.tasks.administracion.identificadorCuenta;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.pantallaAdmin.AdministracionPantalla.BTN_ETIQUETAS_DE_IDENTIFICACION;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.pantallaAdmin.AdministracionPantalla.BTN_IDENTIFICADOR_DE_CUENTA;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AccederAlMenuIdentificadorDeCuentaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                Click.on(BTN_IDENTIFICADOR_DE_CUENTA),
                esperarEnSegundos(1000)
        );
    }
    public static AccederAlMenuIdentificadorDeCuentaTask accederAlMenuIdentificadorDeCuenta() {
        return instrumented(AccederAlMenuIdentificadorDeCuentaTask.class);
    }
}
