package co.com.dannregional.testing.fdr.questions.transferencias.cuentasInscritas.cuentasIris;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.InscribirCuentas.InscribirCuentaIris.TXT_TITULAR_CUENTA;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidarTitularDeLaCuentaQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(TXT_TITULAR_CUENTA, isPresent());
        return TXT_TITULAR_CUENTA.resolveFor(actor).getTextValue().contains(obtener("titular de cuenta"));
    }
    public static ValidarTitularDeLaCuentaQuestion validarTitularDeLaCuenta() {
        return new ValidarTitularDeLaCuentaQuestion();
    }
}
