package co.com.dannregional.testing.fdr.stepdefinitions.historicoTransacciones.pagosLotes;

import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;


import static co.com.dannregional.testing.fdr.questions.historicoTransacciones.pagosLotes.ValidaColumnasTablaHistoricoPagosQuestion.validaColumnasTablaHistoricoPagos;
import static co.com.dannregional.testing.fdr.questions.historicoTransacciones.pagosLotes.ValidaFiltrarTipoManualesNominasQuestion.validaFiltrarTipoManualesNominas;
import static co.com.dannregional.testing.fdr.questions.historicoTransacciones.pagosLotes.ValidaFiltrarTipoManualesProveedoresQuestion.validaFiltrarTipoManualesProveedores;
import static co.com.dannregional.testing.fdr.questions.historicoTransacciones.pagosLotes.ValidaTituloModalPagoQuestion.validaTituloModalPago;
import static co.com.dannregional.testing.fdr.tasks.historicoTransacciones.pagosLotes.AbrirDetalleDePagoHistoricoTask.abrirDetalleDePagoHistorico;
import static co.com.dannregional.testing.fdr.tasks.historicoTransacciones.pagosLotes.AccederAlHistoricoPagosTask.accederAlHistoricoPagos;
import static co.com.dannregional.testing.fdr.tasks.historicoTransacciones.pagosLotes.FiltrarTipoPagoManualesNominasTask.filtrarTipoPagoManualesNominas;
import static co.com.dannregional.testing.fdr.tasks.historicoTransacciones.pagosLotes.FiltrarTipoPagoManualesProveedoresTask.filtrarTipoPagoManualesProveedores;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HistoricoPagosLotesStepDefinitions {

    @Y("^el usuario ingresa a la pestaña pagos y lotes$")
    public void el_usuario_ingresa_a_la_pestaña_pagos_y_lotes() {
        theActorInTheSpotlight().attemptsTo(
                accederAlHistoricoPagos()
        );
    }

    @Entonces("^el usuario deberia poder validar el filtro tipo de pago$")
    public void el_usuario_deberia_poder_validar_el_filtro_tipo_de_pago() {
        theActorInTheSpotlight().attemptsTo(filtrarTipoPagoManualesNominas());
        theActorInTheSpotlight().should(seeThat(validaFiltrarTipoManualesNominas()));
        theActorInTheSpotlight().attemptsTo(filtrarTipoPagoManualesProveedores());
        theActorInTheSpotlight().should(seeThat(validaFiltrarTipoManualesProveedores()));
    }

    @Y("^el usuario abre el detalle de un pago historico$")
    public void el_usuario_abre_el_detalle_de_un_pago_historico() {
        theActorInTheSpotlight().attemptsTo(abrirDetalleDePagoHistorico());
    }

    @Entonces("^el usuario deberia poder validar el modal del pago$")
    public void el_usuario_deberia_poder_validar_el_modal_del_pago() {
        theActorInTheSpotlight().should(seeThat(validaTituloModalPago()));
    }

    @Entonces("^el usuario deberia poder validar la tabla con informacion del historico de pagos$")
    public void el_usuario_deberia_poder_validar_la_tabla_con_informacion_del_historico_de_pagos() {
        theActorInTheSpotlight().should(seeThat(validaColumnasTablaHistoricoPagos()));
    }
}
