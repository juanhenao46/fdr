package co.com.dannregional.testing.fdr.questions.historicoTransacciones.transacciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.Wait;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones.HistoricoTransacciones.LBL_TIPO_OTROS_BANCOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaFiltrarTipoOtrosBancosQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_TIPO_OTROS_BANCOS, isPresent());
        return LBL_TIPO_OTROS_BANCOS.resolveFor(actor).isPresent();
    }
    public static ValidaFiltrarTipoOtrosBancosQuestion validaFiltrarTipoOtrosBancos() {
        return new ValidaFiltrarTipoOtrosBancosQuestion();
    }
}
