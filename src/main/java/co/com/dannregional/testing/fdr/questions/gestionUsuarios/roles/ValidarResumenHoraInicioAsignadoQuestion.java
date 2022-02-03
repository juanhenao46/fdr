package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.LBL_ESTADO_ROL;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.LBL_HORA_INICIO;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;

public class ValidarResumenHoraInicioAsignadoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        System.out.println(LBL_HORA_INICIO.resolveFor(actor).getText());
        return LBL_HORA_INICIO.resolveFor(actor).getText().contains("07:00 a. m.");
    }
    public static ValidarResumenHoraInicioAsignadoQuestion validarResumenHoraInicioAsignado() {
        return new ValidarResumenHoraInicioAsignadoQuestion();
    }
}
