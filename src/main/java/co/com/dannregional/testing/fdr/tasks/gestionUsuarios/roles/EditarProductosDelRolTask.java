package co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.interactions.comunes.Scrollear.scrollearHasta;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.CHK_PRIMER_PRODUCTO;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.CHK_SEGUNDO_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditarProductosDelRolTask implements Task {

    public static String productoAsignadoEdicion;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                scrollearHasta(CHK_PRIMER_PRODUCTO),
                esperarEnSegundos(1000),
                Click.on(CHK_SEGUNDO_PRODUCTO),
                esperarEnSegundos(1000)
        );
        productoAsignadoEdicion = CHK_SEGUNDO_PRODUCTO.resolveFor(actor).getText();

    }
    public static EditarProductosDelRolTask editarProductosDelRol() {
        return instrumented(EditarProductosDelRolTask.class);
    }
}
