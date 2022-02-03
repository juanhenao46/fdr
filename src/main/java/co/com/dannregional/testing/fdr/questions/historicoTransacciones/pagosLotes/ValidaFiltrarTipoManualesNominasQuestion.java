package co.com.dannregional.testing.fdr.questions.historicoTransacciones.pagosLotes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.pagosLotes.HistoricoPagosLotes.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaFiltrarTipoManualesNominasQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_TIPO_MANUALES_NOMINAS, isPresent());
        return LBL_TIPO_MANUALES_NOMINAS.resolveFor(actor).isPresent();
    }
    public static ValidaFiltrarTipoManualesNominasQuestion validaFiltrarTipoManualesNominas() {
        return new ValidaFiltrarTipoManualesNominasQuestion();
    }
}
