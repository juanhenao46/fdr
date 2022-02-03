package co.com.dannregional.testing.fdr.stepdefinitions.transaccionesPendientes.autorizaciones.autorizacionesPendientes;

import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.questions.transaccionesPendientes.autorizaciones.ValidaColumnasTablaAutorizacionesPendientesQuestion.validaColumnasTablaAutorizacionesPendientes;
import static co.com.dannregional.testing.fdr.questions.transaccionesPendientes.autorizaciones.ValidaPopUpTransaccionesEliminadasQuestion.validaPopUpTransaccionesEliminadas;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones.AccederALaPestañaMisAutorizacionesTask.accederPestañaMisAutorizaciones;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones.EliminarTransaccionModalTask.eliminarTransaccionModal;
import static co.com.dannregional.testing.fdr.tasks.transaccionesPendientes.autorizaciones.EliminarTransaccionesSeleccionadasCheckTask.eliminarTransaccionesSeleccionadasCheck;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutorizacionesPendientesStepDefinitions {



    @Y("^el usuario elimina las transacciones seleccionadas con el check$")
    public void el_usuario_elimina_las_transacciones_seleccionadas_con_el_check() {
        theActorInTheSpotlight().attemptsTo(
                eliminarTransaccionesSeleccionadasCheck()
        );
    }
    @Y("^el usuario elimina la transaccion desde el modal$")
    public void el_usuario_elimina_la_transaccion_desde_el_modal() {
        theActorInTheSpotlight().attemptsTo(
                eliminarTransaccionModal()
        );
    }

    @Entonces("^el usuario deberia poder ver mensaje de transacciones eliminadas con exito$")
    public void el_usuario_deberia_poder_ver_mensaje_de_transacciones_eliminadas_con_exito() {
        theActorInTheSpotlight().should(seeThat(validaPopUpTransaccionesEliminadas()));
    }

    @Entonces("^el usuario deberia poder validar la tabla con informacion de autorizaciones pendientes$")
    public void el_usuario_deberia_poder_validar_la_tabla_con_informacion_de_autorizaciones_pendientes() {
        theActorInTheSpotlight().should(seeThat(validaColumnasTablaAutorizacionesPendientes())
        );
    }
}
