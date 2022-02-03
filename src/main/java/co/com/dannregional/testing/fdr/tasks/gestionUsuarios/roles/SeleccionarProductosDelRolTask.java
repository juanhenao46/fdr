package co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.ClicEnSiguiente.clicEnSiguiente;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class SeleccionarProductosDelRolTask implements Task {

    public static String productoAsignado;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CHK_PRIMER_PRODUCTO, isCurrentlyEnabled()),
                Click.on(CHK_PRIMER_PRODUCTO),
                esperarEnSegundos(1000)
        );
        productoAsignado = CHK_PRIMER_PRODUCTO.resolveFor(actor).getText();

    }
    public static SeleccionarProductosDelRolTask seleccionarProductosDelRol() {
        return instrumented(SeleccionarProductosDelRolTask.class);
    }
}
