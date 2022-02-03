package co.com.dannregional.testing.fdr.tasks.administracion.notificaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.pantallaAdmin.AdministracionPantalla.BTN_IDENTIFICADOR_DE_CUENTA;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.pantallaAdmin.AdministracionPantalla.BTN_NOTIFICACIONES;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AccederAlMenuNotificacionesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                Click.on(BTN_NOTIFICACIONES),
                esperarEnSegundos(1000)
        );
    }
    public static AccederAlMenuNotificacionesTask accederAlMenuNotificaciones() {
        return instrumented(AccederAlMenuNotificacionesTask.class);
    }
}
