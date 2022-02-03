package co.com.dannregional.testing.fdr.stepdefinitions.resumen.barraDeNavegacion;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.dannregional.testing.fdr.questions.resumen.navBar.ValidaFuncionalidadMenuQuestion.validarMenu;
import static co.com.dannregional.testing.fdr.tasks.resumen.barraDeNavegacion.AccederFuncionalidadesNavBarTask.accederFuncionalidadesNavBar;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FuncionalidadesBarraNavegacionStepDefinitions {

    @Cuando("^el usuario accede a las funcionalidades de la barra de navegacion$")
    public void el_usuario_accede_a_las_funcionalidades_de_la_barra_de_navegacion() {
        theActorInTheSpotlight().attemptsTo(
                accederFuncionalidadesNavBar()
        );

    }
    @Entonces("^el usuario deberia poder ver las opciones de cada funcionalidad$")
    public void el_usuario_deberia_poder_ver_las_opciones_de_cada_funcionalidad() {
        theActorInTheSpotlight().should(seeThat(validarMenu()));

    }


}
