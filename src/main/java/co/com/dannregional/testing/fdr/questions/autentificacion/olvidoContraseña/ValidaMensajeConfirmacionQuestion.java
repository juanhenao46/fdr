package co.com.dannregional.testing.fdr.questions.autentificacion.olvidoContraseña;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.userinterfaces.autentificacion.olvidoSuContraseña.OlvidoContraseña.LBL_MENSAJE_CONFIRMACION_RECUPERACION;
import static co.com.dannregional.testing.fdr.utilities.constant.validarMensajes.ValidarMensajesIris.validarMensajeRecuperacionContraseña;

public class ValidaMensajeConfirmacionQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println(LBL_MENSAJE_CONFIRMACION_RECUPERACION.resolveFor(actor).getTextValue().equals(validarMensajeRecuperacionContraseña));
        return LBL_MENSAJE_CONFIRMACION_RECUPERACION.resolveFor(actor).getTextValue().equals(validarMensajeRecuperacionContraseña);
    }
    public static ValidaMensajeConfirmacionQuestion validaMensajeConfirmacion() {
        return new ValidaMensajeConfirmacionQuestion();
    }
}
