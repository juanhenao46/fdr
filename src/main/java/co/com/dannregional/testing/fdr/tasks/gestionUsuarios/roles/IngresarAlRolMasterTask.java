package co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.RolesLimites.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class IngresarAlRolMasterTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CREAR_NUEVO, isCurrentlyEnabled()),
                Click.on(DRP_FILTRO_ROLES),
                esperarEnSegundos(1000),
                Click.on(BTN_OPCION_ROL_EDITAR.of("Master")),
                esperarEnSegundos(1000),
                Click.on(BTN_TARJETA_ROL),
                esperarEnSegundos(1000)
        );
    }
    public static IngresarAlRolMasterTask ingresarAlRolMaster() {
        return instrumented(IngresarAlRolMasterTask.class);
    }
}
