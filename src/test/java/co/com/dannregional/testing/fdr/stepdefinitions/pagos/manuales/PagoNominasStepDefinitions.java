package co.com.dannregional.testing.fdr.stepdefinitions.pagos.manuales;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.IngresarOTPInscribirCuentas.ingresarOTPInscribirCuentas;
import static co.com.dannregional.testing.fdr.interactions.bancoIris.IngresarOTPTransferencias.ingresarOTPTransferencias;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.questions.pagos.manuales.ValidaTituloOtrosBancosQuestion.validaTituloOtrosBancos;
import static co.com.dannregional.testing.fdr.questions.pagos.manuales.ValidaTituloPagoGuardadoQuestion.validaTituloPagoGuardado;
import static co.com.dannregional.testing.fdr.questions.pagos.manuales.ValidaTituloTransaccionPendienteQuestion.validaTituloTransaccionPendiente;
import static co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas.EnviarLoteTask.enviarLote;
import static co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas.IngresarDetalleTask.ingresarDetalle;
import static co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas.IngresarDosPagosTask.ingresarDosPagos;
import static co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas.IngresarUnPagoNuevaCuentaTask.ingresarUnPagoNuevaCuenta;
import static co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas.IngresarUnPagoTask.ingresarUnPago;
import static co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas.SeleccionarNominasTask.seleccionarNominas;
import static co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas.SeleccionarOrigenYFechaTask.seleccionarOrigenYFecha;
import static co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas.SeleccionarSoloOrigenTask.seleccionarSoloOrigen;
import static co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas.GuardarPagoTask.guardarPago;
import static co.com.dannregional.testing.fdr.tasks.pagos.pantallaPagos.AccederAPagosManualesTask.accederAPagosManuales;
import static co.com.dannregional.testing.fdr.tasks.pagos.pantallaPagos.AccederAlMenuPagosTask.accederAlMenuPagos;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PagoNominasStepDefinitions {

    @Cuando("^el usuario ingresa a pagos manuales$")
    public void el_usuario_ingresa_a_pagos_manuales() {
        theActorInTheSpotlight().attemptsTo(
                accederAlMenuPagos(),
                accederAPagosManuales()
        );

    }
    @Y("^el usuario selecciona opcion nominas$")
    public void el_usuario_selecciona_opcion_nominas() {
        theActorInTheSpotlight().attemptsTo(
                seleccionarNominas()
        );
    }

    @Y("^el usuario selecciona cuenta origen$")
    public void el_usuario_selecciona_cuenta_origen() {
        theActorInTheSpotlight().attemptsTo(
                seleccionarSoloOrigen()
        );
    }

    @Y("^el usuario selecciona cuenta origen y fecha$")
    public void el_usuario_selecciona_cuenta_origen_y_fecha() {
        theActorInTheSpotlight().attemptsTo(
                seleccionarOrigenYFecha()
        );
    }

    @Y("^el usuario ingresa el detalle del pago$")
    public void el_usuario_ingresa_el_detalle_del_pago() {
        theActorInTheSpotlight().attemptsTo(
                ingresarDetalle()
        );
    }

    @Y("^el usuario ingresa un pago$")
    public void el_usuario_ingresa_un_pago() {
        theActorInTheSpotlight().attemptsTo(
                ingresarUnPago()
        );
    }

    @Y("^el usuario ingresa dos pagos$")
    public void el_usuario_ingresa_dos_pagos() {
        theActorInTheSpotlight().attemptsTo(ingresarDosPagos());
    }

    @Y("^el usuario ingresa un pago a nueva cuenta otros bancos y la inscribe$")
    public void el_usuario_ingresa_un_pago_a_nueva_cuenta_otros_bancos_y_la_inscribe() {
        theActorInTheSpotlight().attemptsTo(
                ingresarUnPagoNuevaCuenta()
        );
    }

    @Y("^el usuario envia el lote$")
    public void el_usuario_envia_el_lote() {
        theActorInTheSpotlight().attemptsTo(
                enviarLote(),
                ingresarOTPInscribirCuentas()
        );
    }

    @Y("^el usuario guarda el pago$")
    public void el_usuario_guarda_el_pago() {
        theActorInTheSpotlight().attemptsTo(
                guardarPago()
        );
    }
    @Entonces("^el usuario deberia poder ver mensaje de transaccion pendiente$")
    public void el_usuario_deberia_poder_ver_mensaje_de_transaccion_pendiente(){
        theActorInTheSpotlight().should(seeThat(validaTituloTransaccionPendiente()));
    }
}
