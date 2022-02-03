package co.com.dannregional.testing.fdr.stepdefinitions.transferencias.cuentasPropias;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.transferencias.comunes.ValidaTituloTransaccionExitosaQuestion.validaTituloTransaccionExitosa;
import static co.com.dannregional.testing.fdr.questions.transferencias.comunes.ValidaTituloTransaccionPendienteAutorizacionQuestion.validaTituloTransaccionPendienteAutorizacion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.dannregional.testing.fdr.questions.transferencias.comunes.ValidarResumenDeTransferenciaQuestion.validarResumenDeTransferencia;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasPropias.AccederACuentasPropiasTask.accederACuentasPropias;
import static co.com.dannregional.testing.fdr.tasks.transferencias.comunes.TransferenciaExitosaTask.transferenciaCuentasPropiasExitosa;
import static co.com.dannregional.testing.fdr.tasks.transferencias.comunes.EjecutarTransferenciaTask.ejecutarTransferencia;

public class TransferenciaExitosaCuentasPropiasStepDefinitions {

    @Cuando("^el usuario ingresa a transferencias cuentas propias$")
    public void el_usuario_ingresa_a_transferencias_cuentas_propias() {
        theActorInTheSpotlight().attemptsTo(
                accederACuentasPropias()
        );

    }
    @Y("^el usuario completa correctamente los campos requeridos para transferir$")
    public void el_usuario_completa_correctamente_los_campos_requeridos_para_transferir() {
        theActorInTheSpotlight().attemptsTo(
                transferenciaCuentasPropiasExitosa()
        );
    }
    @Entonces("^el usuario deberia ver el resumen de la transferencia$")
    public void el_usuario_deberia_ver_el_resumen_de_transferencia() {
        theActorInTheSpotlight().should(seeThat(validarResumenDeTransferencia()));
    }
    @Y("^el usuario ejecuta la transferencia$")
    public void el_usuario_ejecuta_la_transferencia() {
        theActorInTheSpotlight().attemptsTo(
                ejecutarTransferencia()
        );
    }
    @Entonces("^el usuario deberia poder ver mensaje de transaccion exitosa$")
    public void el_usuario_deberia_poder_ver_mensaje_de_transaccion_exitosa() {
        theActorInTheSpotlight().should(seeThat(validaTituloTransaccionExitosa()));
    }

    @Entonces("^el usuario deberia poder ver mensaje de transferencia pendiente de aprobacion$")
    public void el_usuario_deberia_poder_ver_mensaje_de_transferencia_pendiente_de_aprobacion() {
        theActorInTheSpotlight().should(seeThat(validaTituloTransaccionPendienteAutorizacion()));
    }
}
