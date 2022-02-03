package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.CHK_AUTORIZADOR_CUENTAS_IRIS;

public class ValidarPermisoCuentasIrisDefaultQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        esperarEnSegundos(1000);
        System.out.println(CHK_AUTORIZADOR_CUENTAS_IRIS.resolveFor(actor).isPresent());
        return CHK_AUTORIZADOR_CUENTAS_IRIS.resolveFor(actor).isPresent();
    }
    public static ValidarPermisoCuentasIrisDefaultQuestion validarPermisoCuentasIrisDefault() {
        return new ValidarPermisoCuentasIrisDefaultQuestion();
    }
}
