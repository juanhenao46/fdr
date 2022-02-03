package co.com.dannregional.testing.fdr.userinterfaces.OTP.OTPinscribircuentas;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OTPInscribirCuentas extends PageObject {

    public static final Target TXT_OTP_PRIMER_DIGITO = Target.the("Primer dígito del OTP").locatedBy("//input[contains(@placeholder, '0')][1]");
}
