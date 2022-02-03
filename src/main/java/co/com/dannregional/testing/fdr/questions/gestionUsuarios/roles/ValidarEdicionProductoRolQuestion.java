package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.EditarProductosDelRolTask.productoAsignadoEdicion;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.LBL_SEGUNDO_PRODUCTO_ROL;

public class ValidarEdicionProductoRolQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        esperarEnSegundos(1000);
        System.out.println(LBL_SEGUNDO_PRODUCTO_ROL.resolveFor(actor).getText());
        return LBL_SEGUNDO_PRODUCTO_ROL.resolveFor(actor).getText().contains(productoAsignadoEdicion);
    }
    public static ValidarEdicionProductoRolQuestion validarEdicionProductoRol() {
        return new ValidarEdicionProductoRolQuestion();
    }
}
