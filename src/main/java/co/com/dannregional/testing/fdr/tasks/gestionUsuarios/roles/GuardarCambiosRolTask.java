package co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.IngresarOTPTransferencias.ingresarOTPTransferencias;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.EditarRol.BTN_GUARDAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GuardarCambiosRolTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_GUARDAR),
                ingresarOTPTransferencias()
        );
    }

    public static GuardarCambiosRolTask guardarCambiosRol() {
        return instrumented(GuardarCambiosRolTask.class);
    }
}
