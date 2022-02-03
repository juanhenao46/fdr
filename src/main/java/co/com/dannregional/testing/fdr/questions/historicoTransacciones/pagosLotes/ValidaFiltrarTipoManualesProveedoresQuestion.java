package co.com.dannregional.testing.fdr.questions.historicoTransacciones.pagosLotes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.pagosLotes.HistoricoPagosLotes.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaFiltrarTipoManualesProveedoresQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_TIPO_MANUALES_PROVEEDORES, isPresent());
        return LBL_TIPO_MANUALES_PROVEEDORES.resolveFor(actor).isPresent();
    }
    public static ValidaFiltrarTipoManualesProveedoresQuestion validaFiltrarTipoManualesProveedores() {
        return new ValidaFiltrarTipoManualesProveedoresQuestion();
    }
}
