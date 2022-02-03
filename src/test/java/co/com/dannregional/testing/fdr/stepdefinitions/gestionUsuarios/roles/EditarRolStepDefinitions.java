package co.com.dannregional.testing.fdr.stepdefinitions.gestionUsuarios.roles;

import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarEdicionAutorizadorRolQuestion.validarEdicionAutorizadorRol;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarEdicionDescripcionRolQuestion.validarEdicionDescripcionRol;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarEdicionNombreRolQuestion.validarEdicionNombreRol;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarEdicionPermisoAdministracionRolQuestion.validarEdicionPermisoAdministracionRol;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarEdicionProductoRolQuestion.validarEdicionProductoRol;
import static co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles.ValidarRolMasterNoEditableQuestion.validarRolMasterNoEditable;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.comunes.AccederAlMenuGestionUsuariosTask.accederAlMenuGestionUsuarios;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.AccederARolesTask.accederARoles;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.ClicEditarRolTask.clicEditarRol;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.DeshacerCambiosRolEditadoTask.deshacerCambiosRolEditado;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.EditarAutorizadoresDelRolTask.editarAutorizadoresDelRol;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.EditarDatosDelRolTask.editarDatosDelRol;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.EditarPermisosDelRolTask.editarPermisosDelRol;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.EditarProductosDelRolTask.editarProductosDelRol;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.GuardarCambiosRolTask.guardarCambiosRol;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.IngresarAlRolEditarTask.ingresarAlRolEditar;
import static co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles.IngresarAlRolMasterTask.ingresarAlRolMaster;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditarRolStepDefinitions {

    @Y("^el usuario ingresa al rol master$")
    public void el_usuario_ingresa_al_rol_master() {
        theActorInTheSpotlight().attemptsTo(
                ingresarAlRolMaster()
        );
    }

    @Entonces("^el usuario deberia poder ver que el boton editar no esta presente$")
    public void el_usuario_deberia_poder_ver_que_el_boton_editar_no_esta_presente() {
        theActorInTheSpotlight().should(seeThat(validarRolMasterNoEditable()));
    }

    @Y("^el usuario ingresa a editar un rol$")
    public void el_usuario_ingresa_a_editar_un_rol() {
        theActorInTheSpotlight().attemptsTo(
                ingresarAlRolEditar(),
                clicEditarRol()
        );
    }

    @Y("^el usuario edita los datos del rol$")
    public void el_usuario_edita_los_datos_del_rol() {
        theActorInTheSpotlight().attemptsTo(
                editarDatosDelRol()
        );
    }

    @Y("^el usuario edita los productos del rol$")
    public void el_usuario_edita_los_productos_del_rol() {
        theActorInTheSpotlight().attemptsTo(
                editarProductosDelRol()
        );

    }

    @Y("^el usuario edita los permisos y restricciones del rol$")
    public void el_usuario_edita_los_permisos_y_restricciones_del_rol() {
        theActorInTheSpotlight().attemptsTo(
                editarPermisosDelRol()
        );
    }

    @Y("^el usuario edita los autorizadores del rol$")
    public void el_usuario_edita_los_autorizadores_del_rol() {
        theActorInTheSpotlight().attemptsTo(
                editarAutorizadoresDelRol()
        );
    }

    @Y("^el usuario guarda los cambios$")
    public void el_usuario_guarda_los_cambios() {
        theActorInTheSpotlight().attemptsTo(
                guardarCambiosRol()
        );

    }

    @Entonces("^el usuario deberia poder ingresar al rol editado y ver los cambios realizados$")
    public void el_usuario_deberia_poder_ingresar_al_rol_editado_y_ver_los_cambios_realizados() {
        theActorInTheSpotlight().attemptsTo(
                accederAlMenuGestionUsuarios(),
                accederARoles(),
                ingresarAlRolEditar());
        theActorInTheSpotlight().should(seeThat(validarEdicionNombreRol()));
        theActorInTheSpotlight().should(seeThat(validarEdicionDescripcionRol()));
        theActorInTheSpotlight().should(seeThat(validarEdicionProductoRol()));
        theActorInTheSpotlight().should(seeThat(validarEdicionPermisoAdministracionRol()));
        theActorInTheSpotlight().should(seeThat(validarEdicionAutorizadorRol()));
    }

    @Y("^el usuario deshace los cambios$")
    public void el_usuario_deshace_los_cambios() {
        theActorInTheSpotlight().attemptsTo(
                deshacerCambiosRolEditado(),
                guardarCambiosRol()
        );
    }
}