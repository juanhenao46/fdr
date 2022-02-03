package co.com.dannregional.testing.fdr.stepdefinitions.transferencias.cuentasInscritas;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.transferencias.cuentasInscritas.cuentasIris.ValidaPopUpInscripcionExitosaQuestion.validaPopUpInscripcionExitosa;
import static co.com.dannregional.testing.fdr.questions.transferencias.cuentasInscritas.cuentasIris.ValidarTipoDeCuentaQuestion.validarTipoDeCuenta;
import static co.com.dannregional.testing.fdr.questions.transferencias.cuentasInscritas.cuentasIris.ValidarTitularDeLaCuentaQuestion.validarTitularDeLaCuenta;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.comunes.AccederACuentasInscritasTask.accederACuentasInscritas;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.comunes.AccederAInscribirCuentasTask.accederAInscribirCuentas;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.comunes.SeleccionarOpcionOtrosBancosTask.seleccionarOpcionOtrosBancos;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.inscribirCuentas.cuentasIris.ConcluirInscripcionTask.concluirInscripcion;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.inscribirCuentas.cuentasIris.IngresarNumeroDeCuentaTask.ingresarNumeroDeCuenta;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.inscribirCuentas.otrosBancos.IngresarDatosTitularYCuentaTask.ingresarDatosTitularYCuenta;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InscribirCuentasOtrosBancosStepDefinitions {


    @Y("^el usuario selecciona opcion otros bancos$")
    public void el_usuario_selecciona_opcion_otros_bancos() {
        theActorInTheSpotlight().attemptsTo(
                seleccionarOpcionOtrosBancos()
        );
    }
    @Y("^el usuario completa los datos del titular y de la cuenta$")
    public void el_usuario_completa_los_datos_del_titular_y_de_la_cuenta() {
        theActorInTheSpotlight().attemptsTo(
                ingresarDatosTitularYCuenta()
        );
    }

}
