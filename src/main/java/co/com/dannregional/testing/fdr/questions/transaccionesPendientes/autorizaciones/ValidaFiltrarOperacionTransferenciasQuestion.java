package co.com.dannregional.testing.fdr.questions.transaccionesPendientes.autorizaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.misAutorizaciones.MisAutorizaciones.LBL_OPERACION_TRANSFERENCIAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaFiltrarOperacionTransferenciasQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_OPERACION_TRANSFERENCIAS, isPresent());
        return LBL_OPERACION_TRANSFERENCIAS.resolveFor(actor).isPresent();
    }
    public static ValidaFiltrarOperacionTransferenciasQuestion validaFiltrarOperacionTransferencias() {
        return new ValidaFiltrarOperacionTransferenciasQuestion();
    }
}
