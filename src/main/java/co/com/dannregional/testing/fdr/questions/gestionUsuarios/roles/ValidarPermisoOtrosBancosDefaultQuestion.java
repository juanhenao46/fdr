package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.CHK_AUTORIZADOR_OTROS_BANCOS;

public class ValidarPermisoOtrosBancosDefaultQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        esperarEnSegundos(1000);
        System.out.println(CHK_AUTORIZADOR_OTROS_BANCOS.resolveFor(actor).isPresent());
        return CHK_AUTORIZADOR_OTROS_BANCOS.resolveFor(actor).isPresent();
    }
    public static ValidarPermisoOtrosBancosDefaultQuestion validarPermisoOtrosBancosDefault() {
        return new ValidarPermisoOtrosBancosDefaultQuestion();
    }
}
