package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.IngresarDatosDelRolTask.nombreRol;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.IngresarDatosDelRolTask.nombreRolInactivo;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;

public class ValidarResumenNombreRolAsignadoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if (obtener("estado rol").equals("Activo")){
            esperarEnSegundos(1000);
            System.out.println(LBL_NOMBRE_ROL.resolveFor(actor).getText());
            return LBL_NOMBRE_ROL.resolveFor(actor).getText().contains(nombreRol);
        }else if (obtener("estado rol").equals("Inactivo")){
            esperarEnSegundos(1000);
            System.out.println(LBL_NOMBRE_ROL.resolveFor(actor).getText());
            return LBL_NOMBRE_ROL.resolveFor(actor).getText().contains(nombreRolInactivo);
        }
        return null;
    }
    public static ValidarResumenNombreRolAsignadoQuestion validarResumenNombreRolAsignado() {
        return new ValidarResumenNombreRolAsignadoQuestion();
    }
}
