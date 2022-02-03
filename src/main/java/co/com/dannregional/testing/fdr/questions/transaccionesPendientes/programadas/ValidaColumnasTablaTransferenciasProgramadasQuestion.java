package co.com.dannregional.testing.fdr.questions.transaccionesPendientes.programadas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.transferencias.TransferenciasProgramadas.LBL_COLUMNAS_TABLA_TRANSFERENCIAS_PROGRAMADAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaColumnasTablaTransferenciasProgramadasQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_COLUMNAS_TABLA_TRANSFERENCIAS_PROGRAMADAS, isPresent());
        return LBL_COLUMNAS_TABLA_TRANSFERENCIAS_PROGRAMADAS.resolveFor(actor).isPresent();
    }

    public static ValidaColumnasTablaTransferenciasProgramadasQuestion validaColumnasTablaTransferenciasProgramadas() {
        return new ValidaColumnasTablaTransferenciasProgramadasQuestion();
    }
}
