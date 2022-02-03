package co.com.dannregional.testing.fdr.stepdefinitions.pagos.guardados;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.pagos.manuales.ValidaTituloPagoGuardadoQuestion.validaTituloPagoGuardado;
import static co.com.dannregional.testing.fdr.tasks.pagos.guardados.EditarPagoTask.editarPago;
import static co.com.dannregional.testing.fdr.tasks.pagos.guardados.EliminarPagoTask.eliminarPago;
import static co.com.dannregional.testing.fdr.tasks.pagos.pantallaPagos.AccederAPagosGuardadosTask.accederAPagosGuardados;
import static co.com.dannregional.testing.fdr.tasks.pagos.pantallaPagos.AccederAlMenuPagosTask.accederAlMenuPagos;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PagosGuardadosStepDefinitions {

    @Cuando("^el usuario ingresa a pagos guardados$")
    public void el_usuario_ingresa_a_pagos_guardados() {
        theActorInTheSpotlight().attemptsTo(
                accederAlMenuPagos(),
                accederAPagosGuardados()
        );

    }

    @Entonces("^el usuario deberia poder ver mensaje de pago guardado$")
    public void el_usuario_deberia_poder_ver_mensaje_de_pago_guardado() {
        theActorInTheSpotlight().should(seeThat(validaTituloPagoGuardado()));
    }

    @Y("^el usuario elimina el pago$")
    public void el_usuario_elimina_el_pago() {
        theActorInTheSpotlight().attemptsTo(eliminarPago());
    }

    @Y("^el usuario edita el pago$")
    public void el_usuario_edita_el_pago() {
        theActorInTheSpotlight().attemptsTo(editarPago());
    }
}
