package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.LBL_PERMISOS_ADMINISTRACION;

public class ValidarEdicionPermisoAdministracionRolQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        esperarEnSegundos(1000);
        System.out.println(LBL_PERMISOS_ADMINISTRACION.resolveFor(actor).getText());
        return LBL_PERMISOS_ADMINISTRACION.resolveFor(actor).getText().contains("ADMINISTRACIÓN");

    }
    public static ValidarEdicionPermisoAdministracionRolQuestion validarEdicionPermisoAdministracionRol() {
        return new ValidarEdicionPermisoAdministracionRolQuestion();
    }
}
