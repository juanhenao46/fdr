package co.com.dannregional.testing.fdr.questions.historicoTransacciones.transacciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones.HistoricoTransacciones.LBL_TIPO_CUENTAS_IRIS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaFiltrarTipoCuentasIrisQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_TIPO_CUENTAS_IRIS, isPresent());
        return LBL_TIPO_CUENTAS_IRIS.resolveFor(actor).isPresent();
    }
    public static ValidaFiltrarTipoCuentasIrisQuestion validaFiltrarTipoCuentasIris() {
        return new ValidaFiltrarTipoCuentasIrisQuestion();
    }
}
