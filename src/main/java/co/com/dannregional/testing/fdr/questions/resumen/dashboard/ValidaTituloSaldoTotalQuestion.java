package co.com.dannregional.testing.fdr.questions.resumen.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.Resumen.LBL_SALDO_TOTAL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaTituloSaldoTotalQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_SALDO_TOTAL, isPresent());
        return LBL_SALDO_TOTAL.resolveFor(actor).isPresent();
    }
    public static ValidaTituloSaldoTotalQuestion validarTituloSaldoTotal() {
        return new ValidaTituloSaldoTotalQuestion();
    }
}
