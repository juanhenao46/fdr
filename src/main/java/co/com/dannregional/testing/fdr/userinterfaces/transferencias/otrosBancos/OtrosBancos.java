package co.com.dannregional.testing.fdr.userinterfaces.transferencias.otrosBancos;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OtrosBancos extends PageObject {

    public static final Target DRP_BANCO_DESTINO = Target.the("Desplegable Banco destino").locatedBy("(//DIV[@class='ng-value-container'])[2]");
    public static final Target BTN_BANCO_DESTINO = Target.the("Opción Banco destino").locatedBy("//span[contains(text(),'{0}')]");
    public static final Target DRP_PRODUCTO_DESTINO_OTROS_BANCOS = Target.the("Desplegable Producto destino otros bancos").locatedBy("(//DIV[@class='ng-value-container'])[3]");

}
