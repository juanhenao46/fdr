package co.com.dannregional.testing.fdr.stepdefinitions.administracion.etiquetasIdentificacion;

import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.administracion.etiquetasIdentificacion.ValidaPopUpEtiquetaActualizadaQuestion.validaPopUpEtiquetaActualizada;
import static co.com.dannregional.testing.fdr.questions.administracion.etiquetasIdentificacion.ValidaPopUpEtiquetaCreadaQuestion.validaPopUpEtiquetaCreada;
import static co.com.dannregional.testing.fdr.tasks.administracion.etiquetasIdentificacion.AccederAlMenuEtiquetasDeIdentificacionTask.accederAlMenuEtiquetasDeIdentificacion;
import static co.com.dannregional.testing.fdr.tasks.administracion.etiquetasIdentificacion.CrearNuevaEtiquetaDeIdentificacionTask.crearNuevaEtiquetaDeIdentificacion;
import static co.com.dannregional.testing.fdr.tasks.administracion.etiquetasIdentificacion.EditarEtiquetaDeIdentificacionTask.editarEtiquetaDeIdentificacion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class EtiquetasDeIdentificacionStepDefinitions {

    @Y("^el usuario ingresa a la opcion etiquetas de identificacion$")
    public void el_usuario_ingresa_a_la_opcion_etiquetas_de_identificacion() {
        theActorInTheSpotlight().attemptsTo(
                accederAlMenuEtiquetasDeIdentificacion()
        );
    }

    @Y("^el usuario crea una nueva etiqueta de identificacion$")
    public void el_usuario_crea_una_nueva_etiqueta_de_identificacion() {
        theActorInTheSpotlight().attemptsTo(
                crearNuevaEtiquetaDeIdentificacion()
        );
    }

    @Entonces("^el usuario deberia poder ver el mensaje de creacion de etiqueta exitosa$")
    public void el_usuario_deberia_poder_ver_el_mensaje_de_creacion_de_etiqueta_exitosa() {
        theActorInTheSpotlight().should(seeThat(validaPopUpEtiquetaCreada()));
    }

    @Y("^el usuario edita una etiqueta de identificacion$")
    public void el_usuario_edita_una_etiqueta_de_identificacion() {
        theActorInTheSpotlight().attemptsTo(editarEtiquetaDeIdentificacion());

    }

    @Entonces("^el usuario deberia poder ver el mensaje de etiqueta editada con exito$")
    public void el_usuario_deberia_poder_ver_el_mensaje_de_etiqueta_editada_con_exito() {
        theActorInTheSpotlight().should(seeThat(validaPopUpEtiquetaActualizada()));
    }
}
