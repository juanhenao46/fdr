package co.com.dannregional.testing.fdr.runners.transferencias.otrosBancos;

import co.com.dannregional.testing.fdr.utilities.exceldata.BeforeRunner;
import co.com.dannregional.testing.fdr.utilities.exceldata.DatosFeature;
import co.com.dannregional.testing.fdr.utilities.runner.RunnerDannRegional;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features ="src/test/resources/co.com.dannregional.testing.fdr/features/transferencias/otrosBancos/realizar_transferencia_otros_bancos_aprobacion.feature",
        snippets = SnippetType.CAMELCASE,
        glue = {"co.com.dannregional.testing.fdr.stepdefinitions.autentificacion.logueo",
                "co.com.dannregional.testing.fdr.stepdefinitions.transferencias.otrosBancos",
                "co.com.dannregional.testing.fdr.stepdefinitions.transferencias.cuentasPropias"},
        plugin = {"json:target/cucumber_json/cucumber.json"}
)
@RunWith(RunnerDannRegional.class)

public class TransferenciaAprobacionOtrosBancosRunner {
    public TransferenciaAprobacionOtrosBancosRunner(){

    }
    @BeforeRunner
    public static void test() throws InvalidFormatException, IOException {
        DatosFeature.overrideFeatureFiles(
                "./src/test/resources/co.com.dannregional.testing.fdr/features/transferencias/otrosBancos");
    }
}
