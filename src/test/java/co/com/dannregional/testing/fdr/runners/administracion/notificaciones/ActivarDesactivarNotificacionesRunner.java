package co.com.dannregional.testing.fdr.runners.administracion.notificaciones;

import co.com.dannregional.testing.fdr.utilities.exceldata.BeforeRunner;
import co.com.dannregional.testing.fdr.utilities.exceldata.DatosFeature;
import co.com.dannregional.testing.fdr.utilities.runner.RunnerDannRegional;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features ="src/test/resources/co.com.dannregional.testing.fdr/features/administracion/notificaciones/activar_y_desactivar_notificaciones.feature",
        snippets = SnippetType.CAMELCASE,
        glue = {"co.com.dannregional.testing.fdr.stepdefinitions.autentificacion.logueo",
                "co.com.dannregional.testing.fdr.stepdefinitions.administracion.cambiarContraseña",
                "co.com.dannregional.testing.fdr.stepdefinitions.administracion.notificaciones"},
        plugin = {"json:target/cucumber_json/cucumber.json"}
)
@RunWith(RunnerDannRegional.class)

public class ActivarDesactivarNotificacionesRunner {

    public ActivarDesactivarNotificacionesRunner() {
    }

    @BeforeRunner
    public static void test() throws InvalidFormatException, IOException {
        DatosFeature.overrideFeatureFiles(
                "./src/test/resources/co.com.dannregional.testing.fdr/features/administracion/notificaciones");
    }
}
