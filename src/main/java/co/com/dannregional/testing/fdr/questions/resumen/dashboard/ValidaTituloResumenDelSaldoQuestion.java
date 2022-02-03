package co.com.dannregional.testing.fdr.questions.resumen.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.Resumen.LBL_RESUMEN_DEL_SALDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaTituloResumenDelSaldoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_RESUMEN_DEL_SALDO, isPresent());
        return LBL_RESUMEN_DEL_SALDO.resolveFor(actor).isPresent();
    }
    public static ValidaTituloResumenDelSaldoQuestion validaTituloResumenDelSaldo() {
        return new ValidaTituloResumenDelSaldoQuestion();
    }
}
