package co.com.dannregional.testing.fdr.tasks.gestionUsuarios.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.BarraNavegacion.BTN_GESTION_USUARIOS;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.BarraNavegacion.BTN_TRANSFERENCIAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class AccederAlMenuGestionUsuariosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_GESTION_USUARIOS, isCurrentlyEnabled()),
                Click.on(BTN_GESTION_USUARIOS),
                esperarEnSegundos(1000)
        );
    }
    public static AccederAlMenuGestionUsuariosTask accederAlMenuGestionUsuarios() {
        return instrumented(AccederAlMenuGestionUsuariosTask.class);
    }
}
