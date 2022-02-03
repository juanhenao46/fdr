package co.com.dannregional.testing.fdr.stepdefinitions.transferencias.enLote;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.tasks.transferencias.enLote.AccederATransferenciasEnLoteTask.accederATransferenciasEnLote;
import static co.com.dannregional.testing.fdr.tasks.transferencias.enLote.CargarArchivoLoteTask.cargarArchivoLoteTask;
import static co.com.dannregional.testing.fdr.tasks.transferencias.enLote.IngresarDetalleDelLoteTask.ingresarDetalleDelLote;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TransferenciaEnLoteStepDefinitions {

    @Cuando("^el usuario ingresa a transferencias en lote$")
    public void el_usuario_ingresa_a_transferencias_otros_bancos() {
        theActorInTheSpotlight().attemptsTo(
                accederATransferenciasEnLote()
        );
    }

    @Y("^el usuario carga el archivo de lote$")
    public void el_usuario_carga_el_archivo_de_lote() {
        theActorInTheSpotlight().attemptsTo(
                cargarArchivoLoteTask()
        );
    }
    @Y("^el usuario ingresa el detalle del lote$")
    public void el_usuario_ingresa_el_detalle_del_lote() {
        theActorInTheSpotlight().attemptsTo(
                ingresarDetalleDelLote()
        );
    }

}
