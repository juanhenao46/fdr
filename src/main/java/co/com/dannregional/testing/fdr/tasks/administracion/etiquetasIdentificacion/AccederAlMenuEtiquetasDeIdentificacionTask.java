package co.com.dannregional.testing.fdr.tasks.administracion.etiquetasIdentificacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.pantallaAdmin.AdministracionPantalla.BTN_CAMBIAR_CONTRASEÑA;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.pantallaAdmin.AdministracionPantalla.BTN_ETIQUETAS_DE_IDENTIFICACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AccederAlMenuEtiquetasDeIdentificacionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                Click.on(BTN_ETIQUETAS_DE_IDENTIFICACION),
                esperarEnSegundos(2000)
        );
    }
    public static AccederAlMenuEtiquetasDeIdentificacionTask accederAlMenuEtiquetasDeIdentificacion() {
        return instrumented(AccederAlMenuEtiquetasDeIdentificacionTask.class);
    }
}
