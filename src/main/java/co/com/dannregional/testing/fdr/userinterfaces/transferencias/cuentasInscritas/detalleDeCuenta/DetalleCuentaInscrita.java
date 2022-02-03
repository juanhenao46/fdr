package co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.detalleDeCuenta;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DetalleCuentaInscrita extends PageObject {

    public static final Target LBL_TITULAR_DE_LA_CUENTA = Target.the("Label titular de la cuenta").locatedBy("//h6[contains(text(),'{0}')]");
    public static final Target LBL_TIPO_DE_CUENTA = Target.the("Label tipo de cuenta").locatedBy("//h6[contains(text(),'{0}')]");

}
