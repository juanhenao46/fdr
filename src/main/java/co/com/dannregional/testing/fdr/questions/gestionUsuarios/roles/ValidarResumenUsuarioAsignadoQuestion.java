package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.interactions.comunes.Scrollear.scrollearHasta;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.LBL_PRIMER_USUARIO_ASIGNADO;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;

public class ValidarResumenUsuarioAsignadoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if (obtener("estado rol").equals("Activo")){
            esperarEnSegundos(1000);
            System.out.println(LBL_PRIMER_USUARIO_ASIGNADO.resolveFor(actor).getText());
            return LBL_PRIMER_USUARIO_ASIGNADO.resolveFor(actor).getText().contains("Abc Prueba");
        } else if (obtener("estado rol").equals("Inactivo")){
            esperarEnSegundos(1000);
            System.out.println(LBL_PRIMER_USUARIO_ASIGNADO.resolveFor(actor).getText());
            System.out.println("Rol inactivo, no se puede asignar usuarios");
            return LBL_PRIMER_USUARIO_ASIGNADO.resolveFor(actor).getText().equals("-");
        }
        return null;
    }
    public static ValidarResumenUsuarioAsignadoQuestion validarResumenUsuarioAsignado() {
        return new ValidarResumenUsuarioAsignadoQuestion();
    }
}
