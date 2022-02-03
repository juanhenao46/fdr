package co.com.dannregional.testing.fdr.questions.transferencias.cuentasInscritas.pantalla;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.detalleDeCuenta.DetalleCuentaInscrita.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaTitularDeLaCuentaInscritaQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_TITULAR_DE_LA_CUENTA.of(obtener("titular de cuenta")), isPresent());
        return LBL_TITULAR_DE_LA_CUENTA.of(obtener("titular de cuenta")).resolveFor(actor).isPresent();
    }
    public static ValidaTitularDeLaCuentaInscritaQuestion validaTitularDeLaCuentaInscrita() {
        return new ValidaTitularDeLaCuentaInscritaQuestion();
    }
}
