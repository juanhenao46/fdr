package co.com.dannregional.testing.fdr.questions.resumen.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.Wait;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.Resumen.LBL_ULTIMAS_OPERACIONES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaTituloUltimasOperacionesQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_ULTIMAS_OPERACIONES, isPresent());
        return LBL_ULTIMAS_OPERACIONES.resolveFor(actor).isPresent();
    }
    public static ValidaTituloUltimasOperacionesQuestion validaTituloUltimasOperaciones() {
        return new ValidaTituloUltimasOperacionesQuestion();
    }
}
