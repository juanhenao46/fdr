package co.com.dannregional.testing.fdr.userinterfaces.resumen.detalleDeCuenta;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DetalleCuenta extends PageObject {

    public static final Target BTN_VOLVER_AL_RESUMEN = Target.the("Botón volver al Resumen").locatedBy("//a[contains(text(),'Resumen')]");
}
