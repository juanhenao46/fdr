package co.com.dannregional.testing.fdr.stepdefinitions.transaccionesPendientes.autorizaciones.misAutorizaciones;

import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.transaccionesPendientes.autorizaciones.ValidaColumnasTablaMisAutorizacionesQuestion.validaColumnasTablaMisAutorizaciones;
import static co.com.dannregional.testing.fdr.questions.transaccionesPendientes.autorizaciones.ValidaFiltrarOperacionPagosQuestion.validaFiltrarOperacionPagos;
import static co.com.dannregional.testing.fdr.questions.transaccionesPendientes.autorizaciones.ValidaFiltrarOperacionTransferenciasQuestion.validaFiltrarOperacionTransferencias;
import static co.com.dannregional.testing.fdr.questions.transaccionesPendientes.autorizaciones.ValidaPopUpTransaccionesAutorizadasQuestion.validaPopUpTransaccionesAutorizadas;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones.AbrirDetalleDeAutorizacionTask.abrirDetalleDeAutorizacion;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones.AccederALaPestañaMisAutorizacionesTask.accederPestañaMisAutorizaciones;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones.AccederAlMenuAutorizacionTask.accederAlMenuAutorizacion;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones.AutorizarTransaccionModalTask.autorizarTransaccionModal;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones.AutorizarTransaccionesSeleccionadasCheckTask.autorizarTransaccionesSeleccionadasCheck;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones.FiltrarOperacionPagosTask.filtrarOperacionPagos;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones.FiltrarOperacionTransferenciasTask.filtrarOperacionTransferencias;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones.SeleccionarCheckPrimerRegistroTask.seleccionarCheckPrimerRegistro;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MisAutorizacionesStepDefinitions {

    @Y("^el usuario selecciona opcion autorizaciones$")
    public void el_usuario_selecciona_opcion_autorizaciones(){
        theActorInTheSpotlight().attemptsTo(accederAlMenuAutorizacion());
    }

    @Y("^el usuario ingresa a la pestaña mis autorizaciones$")
    public void el_usuario_ingresa_a_la_pestaña_mis_autorizaciones(){
        theActorInTheSpotlight().attemptsTo(
                accederPestañaMisAutorizaciones()
        );
    }
    @Entonces("^el usuario deberia poder validar el filtro operacion$")
    public void el_usuario_deberia_poder_validar_el_filtro_operacion(){
        theActorInTheSpotlight().attemptsTo(filtrarOperacionTransferencias());
        theActorInTheSpotlight().should(seeThat(validaFiltrarOperacionTransferencias()));
        theActorInTheSpotlight().attemptsTo(filtrarOperacionPagos());
        theActorInTheSpotlight().should(seeThat(validaFiltrarOperacionPagos()));
    }

    @Entonces("^el usuario deberia poder validar la tabla con informacion de mis autorizaciones$")
    public void el_usuario_deberia_poder_validar_la_tabla_con_informacion_de_mis_autorizaciones() {
        theActorInTheSpotlight().should(seeThat(validaColumnasTablaMisAutorizaciones())
        );
    }

    @Y("^el usuario selecciona el checkbox de una autorizacion$")
    public void el_usuario_selecciona_el_checkbox_de_una_transaccion() {
        theActorInTheSpotlight().attemptsTo(
                seleccionarCheckPrimerRegistro()
        );
    }

    @Y("^el usuario abre el detalle de una autorizacion$")
    public void el_usuario_abre_el_detalle_de_una_autorizacion() {
        theActorInTheSpotlight().attemptsTo(
                abrirDetalleDeAutorizacion()
        );
    }

    @Y("^el usuario autoriza las transacciones seleccionadas$")
    public void el_usuario_autoriza_las_transacciones_seleccionadas() {
        theActorInTheSpotlight().attemptsTo(
                autorizarTransaccionesSeleccionadasCheck()
        );
    }
    @Y("^el usuario autoriza la transaccion desde el modal")
    public void el_usuario_autoriza_la_transaccion_desde_el_modal() {
        theActorInTheSpotlight().attemptsTo(
                autorizarTransaccionModal()
        );
    }

    @Entonces("^el usuario deberia poder ver mensaje de transacciones autorizadas con exito$")
    public void el_usuario_deberia_poder_ver_mensaje_de_transacciones_autorizadas_con_exito() {
        theActorInTheSpotlight().should(seeThat(validaPopUpTransaccionesAutorizadas()));
    }
}
