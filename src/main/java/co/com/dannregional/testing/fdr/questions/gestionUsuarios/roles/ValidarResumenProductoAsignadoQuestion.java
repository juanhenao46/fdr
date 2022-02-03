package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.SeleccionarProductosDelRolTask.productoAsignado;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.LBL_PRIMER_PRODUCTO_ROL;

public class ValidarResumenProductoAsignadoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        esperarEnSegundos(1000);
        System.out.println(LBL_PRIMER_PRODUCTO_ROL.resolveFor(actor).getText());
        return LBL_PRIMER_PRODUCTO_ROL.resolveFor(actor).getText().contains(productoAsignado);
    }
    public static ValidarResumenProductoAsignadoQuestion validarResumenProductoAsignado() {
        return new ValidarResumenProductoAsignadoQuestion();
    }
}
