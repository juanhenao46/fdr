package co.com.dannregional.testing.fdr.stepdefinitions.transferencias.otrosBancos;

import cucumber.api.java.es.Cuando;

import static co.com.dannregional.testing.fdr.tasks.transferencias.otrosBancos.AccederAOtrosBancosTask.accederAOtrosBancosTask;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TransferenciaExitosaOtrosBancosStepDefinitions {

    @Cuando("^el usuario ingresa a transferencias otros bancos$")
    public void el_usuario_ingresa_a_transferencias_otros_bancos() {
        theActorInTheSpotlight().attemptsTo(
                accederAOtrosBancosTask()
        );
    }
}
