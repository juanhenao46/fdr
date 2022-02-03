package co.com.dannregional.testing.fdr.userinterfaces.resumen.ultimasOperaciones;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DetalleUltimasOperaciones extends PageObject {

    public static final Target BTN_VOLVER_AL_RESUMEN = Target.the("Volver al Resumen").locatedBy("//a[contains(text(),'Resumen')]");
    public static final Target LBL_SALDO_TOTAL = Target.the("Label Saldo Total").locatedBy("//p[contains(text(),'Saldo total')]");

}
