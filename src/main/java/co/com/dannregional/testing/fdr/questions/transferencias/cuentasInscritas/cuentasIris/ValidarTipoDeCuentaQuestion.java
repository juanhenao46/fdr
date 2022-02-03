package co.com.dannregional.testing.fdr.questions.transferencias.cuentasInscritas.cuentasIris;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.InscribirCuentas.InscribirCuentaIris.TXT_TIPO_DE_CUENTA;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidarTipoDeCuentaQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(TXT_TIPO_DE_CUENTA, isPresent()).forNoMoreThan(5).seconds();
        return TXT_TIPO_DE_CUENTA.resolveFor(actor).getTextValue().contains(obtener("tipo de cuenta"));
    }
    public static ValidarTipoDeCuentaQuestion validarTipoDeCuenta() {
        return new ValidarTipoDeCuentaQuestion();
    }
}
