package co.com.dannregional.testing.fdr.interactions.bancoIris;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValueIntoTarget;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.OTP.OTPtransferencias.OTPtransferencias.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class IngresarOTPTransferencias implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_OTP_PRIMER_DIGITO, isCurrentlyEnabled()).forNoMoreThan(6).seconds(),
                Enter.theValue("111111").into(TXT_OTP_PRIMER_DIGITO),
                esperarEnSegundos(2000)
        );
    }
    public static IngresarOTPTransferencias ingresarOTPTransferencias() {
        return instrumented(IngresarOTPTransferencias.class);
    }
}
