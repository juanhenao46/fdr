package co.com.dannregional.testing.fdr.questions.historicoTransacciones.pagosLotes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones.HistoricoTransacciones.LBL_RESUME_DEL_PAGO;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones.HistoricoTransacciones.LBL_TITULO_COMPROBANTE_TRANSFERENCIA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaTituloModalPagoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_RESUME_DEL_PAGO, isPresent());
        return LBL_RESUME_DEL_PAGO.resolveFor(actor).isPresent();
    }
    public static ValidaTituloModalPagoQuestion validaTituloModalPago() {
        return new ValidaTituloModalPagoQuestion();
    }
}
