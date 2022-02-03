package co.com.dannregional.testing.fdr.stepdefinitions.administracion.cambiarContraseña;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.administracion.cambiarContraseña.ValidaPopUpContraseñaActualizadaQuestion.validaPopUpContraseñaActualizada;
import static co.com.dannregional.testing.fdr.tasks.administracion.cambiarContraseña.AccederAlMenuCambiarContraseñaTask.accederAlMenuCambiarContraseña;
import static co.com.dannregional.testing.fdr.tasks.administracion.cambiarContraseña.IngresarContraseñaActualTask.ingresarContraseñaActual;
import static co.com.dannregional.testing.fdr.tasks.administracion.cambiarContraseña.IngresarRepetirNuevaContraseñaTask.ingresarRepetirNuevaContraseña;
import static co.com.dannregional.testing.fdr.tasks.administracion.pantallaAdministracion.AccederAlMenuAdministracionTask.accederAlMenuAdministracion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CambiarContraseñaStepDefinitions {

    @Cuando("^el usuario ingresa al menu de administracion$")
    public void el_usuario_ingresa_al_menu_de_administracion() {
        theActorInTheSpotlight().attemptsTo(
                accederAlMenuAdministracion()
        );
    }

    @Y("^el usuario ingresa a la opcion cambiar contraseña$")
    public void el_usuario_ingresa_a_la_opcion_cambiar_contraseña() {
        theActorInTheSpotlight().attemptsTo(
                accederAlMenuCambiarContraseña()
        );
    }

    @Y("^el usuario completa correctamente los campos para cambiar contraseña$")
    public void el_usuario_completa_correctamente_los_campos_para_cambiar_contraseña() {
        theActorInTheSpotlight().attemptsTo(
                ingresarContraseñaActual(),
                ingresarRepetirNuevaContraseña()

        );
    }

    @Entonces("^el usuario deberia poder ver el mensaje de cambio de contraseña exitoso$")
    public void el_usuario_deberia_poder_ver_el_mensaje_de_cambio_de_contraseña_exitoso() {
        theActorInTheSpotlight().should(seeThat(validaPopUpContraseñaActualizada()));
    }
}
