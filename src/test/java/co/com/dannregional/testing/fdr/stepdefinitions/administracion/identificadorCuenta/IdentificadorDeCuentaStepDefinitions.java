package co.com.dannregional.testing.fdr.stepdefinitions.administracion.identificadorCuenta;

import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.administracion.etiquetasIdentificacion.ValidaPopUpEtiquetaActualizadaQuestion.validaPopUpEtiquetaActualizada;
import static co.com.dannregional.testing.fdr.tasks.administracion.identificadorCuenta.AccederAlMenuIdentificadorDeCuentaTask.accederAlMenuIdentificadorDeCuenta;
import static co.com.dannregional.testing.fdr.tasks.administracion.identificadorCuenta.EditarIdentificadorDeCuentaTask.editarIdentificadorDeCuenta;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IdentificadorDeCuentaStepDefinitions {

    @Y("^el usuario ingresa a la opcion identificador de cuentas$")
    public void el_usuario_ingresa_a_la_opcion_identificador_de_cuentas() {
        theActorInTheSpotlight().attemptsTo(
                accederAlMenuIdentificadorDeCuenta()
        );
    }

    @Y("^el usuario crea un nuevo identificador de cuentas$")
    public void el_usuario_crea_un_nuevo_identificador_de_cuentas() {
    }

    @Entonces("^el usuario deberia poder ver el mensaje de creacion de identificador exitosa$")
    public void el_usuario_deberia_poder_ver_el_mensaje_de_creacion_de_identificador_exitosa() {
    }

    @Y("^el usuario edita un identificador de cuentas$")
    public void el_usuario_edita_un_identificador_de_cuentas() {
        theActorInTheSpotlight().attemptsTo(
                editarIdentificadorDeCuenta()
        );

    }

    @Entonces("^el usuario deberia poder ver el mensaje de identificador editado con exito$")
    public void el_usuario_deberia_poder_ver_el_mensaje_de_identificador_editado_con_exito() {
        theActorInTheSpotlight().should(seeThat(validaPopUpEtiquetaActualizada()));
    }
}
