package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;

public class ValidarResumenEstadoRolAsignadoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        if (obtener("estado rol").equals("Activo")){
            System.out.println(LBL_ESTADO_ROL.resolveFor(actor).getText());
            return LBL_ESTADO_ROL.resolveFor(actor).getText().contains("Activo");
        } else if (obtener("estado rol").equals("Inactivo")){
            esperarEnSegundos(1000);
            System.out.println(LBL_ESTADO_ROL.resolveFor(actor).getText());
            return LBL_ESTADO_ROL.resolveFor(actor).getText().contains("Inactivo");
        }

        return null;

    }
    public static ValidarResumenEstadoRolAsignadoQuestion validarResumenEstadoRolAsignado() {
        return new ValidarResumenEstadoRolAsignadoQuestion();
    }
}
