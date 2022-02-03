package co.com.dannregional.testing.fdr.stepdefinitions.transferencias.cuentasIris;

import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.ClicEnSiguiente.clicEnSiguiente;
import static co.com.dannregional.testing.fdr.questions.transferencias.comunes.ValidaTextoGuardaEstaCuentaQuestion.validaTextoGuardaEstaCuenta;
import static co.com.dannregional.testing.fdr.tasks.transferencias.bancoIris.IngresarNuevaCuentaIrisTask.ingresarNuevaCuentaIris;
import static co.com.dannregional.testing.fdr.tasks.transferencias.comunes.IngresarValorTask.ingresarValor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TransferenciaInscribirCuentaIrisStepDefinitions {

    @Y("^el usuario inscribe una cuenta desde cuenta destino$")
    public void el_usuario_inscribe_una_cuenta_desde_cuenta_destino() {
        theActorInTheSpotlight().attemptsTo(
                ingresarNuevaCuentaIris()
        );
    }

    @Y("^el usuario completa los campos requeridos para transferir e inscribir la cuenta$")
    public void el_usuario_completa_los_campos_requeridos_para_transferir_e_inscribir_la_cuenta() {
        theActorInTheSpotlight().attemptsTo(
                ingresarValor(),
                clicEnSiguiente(),
                clicEnSiguiente()
        );
        theActorInTheSpotlight().should(seeThat(validaTextoGuardaEstaCuenta()));
    }
}
