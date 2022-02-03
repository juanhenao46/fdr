package co.com.dannregional.testing.fdr.questions.resumen.detalleDeCuenta;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.Resumen.LBL_VALIDAR_TITULO;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaDetalleDeCuentaQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_VALIDAR_TITULO.of(obtener("texto esperado")), isPresent());
        return LBL_VALIDAR_TITULO.of(obtener("texto esperado")).resolveFor(actor).isPresent();
    }
    public static ValidaDetalleDeCuentaQuestion validaDetalleDeCuenta() {
        return new ValidaDetalleDeCuentaQuestion();
    }
}
