package co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.InscribirCuentas;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class InscribirCuentaIris extends PageObject {

    public static final Target BTN_CUENTAS_IRIS = Target.the("Opción Cuentas Iris").locatedBy("//button[contains(text(),'Cuentas Iris')]");
    public static final Target TXT_NUMERO_DE_CUENTA = Target.the("Campo número de cuenta").locatedBy("//input[@formcontrolname='accountId']");
    public static final Target BTN_VALIDAR = Target.the("Botón Validar").locatedBy("//button[contains(text(),'Validar')]");
    public static final Target TXT_TIPO_DE_CUENTA = Target.the("Campo tipo de cuenta").locatedBy("//input[@formcontrolname='destinationType']");
    public static final Target TXT_TITULAR_CUENTA = Target.the("Campo Títular de la cuenta").locatedBy("//input[@formcontrolname='accountOwner']");
    public static final Target BTN_CONCLUIR = Target.the("Botón Concluir").locatedBy("//button[contains(text(),'Finalizar')]");
    public static final Target LBL_INSCRIPCION_EXITOSA = Target.the("Pop-up inscripcion exitosa").locatedBy("//div[@role='alertdialog']");

}
