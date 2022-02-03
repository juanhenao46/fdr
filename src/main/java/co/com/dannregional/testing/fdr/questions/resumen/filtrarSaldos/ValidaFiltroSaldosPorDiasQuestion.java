package co.com.dannregional.testing.fdr.questions.resumen.filtrarSaldos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.Resumen.BTN_DIAS;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaFiltroSaldosPorDiasQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(BTN_DIAS.of(obtener("dias")), isPresent());
        return BTN_DIAS.of(obtener("dias")).resolveFor(actor).isPresent();
    }
    public static ValidaFiltroSaldosPorDiasQuestion validaFiltroSaldosPorDias() {
        return new ValidaFiltroSaldosPorDiasQuestion();
    }
}
