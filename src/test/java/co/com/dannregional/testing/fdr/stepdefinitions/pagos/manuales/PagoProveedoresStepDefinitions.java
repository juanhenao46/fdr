package co.com.dannregional.testing.fdr.stepdefinitions.pagos.manuales;

import cucumber.api.java.es.Y;

import static co.com.dannregional.testing.fdr.tasks.pagos.manuales.proveedores.SeleccionarProveedoresTask.seleccionarProveedores;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PagoProveedoresStepDefinitions {

    @Y("^el usuario selecciona opcion proveedores$")
    public void el_usuario_selecciona_opcion_proveedores() {
        theActorInTheSpotlight().attemptsTo(
                seleccionarProveedores()
        );
    }
}
