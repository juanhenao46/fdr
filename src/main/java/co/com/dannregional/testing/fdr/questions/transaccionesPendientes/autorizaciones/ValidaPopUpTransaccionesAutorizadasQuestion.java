package co.com.dannregional.testing.fdr.questions.transaccionesPendientes.autorizaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.Wait;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.misAutorizaciones.MisAutorizaciones.LBL_TRANSACCIONES_AUTORIZADAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaPopUpTransaccionesAutorizadasQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_TRANSACCIONES_AUTORIZADAS, isPresent());
        return LBL_TRANSACCIONES_AUTORIZADAS.resolveFor(actor).isPresent();
    }

    public static ValidaPopUpTransaccionesAutorizadasQuestion validaPopUpTransaccionesAutorizadas() {
        return new ValidaPopUpTransaccionesAutorizadasQuestion();
    }
}
