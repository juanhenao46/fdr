package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.IngresarDatosDelRolTask.descripcionRol;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.*;

public class ValidarResumenDescripcionRolAsignadoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        esperarEnSegundos(1000);
        System.out.println(LBL_DESCRIPCION_ROL.resolveFor(actor).getText());
        return LBL_DESCRIPCION_ROL.resolveFor(actor).getText().contains(descripcionRol);
    }
    public static ValidarResumenDescripcionRolAsignadoQuestion validarResumenDescripcionRolAsignado() {
        return new ValidarResumenDescripcionRolAsignadoQuestion();
    }
}
