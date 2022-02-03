package co.com.dannregional.testing.fdr.questions.transferencias.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasPropias.CuentasPropias.LBL_TRANSACCION_PENDIENTE_DE_AUTORIZACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaTituloTransaccionPendienteAutorizacionQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_TRANSACCION_PENDIENTE_DE_AUTORIZACION, isPresent());
        return LBL_TRANSACCION_PENDIENTE_DE_AUTORIZACION.resolveFor(actor).isPresent();
    }
    public static ValidaTituloTransaccionPendienteAutorizacionQuestion validaTituloTransaccionPendienteAutorizacion() {
        return new ValidaTituloTransaccionPendienteAutorizacionQuestion();
    }
}
