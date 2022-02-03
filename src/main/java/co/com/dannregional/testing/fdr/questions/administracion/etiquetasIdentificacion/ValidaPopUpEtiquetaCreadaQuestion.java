package co.com.dannregional.testing.fdr.questions.administracion.etiquetasIdentificacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.Wait;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.etiquetasIdentificacion.EtiquetasDeIdentificacion.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaPopUpEtiquetaCreadaQuestion implements Question<Boolean> {

    String nuevaContraseña;
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_ETIQUETA_CREADA, isPresent());
        return LBL_ETIQUETA_CREADA.resolveFor(actor).isPresent();
    }

    public static ValidaPopUpEtiquetaCreadaQuestion validaPopUpEtiquetaCreada() {
        return new ValidaPopUpEtiquetaCreadaQuestion();
    }
}
