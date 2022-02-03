package co.com.dannregional.testing.fdr.questions.transferencias.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasPropias.CuentasPropias.LBL_RESUMEN;
import static co.com.dannregional.testing.fdr.utilities.constant.validarMensajes.ValidarMensajesIris.validarResumenTransferencia;

public class ValidarResumenDeTransferenciaQuestion implements Question {

    private boolean validar = false;

    @Override
    public Object answeredBy(Actor actor) {

        if (LBL_RESUMEN.resolveFor(actor).getTextValue().equals(validarResumenTransferencia)) {
            validar = true;
        }
        return validar;
    }
    public static ValidarResumenDeTransferenciaQuestion validarResumenDeTransferencia() {
        return new ValidarResumenDeTransferenciaQuestion();
    }
}
