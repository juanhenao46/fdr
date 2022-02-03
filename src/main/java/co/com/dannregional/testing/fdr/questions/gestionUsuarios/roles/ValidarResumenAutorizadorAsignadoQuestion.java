package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.LBL_ADMIN_AUTORIZADOR_ASIGNADO;

public class ValidarResumenAutorizadorAsignadoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        esperarEnSegundos(1000);
        System.out.println(LBL_ADMIN_AUTORIZADOR_ASIGNADO.resolveFor(actor).getText());
        return LBL_ADMIN_AUTORIZADOR_ASIGNADO.resolveFor(actor).getText().contains("Administrador");

    }
    public static ValidarResumenAutorizadorAsignadoQuestion validarResumenAutorizadorAsignado() {
        return new ValidarResumenAutorizadorAsignadoQuestion();
    }
}
