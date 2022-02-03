package co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.pantallaTransaccionesPendientes;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TransaccionesPendientes extends PageObject {

    public static final Target BTN_PROGRAMADAS = Target.the("Opcion programadas").locatedBy("//div[@class='box-card img-programadas']");
    public static final Target BTN_AUTORIZACION = Target.the("Opcion autorizacion").locatedBy("//div[@class='box-card img-autorizacion']");


}
