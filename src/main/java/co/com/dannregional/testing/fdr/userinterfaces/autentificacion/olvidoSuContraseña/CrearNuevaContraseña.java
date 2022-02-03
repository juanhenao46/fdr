package co.com.dannregional.testing.fdr.userinterfaces.autentificacion.olvidoSuContraseña;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearNuevaContraseña extends PageObject {

    public static final Target TXT_USER = Target.the("Campo Usuario").locatedBy("//body/app-root[1]/div[1]/app-public-layout[1]/app-reset-password[1]/div[1]/div[2]/div[1]/app-create-password-form[1]/form[1]/div[2]/div[1]/input[1]");
    public static final Target TXT_NEW_PASSWORD = Target.the("Campo Nueva Contraseña").located(By.id("password-new"));
    public static final Target TXT_REPEAT_PASSWORD = Target.the("Campo Repetir Contraseña").located(By.id("confirm-password"));
    public static final Target BTN_NEXT = Target.the("Botón Siguiente").locatedBy("//button[contains(text(),'Siguiente')]");
}
