package co.com.dannregional.testing.fdr.stepdefinitions.transferencias.cuentasPropias;

import cucumber.api.java.es.Y;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.dannregional.testing.fdr.tasks.transferencias.comunes.ProgramarTransferenciaTask.programarTransferencia;

public class TransferenciaProgramadaCuentasPropiasStepDefinitions {

    @Y("^el usuario completa los campos requeridos para programar la transferencia$")
    public void el_usuario_completa_los_campos_requeridos_para_programar_la_transferencia() {
        theActorInTheSpotlight().attemptsTo(
                programarTransferencia()
        );
    }
}
