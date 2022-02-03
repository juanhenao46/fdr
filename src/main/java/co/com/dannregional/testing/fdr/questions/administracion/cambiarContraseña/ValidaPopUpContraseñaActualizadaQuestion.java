package co.com.dannregional.testing.fdr.questions.administracion.cambiarContraseña;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.userinterfaces.administracion.cambiarContraseña.CambiarContraseña.LBL_CONTRASEÑA_ACTUALIZADA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidaPopUpContraseñaActualizadaQuestion implements Question<Boolean> {

    String nuevaContraseña;
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_CONTRASEÑA_ACTUALIZADA, isPresent());
        return LBL_CONTRASEÑA_ACTUALIZADA.resolveFor(actor).isPresent();
    }


    public static ValidaPopUpContraseñaActualizadaQuestion validaPopUpContraseñaActualizada() {
        return new ValidaPopUpContraseñaActualizadaQuestion();
    }
}
