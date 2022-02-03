package co.com.dannregional.testing.fdr.stepdefinitions.resumen.filtrarSaldos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;


import static co.com.dannregional.testing.fdr.questions.resumen.filtrarSaldos.ValidaFiltroSaldosPorDiasQuestion.validaFiltroSaldosPorDias;
import static co.com.dannregional.testing.fdr.tasks.resumen.filtrarSaldos.FiltrarSaldosPorDiasTask.filtrarSaldoDias;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class FiltrarSaldosPorDiasStepDefinitions {

    @Cuando("^el usuario filtra sus saldos por dias$")
    public void el_usuario_filtra_sus_saldos_por_dias() {
        theActorInTheSpotlight().attemptsTo(
                filtrarSaldoDias()
        );

    }
    @Entonces("^el usuario deberia poder ver el filtro cambiado$")
    public void el_usuario_deberia_poder_ver_el_filtro_cambiado() {
        theActorInTheSpotlight().should(seeThat(
                validaFiltroSaldosPorDias()
        ));
    }

}
