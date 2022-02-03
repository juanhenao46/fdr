package co.com.dannregional.testing.fdr.userinterfaces.autentificacion.logueo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.By;

@NamedUrls({
        @NamedUrl(name = "open.dannregional", url = "http://{1}"),
})

public class FdrLogin extends PageObject {

    public static final Target TXT_NIT = Target.the("Campo NIT").located(By.id("user-name"));
    public static final Target TXT_USER = Target.the("Campo Usuario").located(By.id("account"));
    public static final Target TXT_PASSWORD = Target.the("Campo Contraseña").located(By.id("password"));
    public static final Target BTN_NEXT = Target.the("Botón Siguiente").locatedBy("//button[contains(text(),'Siguiente')]");
    public static final Target BTN_OLVIDO_CONTRASEÑA = Target.the("Botón Olvidaste tu Contraseña").locatedBy("//a[contains(@class,'password-recovery')]");

}
