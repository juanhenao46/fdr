package co.com.dannregional.testing.fdr.questions.transferencias.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasPropias.CuentasPropias.LBL_TRANSACCION_EXITOSA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaTituloTransaccionExitosaQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_TRANSACCION_EXITOSA, isPresent());
        return LBL_TRANSACCION_EXITOSA.resolveFor(actor).isPresent();
    }
    public static ValidaTituloTransaccionExitosaQuestion validaTituloTransaccionExitosa() {
        return new ValidaTituloTransaccionExitosaQuestion();
    }
}
