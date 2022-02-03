package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.*;

public class ValidarLimiteCuentasIrisDefaultQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        esperarEnSegundos(1000);
        System.out.println(LBL_LIMITE_CUENTAS_IRIS.resolveFor(actor).getText());
        return LBL_LIMITE_CUENTAS_IRIS.resolveFor(actor).getText().contains("3634104000");
    }
    public static ValidarLimiteCuentasIrisDefaultQuestion validarLimiteCuentasIrisDefault() {
        return new ValidarLimiteCuentasIrisDefaultQuestion();
    }
}
