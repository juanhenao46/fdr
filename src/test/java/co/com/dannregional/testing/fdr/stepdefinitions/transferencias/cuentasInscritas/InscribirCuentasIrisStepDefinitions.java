package co.com.dannregional.testing.fdr.stepdefinitions.transferencias.cuentasInscritas;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.IngresarOTPInscribirCuentas.ingresarOTPInscribirCuentas;
import static co.com.dannregional.testing.fdr.questions.transferencias.cuentasInscritas.cuentasIris.ValidaPopUpInscripcionExitosaQuestion.validaPopUpInscripcionExitosa;
import static co.com.dannregional.testing.fdr.questions.transferencias.cuentasInscritas.cuentasIris.ValidarTitularDeLaCuentaQuestion.validarTitularDeLaCuenta;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.comunes.AccederACuentasInscritasTask.accederACuentasInscritas;
import static co.com.dannregional.testing.fdr.questions.transferencias.cuentasInscritas.cuentasIris.ValidarTipoDeCuentaQuestion.validarTipoDeCuenta;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.comunes.AccederAInscribirCuentasTask.accederAInscribirCuentas;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.inscribirCuentas.cuentasIris.ConcluirInscripcionTask.concluirInscripcion;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.inscribirCuentas.cuentasIris.EliminarCuentaIrisTask.eliminarCuentaIris;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.inscribirCuentas.cuentasIris.IngresarNumeroDeCuentaTask.ingresarNumeroDeCuenta;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InscribirCuentasIrisStepDefinitions {

    @Cuando("^el usuario ingresa a transferencias cuentas inscritas$")
    public void el_usuario_ingresa_a_transferencias_cuentas_inscritas() {
        theActorInTheSpotlight().attemptsTo(
                accederACuentasInscritas()
        );
    }

    @Cuando("^el usuario ingresa a transferencias inscribir cuentas$")
    public void el_usuario_ingresa_a_transferencias_inscribir_cuentas() {
        theActorInTheSpotlight().attemptsTo(
                accederACuentasInscritas(),
                accederAInscribirCuentas()
        );
    }
    @Y("^el usuario ingresa el numero de cuenta a inscribir y selecciona validar$")
    public void el_usuario_ingresa_el_numero_de_cuenta_a_inscribir_y_selecciona_validar() {
        theActorInTheSpotlight().attemptsTo(ingresarNumeroDeCuenta());
        theActorInTheSpotlight().should(seeThat(validarTipoDeCuenta()));
        theActorInTheSpotlight().should(seeThat(validarTitularDeLaCuenta()));
    }
    @Y("^el usuario concluye y ejecuta la inscripcion$")
    public void el_usuario_concluye_y_ejecuta_la_inscripcion() {
        theActorInTheSpotlight().attemptsTo(
                concluirInscripcion(),
                ingresarOTPInscribirCuentas()
        );
    }
    @Entonces("^el usuario deberia poder ver pop up de inscripcion exitosa$")
    public void el_usuario_deberia_poder_ver_pop_up_de_inscripcion_exitosa() {
        theActorInTheSpotlight().should(seeThat(validaPopUpInscripcionExitosa()));
    }
    @Y("^el usuario elimina la cuenta inscrita$")
    public void el_usuario_elimina_la_cuenta_inscrita() {
        theActorInTheSpotlight().attemptsTo(
                eliminarCuentaIris()
        );
    }
}
