package co.com.dannregional.testing.fdr.questions.administracion.notificaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.etiquetasIdentificacion.EtiquetasDeIdentificacion.LBL_ETIQUETA_ACTUALIZADA;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.notificaciones.Notificaciones.LBL_NOTIFICACIONES_ACTUALIZADAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaPopUpNotificacionesActualizadasQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_NOTIFICACIONES_ACTUALIZADAS, isPresent());
        return LBL_NOTIFICACIONES_ACTUALIZADAS.resolveFor(actor).isPresent();
    }

    public static ValidaPopUpNotificacionesActualizadasQuestion validaPopUpNotificacionesActualizadas() {
        return new ValidaPopUpNotificacionesActualizadasQuestion();
    }
}
