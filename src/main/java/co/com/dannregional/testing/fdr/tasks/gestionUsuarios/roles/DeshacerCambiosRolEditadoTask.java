package co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.ClicEditarRolTask.clicEditarRol;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class DeshacerCambiosRolEditadoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                clicEditarRol(),
                WaitUntil.the(TXT_NOMBRE_ROL, isCurrentlyEnabled()),
                esperarEnSegundos(1000),
                Scroll.to(CHK_PRIMER_PRODUCTO),
                esperarEnSegundos(1000),
                Click.on(CHK_SEGUNDO_PRODUCTO),
                esperarEnSegundos(1000),
                Scroll.to(BTN_USUARIO_ASIGNAR).andAlignToBottom(),
                esperarEnSegundos(1000),
                Click.on(CHK_PERMISOS_ADMINISTRACION),
                esperarEnSegundos(1000),
                Scroll.to(BTN_USUARIO_ASIGNAR),
                esperarEnSegundos(1000),
                Click.on(BTN_ELIMINAR_MASTER_AUTORIZADOR),
                esperarEnSegundos(1000)
        );
    }
    public static DeshacerCambiosRolEditadoTask deshacerCambiosRolEditado() {
        return instrumented(DeshacerCambiosRolEditadoTask.class);
    }
}
