package co.com.dannregional.testing.fdr.questions.transferencias.cuentasInscritas.cuentasIris;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.InscribirCuentas.InscribirCuentaIris.LBL_INSCRIPCION_EXITOSA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ValidaPopUpInscripcionExitosaQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_INSCRIPCION_EXITOSA, isPresent());
        return LBL_INSCRIPCION_EXITOSA.resolveFor(actor).isPresent();
    }
    public static ValidaPopUpInscripcionExitosaQuestion validaPopUpInscripcionExitosa() {
        return new ValidaPopUpInscripcionExitosaQuestion();
    }
}
