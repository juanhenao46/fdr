package co.com.dannregional.testing.fdr.questions.historicoTransacciones.transacciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones.HistoricoTransacciones.LBL_TIPO_CUENTAS_PROPIAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaFiltrarTipoCuentasPropiasQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_TIPO_CUENTAS_PROPIAS, isPresent());
        return LBL_TIPO_CUENTAS_PROPIAS.resolveFor(actor).isPresent();
    }
    public static ValidaFiltrarTipoCuentasPropiasQuestion validaFiltrarTipoCuentasPropias() {
        return new ValidaFiltrarTipoCuentasPropiasQuestion();
    }
}
