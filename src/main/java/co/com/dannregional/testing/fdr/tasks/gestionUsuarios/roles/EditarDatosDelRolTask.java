package co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.*;
import static co.com.dannregional.testing.fdr.utilities.random.RandomEnteroTresDigitos.generarEnterosRandom;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class EditarDatosDelRolTask implements Task {

    public static String nombreRolEditado = "Edicion Rol Auto " + generarEnterosRandom();
    public static String descripcionRolEditado = "Edicion rol automatizado";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_NOMBRE_ROL, isCurrentlyEnabled()),
                esperarEnSegundos(1000),
                Enter.theValue(nombreRolEditado).into(TXT_NOMBRE_ROL),
                esperarEnSegundos(1000),
                Enter.theValue(descripcionRolEditado).into(TXT_DESCRIPCION),
                esperarEnSegundos(1000)
        );
    }

    public static EditarDatosDelRolTask editarDatosDelRol() {
        return instrumented(EditarDatosDelRolTask.class);
    }
}
