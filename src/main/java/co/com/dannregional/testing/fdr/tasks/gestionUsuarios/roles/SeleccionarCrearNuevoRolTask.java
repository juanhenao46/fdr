package co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.pantallaGestionUsuarios.MenuGestionUsuarios.BTN_ROLES_Y_LIMITES;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.RolesLimites.BTN_CREAR_NUEVO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class SeleccionarCrearNuevoRolTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CREAR_NUEVO, isCurrentlyEnabled()),
                Click.on(BTN_CREAR_NUEVO),
                esperarEnSegundos(1000)
        );
    }
    public static SeleccionarCrearNuevoRolTask seleccionarCrearNuevoRol() {
        return instrumented(SeleccionarCrearNuevoRolTask.class);
    }
}
