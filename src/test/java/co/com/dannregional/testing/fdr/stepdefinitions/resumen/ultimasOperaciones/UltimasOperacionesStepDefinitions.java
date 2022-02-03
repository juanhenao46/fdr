package co.com.dannregional.testing.fdr.stepdefinitions.resumen.ultimasOperaciones;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;


import static co.com.dannregional.testing.fdr.questions.resumen.ultimasOperaciones.ValidaTituloDetalleOperacionesQuestion.validaTituloDetalleOperaciones;
import static co.com.dannregional.testing.fdr.tasks.salir.CerrarSesionTask.cerrarSesion;
import static co.com.dannregional.testing.fdr.tasks.resumen.ultimasOperaciones.VerUltimasOperacionesTask.verUltimasOperaciones;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UltimasOperacionesStepDefinitions {

    @Cuando("^el usuario da clic en Ver todo ultimas operaciones$")
    public void el_usuario_da_clic_en_Ver_todo_ultimas_operaciones() {
        theActorInTheSpotlight().attemptsTo(
                verUltimasOperaciones()
        );
    }

    @Entonces("^el usuario deberia poder ver el detalle de las operaciones$")
    public void el_usuario_deberia_poder_ver_el_detalle_de_las_operaciones() {
        theActorInTheSpotlight().should(seeThat(validaTituloDetalleOperaciones())
        );
    }
}
