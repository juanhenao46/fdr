package co.com.dannregional.testing.fdr.questions.historicoTransacciones.transacciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.Wait;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones.HistoricoTransacciones.LBL_COLUMNAS_TABLA_HISTORICO_TRANSACCIONES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaColumnasTablaHistoricoTransaccionesQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_COLUMNAS_TABLA_HISTORICO_TRANSACCIONES, isPresent());
        return LBL_COLUMNAS_TABLA_HISTORICO_TRANSACCIONES.resolveFor(actor).isPresent();
    }

    public static ValidaColumnasTablaHistoricoTransaccionesQuestion validaColumnasTablaHistoricoTransacciones() {
        return new ValidaColumnasTablaHistoricoTransaccionesQuestion();
    }
}
