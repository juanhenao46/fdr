package co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.EditarRol.DRP_EDITAR_AUTORIZADORES_CUENTAS_PROPIAS;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.BTN_OPCION_MASTER;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.BTN_USUARIO_ASIGNAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditarAutorizadoresDelRolTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_USUARIO_ASIGNAR),
                esperarEnSegundos(1000),
                Click.on(DRP_EDITAR_AUTORIZADORES_CUENTAS_PROPIAS),
                esperarEnSegundos(1000),
                Click.on(BTN_OPCION_MASTER),
                esperarEnSegundos(1000)
        );
    }

    public static EditarAutorizadoresDelRolTask editarAutorizadoresDelRol() {
        return instrumented(EditarAutorizadoresDelRolTask.class);
    }
}
