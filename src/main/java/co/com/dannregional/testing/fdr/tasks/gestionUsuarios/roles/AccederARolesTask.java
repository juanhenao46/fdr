package co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.pantallaGestionUsuarios.MenuGestionUsuarios.BTN_ROLES_Y_LIMITES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AccederARolesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ROLES_Y_LIMITES, isCurrentlyEnabled()),
                Click.on(BTN_ROLES_Y_LIMITES),
                esperarEnSegundos(1000)
        );
    }
    public static AccederARolesTask accederARoles() {
        return instrumented(AccederARolesTask.class);
    }
}
