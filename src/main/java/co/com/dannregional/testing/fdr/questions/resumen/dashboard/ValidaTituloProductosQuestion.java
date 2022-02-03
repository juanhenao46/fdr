package co.com.dannregional.testing.fdr.questions.resumen.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.Wait;

import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.Resumen.LBL_PRODUCTOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaTituloProductosQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_PRODUCTOS, isPresent());
        return LBL_PRODUCTOS.resolveFor(actor).isPresent();
    }
    public static ValidaTituloProductosQuestion validarTituloProductos() {
        return new ValidaTituloProductosQuestion();
    }
}
