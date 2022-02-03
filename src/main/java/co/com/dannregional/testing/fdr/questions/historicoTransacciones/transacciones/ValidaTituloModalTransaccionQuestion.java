package co.com.dannregional.testing.fdr.questions.historicoTransacciones.transacciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones.HistoricoTransacciones.LBL_TITULO_COMPROBANTE_TRANSFERENCIA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaTituloModalTransaccionQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_TITULO_COMPROBANTE_TRANSFERENCIA, isPresent());
        return LBL_TITULO_COMPROBANTE_TRANSFERENCIA.resolveFor(actor).isPresent();
    }
    public static ValidaTituloModalTransaccionQuestion validaTituloModalTransaccion() {
        return new ValidaTituloModalTransaccionQuestion();
    }
}
