package co.com.dannregional.testing.fdr.runners.historicoTransacciones.pagosLotes;

import co.com.dannregional.testing.fdr.utilities.exceldata.BeforeRunner;
import co.com.dannregional.testing.fdr.utilities.exceldata.DatosFeature;
import co.com.dannregional.testing.fdr.utilities.runner.RunnerDannRegional;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features ="src/test/resources/co.com.dannregional.testing.fdr/features/historicoTransacciones/pagosLotes/historico_pagos_lotes_validar_tabla.feature",
        snippets = SnippetType.CAMELCASE,
        glue = {"co.com.dannregional.testing.fdr.stepdefinitions.autentificacion.logueo",
                "co.com.dannregional.testing.fdr.stepdefinitions.historicoTransacciones.transacciones",
                "co.com.dannregional.testing.fdr.stepdefinitions.historicoTransacciones.pagosLotes"},
        plugin = {"json:target/cucumber_json/cucumber.json"}
)
@RunWith(RunnerDannRegional.class)

public class ValidarTablaHistoricoPagosRunner {
    public ValidarTablaHistoricoPagosRunner() {
    }
    @BeforeRunner
    public static void test() throws InvalidFormatException, IOException {
        DatosFeature.overrideFeatureFiles(
                "./src/test/resources/co.com.dannregional.testing.fdr/features/historicoTransacciones/pagosLotes");
    }
}
