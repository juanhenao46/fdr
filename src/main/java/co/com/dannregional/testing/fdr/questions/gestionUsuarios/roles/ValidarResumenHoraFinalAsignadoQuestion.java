package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;

public class ValidarResumenHoraFinalAsignadoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {


        System.out.println(LBL_HORA_FINAL.resolveFor(actor).getText());
        return LBL_HORA_FINAL.resolveFor(actor).getText().contains("08:00 p. m.");
    }
    public static ValidarResumenHoraFinalAsignadoQuestion validarResumenHoraFinalAsignado() {
        return new ValidarResumenHoraFinalAsignadoQuestion();
    }
}
