package co.com.dannregional.testing.fdr.questions.administracion.etiquetasIdentificacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.etiquetasIdentificacion.EtiquetasDeIdentificacion.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaPopUpEtiquetaActualizadaQuestion implements Question<Boolean> {

    String nuevaContraseña;
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_ETIQUETA_ACTUALIZADA, isPresent());
        return LBL_ETIQUETA_ACTUALIZADA.resolveFor(actor).isPresent();
    }


    public static ValidaPopUpEtiquetaActualizadaQuestion validaPopUpEtiquetaActualizada() {
        return new ValidaPopUpEtiquetaActualizadaQuestion();
    }
}
