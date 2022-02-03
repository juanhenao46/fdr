package co.com.dannregional.testing.fdr.questions.transaccionesPendientes.programadas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.transferencias.TransferenciasProgramadas.LBL_TRANSACCION_ELIMINADA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaPopUpTransaccionEliminadaQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_TRANSACCION_ELIMINADA, isPresent());
        return LBL_TRANSACCION_ELIMINADA.resolveFor(actor).isPresent();
    }

    public static ValidaPopUpTransaccionEliminadaQuestion validaPopUpTransaccionEliminada() {
        return new ValidaPopUpTransaccionEliminadaQuestion();
    }
}
