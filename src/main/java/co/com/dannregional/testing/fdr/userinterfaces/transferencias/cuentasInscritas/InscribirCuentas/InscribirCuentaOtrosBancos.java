package co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.InscribirCuentas;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class InscribirCuentaOtrosBancos extends PageObject {

    public static final Target BTN_OTROS_BANCOS = Target.the("Opción Otros bancos").locatedBy("//button[contains(text(),'Otros bancos')]");
    public static final Target TXT_TITULAR_CUENTA = Target.the("Campo Títular de la cuenta").locatedBy("//input[@formcontrolname='accountOwner']");
    public static final Target DRP_TIPO_DE_DOCUMENTO = Target.the("Desplegable Tipo de documento").locatedBy("//ng-select[@formcontrolname='documentType']");
    public static final Target BTN_TIPO_DE_DOCUMENTO = Target.the("Opción Tipo de documento").locatedBy("//div[contains(@class, 'ng-option')]//following::span[contains(text(), '{0}')]");
    public static final Target TXT_NUMERO_DE_DOCUMENTO = Target.the("Campo Número de documento").locatedBy("//input[@formcontrolname='documentNumber']");
    public static final Target DRP_BANCO = Target.the("Desplegable Banco").locatedBy("(//ng-select[@formcontrolname='bank'])");
    public static final Target BTN_BANCO = Target.the("Opción Banco").locatedBy("//span[contains(text(),'{0}')]");
    public static final Target DRP_TIPO_DE_CUENTA = Target.the("Desplegable Tipo de cuenta").locatedBy("(//ng-select[@formcontrolname='accountType'])");
    public static final Target BTN_TIPO_DE_CUENTA = Target.the("Opción Tipo de cuenta").locatedBy("//span[contains(text(),'{0}')]");
    public static final Target TXT_NUMERO_DE_CUENTA = Target.the("Campo Número de cuenta").locatedBy("//input[@formcontrolname='accountNumber']");
    public static final Target CHK_INSCRIBIR_CUENTA = Target.the("Checkbox inscribir cuenta").locatedBy("//input[@formcontrolname='inscribeAccount']");
    public static final Target BTN_CONCLUIR = Target.the("Botón Concluir").locatedBy("//button[contains(text(),'Concluir')]");
    public static final Target BTN_FINALIZAR = Target.the("Botón Finalizar").locatedBy("//button[contains(text(),'Finalizar')]");

}
