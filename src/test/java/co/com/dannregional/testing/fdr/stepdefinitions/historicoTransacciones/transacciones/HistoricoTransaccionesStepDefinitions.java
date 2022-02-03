package co.com.dannregional.testing.fdr.stepdefinitions.historicoTransacciones.transacciones;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.historicoTransacciones.transacciones.ValidaColumnasTablaHistoricoTransaccionesQuestion.validaColumnasTablaHistoricoTransacciones;
import static co.com.dannregional.testing.fdr.questions.historicoTransacciones.transacciones.ValidaFiltrarTipoCuentasIrisQuestion.validaFiltrarTipoCuentasIris;
import static co.com.dannregional.testing.fdr.questions.historicoTransacciones.transacciones.ValidaFiltrarTipoCuentasPropiasQuestion.validaFiltrarTipoCuentasPropias;
import static co.com.dannregional.testing.fdr.questions.historicoTransacciones.transacciones.ValidaFiltrarTipoOtrosBancosQuestion.validaFiltrarTipoOtrosBancos;
import static co.com.dannregional.testing.fdr.questions.historicoTransacciones.transacciones.ValidaTituloModalTransaccionQuestion.validaTituloModalTransaccion;
import static co.com.dannregional.testing.fdr.tasks.historicoTransacciones.transacciones.AbrirDetalleDeTransferenciaHistoricoTask.abrirDetalleDeTransferenciaHistorico;
import static co.com.dannregional.testing.fdr.tasks.historicoTransacciones.transacciones.AccederAlMenuHistoricoTransaccionesTask.accederAlMenuHistoricoTransacciones;
import static co.com.dannregional.testing.fdr.tasks.historicoTransacciones.transacciones.FiltrarTipoTransferenciaCuentasIrisTask.filtrarTipoCuentasIris;
import static co.com.dannregional.testing.fdr.tasks.historicoTransacciones.transacciones.FiltrarTipoTransferenciaCuentasPropiasTask.filtrarTipoCuentasPropias;
import static co.com.dannregional.testing.fdr.tasks.historicoTransacciones.transacciones.FiltrarTipoTransferenciaOtrosBancosTask.filtrarTipoOtrosBancos;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class HistoricoTransaccionesStepDefinitions {

    @Cuando("^el usuario ingresa a historico de transacciones$")
    public void el_usuario_ingresa_a_historico_de_transacciones() {
        theActorInTheSpotlight().attemptsTo(
                accederAlMenuHistoricoTransacciones()
        );
    }

    @Entonces("^el usuario deberia poder validar el filtro tipo de transferencia$")
    public void el_usuario_deberia_poder_validar_el_filtro_tipo_de_transferencia() {
        theActorInTheSpotlight().attemptsTo(filtrarTipoOtrosBancos());
        theActorInTheSpotlight().should(seeThat(validaFiltrarTipoOtrosBancos()));
        theActorInTheSpotlight().attemptsTo(filtrarTipoCuentasPropias());
        theActorInTheSpotlight().should(seeThat(validaFiltrarTipoCuentasPropias()));
        theActorInTheSpotlight().attemptsTo(filtrarTipoCuentasIris());
        theActorInTheSpotlight().should(seeThat(validaFiltrarTipoCuentasIris()));
    }

    @Y("^el usuario abre el detalle de una transaccion del historico$")
    public void el_usuario_abre_el_detalle_de_una_transaccion_del_historico() {
        theActorInTheSpotlight().attemptsTo(abrirDetalleDeTransferenciaHistorico());

    }

    @Entonces("^el usuario deberia poder validar el modal de la transaccion$")
    public void el_usuario_deberia_poder_validar_el_modal_de_la_transaccion() {
        theActorInTheSpotlight().should(seeThat(validaTituloModalTransaccion()));
    }

    @Entonces("^el usuario deberia poder validar la tabla con informacion del historico de transacciones$")
    public void el_usuario_deberia_poder_validar_la_tabla_con_informacion_del_historico_de_transacciones() {
        theActorInTheSpotlight().should(seeThat(validaColumnasTablaHistoricoTransacciones()));
    }
}
