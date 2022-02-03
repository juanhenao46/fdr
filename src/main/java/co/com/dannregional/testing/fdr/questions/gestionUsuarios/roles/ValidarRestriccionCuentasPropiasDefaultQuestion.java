package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.*;

public class ValidarRestriccionCuentasPropiasDefaultQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        esperarEnSegundos(1000);
        System.out.println(LBL_RESTRICCION_CUENTAS_PROPIAS.resolveFor(actor).getText());
        return LBL_RESTRICCION_CUENTAS_PROPIAS.resolveFor(actor).getText().contains("Ilimitado");
    }
    public static ValidarRestriccionCuentasPropiasDefaultQuestion validarRestriccionCuentasPropiasDefault() {
        return new ValidarRestriccionCuentasPropiasDefaultQuestion();
    }
}
