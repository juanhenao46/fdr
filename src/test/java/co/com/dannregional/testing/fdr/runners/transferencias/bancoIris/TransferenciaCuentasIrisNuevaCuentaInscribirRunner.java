package co.com.dannregional.testing.fdr.runners.transferencias.bancoIris;

import co.com.dannregional.testing.fdr.utilities.exceldata.BeforeRunner;
import co.com.dannregional.testing.fdr.utilities.exceldata.DatosFeature;
import co.com.dannregional.testing.fdr.utilities.runner.RunnerDannRegional;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features ="src/test/resources/co.com.dannregional.testing.fdr/features/transferencias/cuentasIris/transferencia_cuentas_iris_inscribir_cuenta.feature",
        snippets = SnippetType.CAMELCASE,
        glue = {"co.com.dannregional.testing.fdr.stepdefinitions.autentificacion.logueo",
                "co.com.dannregional.testing.fdr.stepdefinitions.transferencias.cuentasPropias",
                "co.com.dannregional.testing.fdr.stepdefinitions.transferencias.cuentasInscritas",
                "co.com.dannregional.testing.fdr.stepdefinitions.transferencias.cuentasIris"},
        plugin = {"json:target/cucumber_json/cucumber.json"}
)
@RunWith(RunnerDannRegional.class)

public class TransferenciaCuentasIrisNuevaCuentaInscribirRunner {
    public TransferenciaCuentasIrisNuevaCuentaInscribirRunner(){

    }
    @BeforeRunner
    public static void test() throws InvalidFormatException, IOException {
        DatosFeature.overrideFeatureFiles(
                "./src/test/resources/co.com.dannregional.testing.fdr/features/transferencias/cuentasIris");
    }
}