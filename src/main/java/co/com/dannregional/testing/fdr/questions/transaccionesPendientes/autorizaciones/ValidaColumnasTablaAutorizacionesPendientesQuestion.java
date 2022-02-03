package co.com.dannregional.testing.fdr.questions.transaccionesPendientes.autorizaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.autorizacionesPendientes.AutorizacionesPendientes.LBL_COLUMNAS_TABLA_AUTORIZACIONES_PENDIENTES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaColumnasTablaAutorizacionesPendientesQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_COLUMNAS_TABLA_AUTORIZACIONES_PENDIENTES, isPresent());
        return LBL_COLUMNAS_TABLA_AUTORIZACIONES_PENDIENTES.resolveFor(actor).isPresent();
    }

    public static ValidaColumnasTablaAutorizacionesPendientesQuestion validaColumnasTablaAutorizacionesPendientes() {
        return new ValidaColumnasTablaAutorizacionesPendientesQuestion();
    }
}
