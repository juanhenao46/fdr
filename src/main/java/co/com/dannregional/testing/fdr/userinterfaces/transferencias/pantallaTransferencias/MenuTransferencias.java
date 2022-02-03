package co.com.dannregional.testing.fdr.userinterfaces.transferencias.pantallaTransferencias;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenuTransferencias extends PageObject {

    public static final Target BTN_CUENTAS_PROPIAS = Target.the("Botón Cuentas Propias").locatedBy("//div[@class='box-card img-cuentas-propias']");
    public static final Target BTN_CUENTAS_IRIS = Target.the("Botón Cuentas IRIS").locatedBy("//div[@class='box-card img-banco-iris']");
    public static final Target BTN_OTROS_BANCOS = Target.the("Botón Otros Bancos").locatedBy("//div[@class='box-card img-otros-bancos']");
    public static final Target BTN_EN_LOTE = Target.the("Botón En Lote").locatedBy("//div[@class='box-card img-en-lote']");
    public static final Target BTN_CUENTAS_INSCRITAS = Target.the("Botón Cuentas Inscritas").locatedBy("//div[@class='box-card img-cuentas-inscritas']");

}
