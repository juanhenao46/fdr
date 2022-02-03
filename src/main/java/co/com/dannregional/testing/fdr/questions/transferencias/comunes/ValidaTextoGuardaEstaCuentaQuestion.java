package co.com.dannregional.testing.fdr.questions.transferencias.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasIris.CuentasIris.LBL_GUARDAR_CUENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaTextoGuardaEstaCuentaQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_GUARDAR_CUENTA, isPresent());
        return LBL_GUARDAR_CUENTA.resolveFor(actor).isPresent();
    }
    public static ValidaTextoGuardaEstaCuentaQuestion validaTextoGuardaEstaCuenta() {
        return new ValidaTextoGuardaEstaCuentaQuestion();
    }
}
