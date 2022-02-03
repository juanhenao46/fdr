package co.com.dannregional.testing.fdr.questions.transaccionesPendientes.autorizaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.autorizacionesPendientes.AutorizacionesPendientes.LBL_TRANSACCIONES_ELIMINADAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaPopUpTransaccionesEliminadasQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_TRANSACCIONES_ELIMINADAS, isPresent());
        return LBL_TRANSACCIONES_ELIMINADAS.resolveFor(actor).isPresent();
    }

    public static ValidaPopUpTransaccionesEliminadasQuestion validaPopUpTransaccionesEliminadas() {
        return new ValidaPopUpTransaccionesEliminadasQuestion();
    }
}
