package co.com.dannregional.testing.fdr.stepdefinitions.administracion.notificaciones;

import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.administracion.notificaciones.ValidaPopUpNotificacionesActualizadasQuestion.validaPopUpNotificacionesActualizadas;
import static co.com.dannregional.testing.fdr.tasks.administracion.notificaciones.AccederAlMenuNotificacionesTask.accederAlMenuNotificaciones;
import static co.com.dannregional.testing.fdr.tasks.administracion.notificaciones.ActivarNotificacionTask.activarNotificacion;
import static co.com.dannregional.testing.fdr.tasks.administracion.notificaciones.DesactivarNotificacionTask.desactivarNotificacion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NotificacionesStepDefinitions {

    @Y("^el usuario ingresa a la opcion notificaciones$")
    public void el_usuario_ingresa_a_la_opcion_notificaciones() {
        theActorInTheSpotlight().attemptsTo(
                accederAlMenuNotificaciones()
        );
    }



    @Y("^el usuario activa una notificacion$")
    public void el_usuario_activa_una_notificacion() {
        theActorInTheSpotlight().attemptsTo(
                activarNotificacion()
        );
    }

    @Y("^el usuario desactiva una notificacion$")
    public void el_usuario_desactiva_una_notificacion() {
        theActorInTheSpotlight().attemptsTo(
                desactivarNotificacion()
        );
    }

    @Entonces("^el usuario deberia poder ver el pop up de notificaciones actualizadas con exito$")
    public void el_usuario_deberia_poder_ver_el_pop_up_de_notificaciones_actualizadas_con_exito() {
        theActorInTheSpotlight().should(seeThat(validaPopUpNotificacionesActualizadas())
        );
    }
}
