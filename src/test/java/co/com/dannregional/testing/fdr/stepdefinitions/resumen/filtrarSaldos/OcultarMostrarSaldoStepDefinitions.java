package co.com.dannregional.testing.fdr.stepdefinitions.resumen.filtrarSaldos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.resumen.filtrarSaldos.ValidaOcultarSaldoQuestion.validaOcultarSaldo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.dannregional.testing.fdr.tasks.salir.CerrarSesionTask.cerrarSesion;
import static co.com.dannregional.testing.fdr.tasks.resumen.filtrarSaldos.OcultarMostrarSaldoTask.ocultarMostrarSaldo;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class OcultarMostrarSaldoStepDefinitions {

    @Cuando("^el usuario da clic en el ojo para ocultar el saldo$")
    public void el_usuario_da_clic_en_el_ojo_para_ocultar_el_saldo() {
        theActorInTheSpotlight().attemptsTo(
                ocultarMostrarSaldo()
        );
    }

    @Entonces("^el usuario deberia poder ver los saldos ocultos$")
    public void el_usuario_deberia_poder_ver_los_saldos_ocultos() {
        theActorInTheSpotlight().should(seeThat(validaOcultarSaldo()));
    }
}
