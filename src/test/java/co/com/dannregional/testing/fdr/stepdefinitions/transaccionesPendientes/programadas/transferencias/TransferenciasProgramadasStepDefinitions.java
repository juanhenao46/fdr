package co.com.dannregional.testing.fdr.stepdefinitions.transaccionesPendientes.programadas.transferencias;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.transaccionesPendientes.programadas.ValidaColumnasTablaTransferenciasProgramadasQuestion.validaColumnasTablaTransferenciasProgramadas;
import static co.com.dannregional.testing.fdr.questions.transaccionesPendientes.programadas.ValidaPopUpTransaccionEliminadaQuestion.validaPopUpTransaccionEliminada;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.pantallaTransaccionesPendientes.AccederAlMenuTransaccionesPendientesTask.accederAlMenuTransaccionesPendientes;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas.AbrirDetalleDeTransferenciaProgramadaTask.abrirDetalleDeTransferenciaProgramada;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas.AccederAlMenuProgramadasTask.accederAlMenuProgramadas;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas.EliminarProgramacionModalTask.eliminarProgramacionModal;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas.EliminarProgramacionTask.eliminarProgramacion;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.programadas.SeleccionarCheckboxTransferenciaProgramadaTask.seleccionarCheckboxTransferenciaProgramada;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TransferenciasProgramadasStepDefinitions {

    @Cuando("^el usuario ingresa a transacciones pendientes$")
    public void el_usuario_ingresa_a_transacciones_pendientes() {
        theActorInTheSpotlight().attemptsTo(
                accederAlMenuTransaccionesPendientes()
        );
    }

    @Y("^el usuario selecciona opcion programadas$")
    public void el_usuario_selecciona_opcion_programadas() {
        theActorInTheSpotlight().attemptsTo(
                accederAlMenuProgramadas()
        );
    }

    @Entonces("^el usuario deberia poder validar la tabla con informacion de transferencias programadas$")
    public void el_usuario_deberia_poder_validar_la_tabla_con_informacion_de_transferencias_programadas() {
        theActorInTheSpotlight().should(seeThat(validaColumnasTablaTransferenciasProgramadas()));
    }

    @Y("^el usuario selecciona el checkbox de una transferencia programada$")
    public void el_usuario_selecciona_el_checkbox_de_una_transferencia_programada() {
        theActorInTheSpotlight().attemptsTo(
                seleccionarCheckboxTransferenciaProgramada()
        );
    }

    @Y("^el usuario abre el detalle de una transferencia programada$")
    public void el_usuario_abre_el_detalle_de_una_transferencia_programada() {
        theActorInTheSpotlight().attemptsTo(
                abrirDetalleDeTransferenciaProgramada()
        );
    }

    @Y("^el usuario elimina la programacion$")
    public void el_usuario_elimina_la_programacion() {
        theActorInTheSpotlight().attemptsTo(
                eliminarProgramacion()
        );
    }

    @Y("^el usuario elimina la programacion desde el modal$")
    public void el_usuario_elimina_la_programacion_desde_el_modal() {
        theActorInTheSpotlight().attemptsTo(
                eliminarProgramacionModal()
        );
    }
    @Entonces("^el usuario deberia poder ver mensaje de transaccion eliminada con exito$")
    public void el_usuario_deberia_poder_ver_mensaje_de_transaccion_eliminada_con_exito() {
        theActorInTheSpotlight().should(seeThat(validaPopUpTransaccionEliminada()));

    }

}
