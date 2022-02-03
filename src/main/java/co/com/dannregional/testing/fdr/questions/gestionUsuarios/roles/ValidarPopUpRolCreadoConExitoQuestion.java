package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.LBL_PRIMER_USUARIO_ASIGNADO;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.LBL_ROL_CREADO_CON_EXITO;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ValidarPopUpRolCreadoConExitoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_ROL_CREADO_CON_EXITO, isPresent());
        return LBL_ROL_CREADO_CON_EXITO.resolveFor(actor).isPresent();

    }
    public static ValidarPopUpRolCreadoConExitoQuestion validarPopUpRolCreadoConExito() {
        return new ValidarPopUpRolCreadoConExitoQuestion();
    }
}
