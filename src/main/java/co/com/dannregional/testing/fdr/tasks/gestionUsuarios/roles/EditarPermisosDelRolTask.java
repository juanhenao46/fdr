package co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditarPermisosDelRolTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_USUARIO_ASIGNAR).andAlignToBottom(),
                esperarEnSegundos(1000),
                Click.on(CHK_PERMISOS_ADMINISTRACION),
                esperarEnSegundos(1000)
        );
    }
    public static EditarPermisosDelRolTask editarPermisosDelRol() {
        return instrumented(EditarPermisosDelRolTask.class);
    }
}
