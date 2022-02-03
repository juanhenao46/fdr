package co.com.dannregional.testing.fdr.questions.resumen.filtrarSaldos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.Resumen.LBL_SALDO_TOTAL_OCULTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaOcultarSaldoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_SALDO_TOTAL_OCULTO, isPresent());
        return LBL_SALDO_TOTAL_OCULTO.resolveFor(actor).isPresent();
    }
    public static ValidaOcultarSaldoQuestion validaOcultarSaldo() {
        return new ValidaOcultarSaldoQuestion();
    }
}
