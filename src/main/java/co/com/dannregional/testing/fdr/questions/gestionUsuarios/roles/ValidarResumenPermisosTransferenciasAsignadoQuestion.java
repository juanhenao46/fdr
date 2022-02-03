package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.IngresarDatosDelRolTask.nombreRol;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.IngresarDatosDelRolTask.nombreRolInactivo;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.LBL_NOMBRE_ROL;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.LBL_PERMISOS_TRANSFERENCIAS;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;

public class ValidarResumenPermisosTransferenciasAsignadoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        esperarEnSegundos(1000);
        System.out.println(LBL_PERMISOS_TRANSFERENCIAS.resolveFor(actor).getText());
        return LBL_PERMISOS_TRANSFERENCIAS.resolveFor(actor).getText().contains("TRANSFERENCIAS");

    }
    public static ValidarResumenPermisosTransferenciasAsignadoQuestion validarResumenPermisosTransferenciasAsignado() {
        return new ValidarResumenPermisosTransferenciasAsignadoQuestion();
    }
}
