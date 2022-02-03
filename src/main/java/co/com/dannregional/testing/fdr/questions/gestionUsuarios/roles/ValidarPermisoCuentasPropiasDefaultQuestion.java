package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.*;

public class ValidarPermisoCuentasPropiasDefaultQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        esperarEnSegundos(1000);
        System.out.println(CHK_AUTORIZADOR_CUENTAS_PROPIAS.resolveFor(actor).isPresent());
        return CHK_AUTORIZADOR_CUENTAS_PROPIAS.resolveFor(actor).isPresent();
    }
    public static ValidarPermisoCuentasPropiasDefaultQuestion validarPermisoCuentasPropiasDefault() {
        return new ValidarPermisoCuentasPropiasDefaultQuestion();
    }
}
