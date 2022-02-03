package co.com.dannregional.testing.fdr.userinterfaces.OTP.OTPtransferencias;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OTPtransferencias extends PageObject {

    public static final Target TXT_OTP_PRIMER_DIGITO = Target.the("Primer dígito del OTP").locatedBy("(//input[contains(@type,'tel')])[1]");
}
