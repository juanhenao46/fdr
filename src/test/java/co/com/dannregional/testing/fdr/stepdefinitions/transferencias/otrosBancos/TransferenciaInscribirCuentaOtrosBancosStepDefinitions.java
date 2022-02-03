package co.com.dannregional.testing.fdr.stepdefinitions.transferencias.otrosBancos;

import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.tasks.transferencias.otrosBancos.IngresarNuevaCuentaOtrosBancosTask.ingresarNuevaCuentaOtrosBancos;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TransferenciaInscribirCuentaOtrosBancosStepDefinitions {

    @Y("^el usuario inscribe una cuenta de otro banco desde cuenta destino$")
    public void el_usuario_inscribe_una_cuenta_de_otro_banco_desde_cuenta_destino() {
        theActorInTheSpotlight().attemptsTo(
                ingresarNuevaCuentaOtrosBancos()
        );
    }
}
