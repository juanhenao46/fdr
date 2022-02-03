package co.com.dannregional.testing.fdr.stepdefinitions.resumen.detalleDeCuenta;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.dannregional.testing.fdr.questions.resumen.filtrarSaldos.ValidaOcultarSaldoQuestion.validaOcultarSaldo;
import static co.com.dannregional.testing.fdr.questions.resumen.detalleDeCuenta.ValidaDetalleDeCuentaQuestion.validaDetalleDeCuenta;
import static co.com.dannregional.testing.fdr.tasks.resumen.detalleDeCuenta.VerDetalleCuentaTask.verDetalleCuenta;
import static co.com.dannregional.testing.fdr.tasks.salir.CerrarSesionTask.cerrarSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DetalleDeCuentaStepDefinitions {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }

    @Cuando("^el usuario da clic en una de sus cuentas$")
    public void el_usuario_da_clic_en_una_de_sus_cuentas() {
        theActorInTheSpotlight().attemptsTo(verDetalleCuenta());
    }

    @Entonces("^el usuario deberia poder ver el detalle de la cuenta y los saldos ocultos$")
    public void el_usuario_deberia_poder_ver_el_detalle_de_la_cuenta_y_los_saldos_ocultos() {
        theActorInTheSpotlight().should(seeThat(
                validaDetalleDeCuenta()));
        theActorInTheSpotlight().should(seeThat(
                validaOcultarSaldo()));
    }
}
