package co.com.dannregional.testing.fdr.stepdefinitions.transferencias.cuentasIris;

import cucumber.api.java.es.Cuando;

import static co.com.dannregional.testing.fdr.tasks.transferencias.bancoIris.AccederACuentasIrisTask.accederABancoIris;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TransferenciaExitosaCuentasIrisStepDefinitions {

    @Cuando("^el usuario ingresa a transferencias cuentas iris$")
    public void el_usuario_ingresa_a_transferencias_cuentas_iris() {
        theActorInTheSpotlight().attemptsTo(
                accederABancoIris()
        );
    }
}

