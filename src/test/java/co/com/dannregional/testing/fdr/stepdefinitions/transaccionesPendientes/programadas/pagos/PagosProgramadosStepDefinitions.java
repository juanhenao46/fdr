package co.com.dannregional.testing.fdr.stepdefinitions.transaccionesPendientes.programadas.pagos;

import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.transaccionesPendientes.programadas.ValidaColumnasTablaPagosProgramadosQuestion.validaColumnasTablaPagosProgramados;
import static co.com.dannregional.testing.fdr.questions.transaccionesPendientes.programadas.ValidaFiltrarTipoManualesNominasQuestion.validaFiltrarTipoManualesNominas;
import static co.com.dannregional.testing.fdr.questions.transaccionesPendientes.programadas.ValidaFiltrarTipoManualesProveedoresQuestion.validaFiltrarTipoManualesProveedores;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas.AbrirDetalleDePagoProgramadoTask.abrirDetalleDePagoProgramado;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas.AccederAPestañaPagosTask.accederAPestañaPagos;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas.FiltrarTipoManualesNominasTask.filtrarTipoManualesNominas;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas.FiltrarTipoManualesProveedoresTask.filtrarTipoManualesProveedores;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas.SeleccionarCheckboxPagoProgramadoTask.seleccionarCheckboxPagoProgramado;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PagosProgramadosStepDefinitions {

    @Y("^el usuario ingresa a la pestaña de pagos$")
    public void el_usuario_ingresa_a_la_pestaña_de_pagos() {
        theActorInTheSpotlight().attemptsTo(
                accederAPestañaPagos()
        );
    }

    @Y("^el usuario selecciona el checkbox de un pago programado$")
    public void el_usuario_selecciona_el_checkbox_de_un_pago_programado() {
        theActorInTheSpotlight().attemptsTo(seleccionarCheckboxPagoProgramado());
    }

    @Entonces("^el usuario deberia poder validar el filtro tipo de pago programado$")
    public void el_usuario_deberia_poder_validar_el_filtro_tipo_de_pago_programado() {
        theActorInTheSpotlight().attemptsTo(filtrarTipoManualesNominas());
        theActorInTheSpotlight().should(seeThat(validaFiltrarTipoManualesNominas()));
        theActorInTheSpotlight().attemptsTo(filtrarTipoManualesProveedores());
        theActorInTheSpotlight().should(seeThat(validaFiltrarTipoManualesProveedores()));
    }

    @Entonces("^el usuario deberia poder validar la tabla con informacion de pagos programados$")
    public void el_usuario_deberia_poder_validar_la_tabla_con_informacion_de_pagos_programados() {
        theActorInTheSpotlight().should(seeThat(validaColumnasTablaPagosProgramados()));
    }

    @Y("^el usuario abre el detalle de un pago programado$")
    public void el_usuario_abre_el_detalle_de_un_pago_programado() {
        theActorInTheSpotlight().attemptsTo(abrirDetalleDePagoProgramado());
    }
}
