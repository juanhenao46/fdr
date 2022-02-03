package co.com.dannregional.testing.fdr.questions.transaccionesPendientes.programadas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.pagos.PagosProgramados.LBL_COLUMNAS_TABLA_PAGOS_PROGRAMADOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaColumnasTablaPagosProgramadosQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_COLUMNAS_TABLA_PAGOS_PROGRAMADOS, isPresent());
        return LBL_COLUMNAS_TABLA_PAGOS_PROGRAMADOS.resolveFor(actor).isPresent();
    }

    public static ValidaColumnasTablaPagosProgramadosQuestion validaColumnasTablaPagosProgramados() {
        return new ValidaColumnasTablaPagosProgramadosQuestion();
    }
}
