package co.com.dannregional.testing.fdr.questions.transaccionesPendientes.autorizaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.misAutorizaciones.MisAutorizaciones.LBL_COLUMNAS_TABLA_MIS_AUTORIZACIONES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaColumnasTablaMisAutorizacionesQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_COLUMNAS_TABLA_MIS_AUTORIZACIONES, isPresent());
        return LBL_COLUMNAS_TABLA_MIS_AUTORIZACIONES.resolveFor(actor).isPresent();
    }

    public static ValidaColumnasTablaMisAutorizacionesQuestion validaColumnasTablaMisAutorizaciones() {
        return new ValidaColumnasTablaMisAutorizacionesQuestion();
    }
}
