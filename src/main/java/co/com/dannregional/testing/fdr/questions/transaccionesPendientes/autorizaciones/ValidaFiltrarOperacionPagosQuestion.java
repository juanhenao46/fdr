package co.com.dannregional.testing.fdr.questions.transaccionesPendientes.autorizaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.misAutorizaciones.MisAutorizaciones.LBL_OPERACION_PAGOS;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.misAutorizaciones.MisAutorizaciones.LBL_OPERACION_TRANSFERENCIAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaFiltrarOperacionPagosQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_OPERACION_PAGOS, isPresent());
        return LBL_OPERACION_PAGOS.resolveFor(actor).isPresent();
    }
    public static ValidaFiltrarOperacionPagosQuestion validaFiltrarOperacionPagos() {
        return new ValidaFiltrarOperacionPagosQuestion();
    }
}
