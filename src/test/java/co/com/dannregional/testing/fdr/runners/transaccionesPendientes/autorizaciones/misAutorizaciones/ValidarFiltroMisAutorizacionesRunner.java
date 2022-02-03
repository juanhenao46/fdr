package co.com.dannregional.testing.fdr.runners.transaccionesPendientes.autorizaciones.misAutorizaciones;

import co.com.dannregional.testing.fdr.utilities.exceldata.BeforeRunner;
import co.com.dannregional.testing.fdr.utilities.exceldata.DatosFeature;
import co.com.dannregional.testing.fdr.utilities.runner.RunnerDannRegional;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features ="src/test/resources/co.com.dannregional.testing.fdr/features/transaccionesPendientes/autorizaciones/misAutorizaciones/mis_autorizaciones_validar_filtro.feature",
        snippets = SnippetType.CAMELCASE,
        glue = {"co.com.dannregional.testing.fdr.stepdefinitions.autentificacion.logueo",
                "co.com.dannregional.testing.fdr.stepdefinitions.transaccionesPendientes.programadas.transferencias",
                "co.com.dannregional.testing.fdr.stepdefinitions.transaccionesPendientes.autorizaciones.misAutorizaciones"},
        plugin = {"json:target/cucumber_json/cucumber.json"}
)
@RunWith(RunnerDannRegional.class)

public class ValidarFiltroMisAutorizacionesRunner {
    public ValidarFiltroMisAutorizacionesRunner() {
    }
    @BeforeRunner
    public static void test() throws InvalidFormatException, IOException {
        DatosFeature.overrideFeatureFiles(
                "./src/test/resources/co.com.dannregional.testing.fdr/features/transaccionesPendientes/autorizaciones/misAutorizaciones");
    }
}
