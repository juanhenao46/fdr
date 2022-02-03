package co.com.dannregional.testing.fdr.questions.pagos.manuales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.pagos.manuales.PagosManuales.LBL_TRANSACCIONES_OTROS_BANCOS;
import static co.com.dannregional.testing.fdr.userinterfaces.pagos.manuales.PagosManuales.LBL_TRANSACCION_PENDIENTE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaTituloOtrosBancosQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_TRANSACCIONES_OTROS_BANCOS, isPresent());
        return LBL_TRANSACCIONES_OTROS_BANCOS.resolveFor(actor).isPresent();
    }
    public static ValidaTituloOtrosBancosQuestion validaTituloOtrosBancos() {
        return new ValidaTituloOtrosBancosQuestion();
    }
}
