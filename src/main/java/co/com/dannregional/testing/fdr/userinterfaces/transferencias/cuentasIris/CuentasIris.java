package co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasIris;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CuentasIris extends PageObject {

    public static final Target BTN_NUEVA_CUENTA = Target.the("Opción +Nueva Cuenta").locatedBy("//h6[contains(text(),'Nueva cuenta')]");
    public static final Target CHK_INSCRIBIR_CUENTA = Target.the("Checkbox inscribir cuenta").locatedBy("//input[contains(@formcontrolname,'inscribeAccount')]//following::span[contains(@class, 'c-switch-slider')][1]");
    public static final Target LBL_GUARDAR_CUENTA = Target.the("Opción +Nueva Cuenta").locatedBy("//p[contains(text(),'Guarda esta cuenta para usarla de nuevo.')]");

}
