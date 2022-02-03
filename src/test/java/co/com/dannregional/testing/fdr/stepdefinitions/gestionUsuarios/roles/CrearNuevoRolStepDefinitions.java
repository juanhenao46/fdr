package co.com.dannregional.testing.fdr.stepdefinitions.gestionUsuarios.roles;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.ClicEnSiguiente.clicEnSiguiente;
import static co.com.dannregional.testing.fdr.interactions.bancoIris.IngresarOTPTransferencias.ingresarOTPTransferencias;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarLimiteCuentasIrisDefaultQuestion.validarLimiteCuentasIrisDefault;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarLimiteOtrosBancosDefaultQuestion.validarLimiteOtrosBancosDefault;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarPermisoCuentasIrisDefaultQuestion.validarPermisoCuentasIrisDefault;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarPermisoCuentasPropiasDefaultQuestion.validarPermisoCuentasPropiasDefault;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarPermisoOtrosBancosDefaultQuestion.validarPermisoOtrosBancosDefault;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarPopUpRolCreadoConExitoQuestion.validarPopUpRolCreadoConExito;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarRestriccionCuentasIrisDefaultQuestion.validarRestriccionCuentasIrisDefault;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarRestriccionCuentasPropiasDefaultQuestion.validarRestriccionCuentasPropiasDefault;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarRestriccionOtrosBancosDefaultQuestion.validarRestriccionOtrosBancosDefault;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarResumenAutorizadorAsignadoQuestion.validarResumenAutorizadorAsignado;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarResumenDescripcionRolAsignadoQuestion.validarResumenDescripcionRolAsignado;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarResumenEstadoRolAsignadoQuestion.validarResumenEstadoRolAsignado;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarResumenHoraFinalAsignadoQuestion.validarResumenHoraFinalAsignado;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarResumenHoraInicioAsignadoQuestion.validarResumenHoraInicioAsignado;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarResumenNombreRolAsignadoQuestion.validarResumenNombreRolAsignado;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarResumenPermisosTransferenciasAsignadoQuestion.validarResumenPermisosTransferenciasAsignado;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarResumenProductoAsignadoQuestion.validarResumenProductoAsignado;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarResumenUsuarioAsignadoQuestion.validarResumenUsuarioAsignado;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.comunes.AccederAlMenuGestionUsuariosTask.accederAlMenuGestionUsuarios;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.AccederARolesTask.accederARoles;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.IngresarDatosDelRolTask.ingresarDatosDelRol;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.SeleccionarCrearNuevoRolTask.seleccionarCrearNuevoRol;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.SeleccionarProductosDelRolTask.seleccionarProductosDelRol;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.SeleccionarUsuariosYAutorizadoresDelRolTask.seleccionarUsuariosYAutorizadoresDelRol;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CrearNuevoRolStepDefinitions {

    @Cuando("^el usuario ingresa a roles y limites$")
    public void el_usuario_ingresa_a_roles_y_limites() {
        theActorInTheSpotlight().attemptsTo(
                accederAlMenuGestionUsuarios(),
                accederARoles()
        );
    }


    @Y("^el usuario ingresa a crear nuevo rol$")
    public void el_usuario_ingresa_a_crear_nuevo_rol() {
        theActorInTheSpotlight().attemptsTo(
                seleccionarCrearNuevoRol()
        );
    }

    @Y("^el usuario ingresa los datos del rol$")
    public void el_usuario_ingresa_los_datos_del_rol() {
        theActorInTheSpotlight().attemptsTo(
                ingresarDatosDelRol()
        );
    }

    @Y("^el usuario selecciona los productos del rol$")
    public void el_usuario_selecciona_los_productos_del_rol() {
        theActorInTheSpotlight().attemptsTo(
                seleccionarProductosDelRol(),
                clicEnSiguiente(),
                clicEnSiguiente()
        );
    }

    @Entonces("^el usuario deberia poder ver los permisos restricciones y limites por default$")
    public void el_usuario_deberia_poder_ver_los_permisos_restricciones_y_limites_por_default() {
        theActorInTheSpotlight().should(seeThat(validarPermisoCuentasPropiasDefault()));
        theActorInTheSpotlight().should(seeThat(validarPermisoCuentasIrisDefault()));
        theActorInTheSpotlight().should(seeThat(validarPermisoOtrosBancosDefault()));
        theActorInTheSpotlight().should(seeThat(validarRestriccionCuentasPropiasDefault()));
        theActorInTheSpotlight().should(seeThat(validarRestriccionCuentasIrisDefault()));
        theActorInTheSpotlight().should(seeThat(validarRestriccionOtrosBancosDefault()));
    }

    @Y("^el usuario configura los permisos y restricciones del rol$")
    public void el_usuario_configura_los_permisos_y_restricciones_del_rol() {
        theActorInTheSpotlight().attemptsTo(
                clicEnSiguiente()
        );
    }

    @Y("^el usuario asigna los usuarios y autorizadores del rol$")
    public void el_usuario_asigna_los_usuarios_y_autorizadores_del_rol() {
        theActorInTheSpotlight().attemptsTo(
                seleccionarUsuariosYAutorizadoresDelRol()
        );
    }

    @Entonces("^el usuario deberia ver el resumen del rol con la informacion correspondiente$")
    public void el_usuario_deberia_ver_el_resumen_del_rol_con_la_informacion_correspondiente() {
        theActorInTheSpotlight().should(seeThat(validarResumenNombreRolAsignado()));
        theActorInTheSpotlight().should(seeThat(validarResumenDescripcionRolAsignado()));
        theActorInTheSpotlight().should(seeThat(validarResumenEstadoRolAsignado()));
        theActorInTheSpotlight().should(seeThat(validarResumenProductoAsignado()));
        theActorInTheSpotlight().should(seeThat(validarResumenHoraInicioAsignado()));
        theActorInTheSpotlight().should(seeThat(validarResumenHoraFinalAsignado()));
        theActorInTheSpotlight().should(seeThat(validarResumenPermisosTransferenciasAsignado()));
        theActorInTheSpotlight().should(seeThat(validarResumenUsuarioAsignado()));
        theActorInTheSpotlight().should(seeThat(validarResumenAutorizadorAsignado()));
    }

    @Y("^el usuario da clic en siguiente e ingresa otp$")
    public void el_usuario_da_clic_en_siguiente_e_ingresa_otp() {
        theActorInTheSpotlight().attemptsTo(
                clicEnSiguiente(),
                ingresarOTPTransferencias());
    }

    @Entonces("^el usuario deberia poder ver el mensaje de rol creado con exito$")
    public void el_usuario_deberia_poder_ver_el_mensaje_de_rol_creado_con_exito() {
        theActorInTheSpotlight().should(seeThat(validarPopUpRolCreadoConExito()));
    }
}