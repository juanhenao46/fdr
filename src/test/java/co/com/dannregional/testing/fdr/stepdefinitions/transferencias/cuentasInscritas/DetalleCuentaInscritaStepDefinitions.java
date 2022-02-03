package co.com.dannregional.testing.fdr.stepdefinitions.transferencias.cuentasInscritas;

import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.transferencias.cuentasInscritas.pantalla.ValidaCuentaInscritaFiltrosQuestion.validaCuentaInscritaFiltros;
import static co.com.dannregional.testing.fdr.questions.transferencias.cuentasInscritas.pantalla.ValidaTipoDeCuentaInscritaQuestion.validaTipoDeCuentaInscrita;
import static co.com.dannregional.testing.fdr.questions.transferencias.cuentasInscritas.pantalla.ValidaTitularDeLaCuentaInscritaQuestion.validaTitularDeLaCuentaInscrita;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.pantalla.BuscarCuentaEnElFiltroTask.buscarCuentaEnElFiltro;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.pantalla.VerDetalleDeCuentaInscritaTask.verDetalleDeCuentaInscrita;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DetalleCuentaInscritaStepDefinitions {


    @Y("^el usuario busca una cuenta en el filtro$")
    public void el_usuario_busca_una_cuenta_en_el_filtro() {
        theActorInTheSpotlight().attemptsTo(
                buscarCuentaEnElFiltro()
        );
    }
    @Y("^el usuario ingresa al detalle de la cuenta inscrita$")
    public void el_usuario_ingresa_al_detalle_de_la_cuenta_inscrita() {
        theActorInTheSpotlight().attemptsTo(
                verDetalleDeCuentaInscrita()
        );
    }
    @Entonces("^el usuario deberia poder ver el detalle de la cuenta inscrita$")
    public void el_usuario_deberia_poder_ver_el_detalle_de_la_cuenta_inscrita() {
        theActorInTheSpotlight().should(seeThat((validaTitularDeLaCuentaInscrita())));
        theActorInTheSpotlight().should(seeThat((validaTipoDeCuentaInscrita())));

    }

    @Entonces("^el usuario deberia poder ver la cuenta en el listado de cuentas inscritas$")
    public void el_usuario_deberia_poder_ver_la_cuenta_en_el_listado_de_cuentas_inscritas() {
        theActorInTheSpotlight().should(seeThat(validaCuentaInscritaFiltros()));
    }
}
