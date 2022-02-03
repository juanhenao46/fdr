package co.com.dannregional.testing.fdr.questions.pagos.manuales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.pagos.manuales.PagosManuales.LBL_PAGO_GUARDADO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaTituloPagoGuardadoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_PAGO_GUARDADO, isPresent());
        return LBL_PAGO_GUARDADO.resolveFor(actor).isPresent();
    }
    public static ValidaTituloPagoGuardadoQuestion validaTituloPagoGuardado() {
        return new ValidaTituloPagoGuardadoQuestion();
    }
}
