package co.com.dannregional.testing.fdr.questions.resumen.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.Resumen.LBL_RESUMEN_POR_PRODUCTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaTituloResumenPorProductoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_RESUMEN_POR_PRODUCTO, isPresent());
        return LBL_RESUMEN_POR_PRODUCTO.resolveFor(actor).isPresent();
    }
    public static ValidaTituloResumenPorProductoQuestion validaTituloResumenPorProducto() {
        return new ValidaTituloResumenPorProductoQuestion();
    }
}
