package co.com.dannregional.testing.fdr.questions.transferencias.cuentasInscritas.pantalla;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.pantalla.PantallaCuentasInscritas.BTN_CUENTA;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaCuentaInscritaFiltrosQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(BTN_CUENTA.of(obtener("numero de cuenta")), isPresent());
        return BTN_CUENTA.of(obtener("numero de cuenta")).resolveFor(actor).isPresent();
    }
    public static ValidaCuentaInscritaFiltrosQuestion validaCuentaInscritaFiltros() {
        return new ValidaCuentaInscritaFiltrosQuestion();
    }
}
