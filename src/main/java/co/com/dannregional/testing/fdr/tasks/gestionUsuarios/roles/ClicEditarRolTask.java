package co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.EditarRol.BTN_EDITAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicEditarRolTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_EDITAR),
                esperarEnSegundos(1000)
        );
    }
    public static ClicEditarRolTask clicEditarRol() {
        return instrumented(ClicEditarRolTask.class);
    }
}
