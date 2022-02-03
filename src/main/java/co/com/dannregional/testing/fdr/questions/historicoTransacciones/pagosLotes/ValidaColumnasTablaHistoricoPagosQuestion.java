package co.com.dannregional.testing.fdr.questions.historicoTransacciones.pagosLotes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.pagosLotes.HistoricoPagosLotes.LBL_COLUMNAS_TABLA_HISTORICO_PAGOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaColumnasTablaHistoricoPagosQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_COLUMNAS_TABLA_HISTORICO_PAGOS, isPresent());
        return LBL_COLUMNAS_TABLA_HISTORICO_PAGOS.resolveFor(actor).isPresent();
    }

    public static ValidaColumnasTablaHistoricoPagosQuestion validaColumnasTablaHistoricoPagos() {
        return new ValidaColumnasTablaHistoricoPagosQuestion();
    }
}
