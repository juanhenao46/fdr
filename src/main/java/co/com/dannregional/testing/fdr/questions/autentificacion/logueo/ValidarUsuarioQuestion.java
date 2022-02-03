package co.com.dannregional.testing.fdr.questions.autentificacion.logueo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.Resumen.LBL_VALIDAR_NOMBRE_USUARIO;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;

public class ValidarUsuarioQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println(LBL_VALIDAR_NOMBRE_USUARIO.of(obtener("nombre usuario")).resolveFor(actor).isPresent());
        return LBL_VALIDAR_NOMBRE_USUARIO.of(obtener("nombre usuario")).resolveFor(actor).isPresent();
    }
    public static ValidarUsuarioQuestion validarUsuario() {
        return new ValidarUsuarioQuestion();
    }
}
