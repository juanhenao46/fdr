package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.EditarDatosDelRolTask.nombreRolEditado;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.LBL_NOMBRE_ROL;

public class ValidarEdicionNombreRolQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        System.out.println(LBL_NOMBRE_ROL.resolveFor(actor).getText());
        return LBL_NOMBRE_ROL.resolveFor(actor).getText().contains(nombreRolEditado);
    }

    public static ValidarEdicionNombreRolQuestion validarEdicionNombreRol() {
        return new ValidarEdicionNombreRolQuestion();
    }
}
