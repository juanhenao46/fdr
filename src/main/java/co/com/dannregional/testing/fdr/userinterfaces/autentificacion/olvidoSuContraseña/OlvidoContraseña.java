package co.com.dannregional.testing.fdr.userinterfaces.autentificacion.olvidoSuContraseña;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OlvidoContraseña extends PageObject {

    public static final Target TXT_NIT = Target.the("Campo NIT").located(By.id("nit"));
    public static final Target TXT_DOCUMENTO = Target.the("Campo Numero de Documento").located(By.id("documentId"));
    public static final Target TXT_USER = Target.the("Campo Usuario").located(By.id("username"));
    public static final Target TXT_CORREO = Target.the("Campo Correo Electronico").located(By.id("email"));
    public static final Target BTN_NEXT = Target.the("Botón Siguiente").locatedBy("//button[contains(text(),'Siguiente')]");
    public static final Target LBL_MENSAJE_CONFIRMACION_RECUPERACION = Target.the("Mensaje de confirmación de la recuperación").locatedBy("//*[contains(text(), 'Enviamos un enlace de recuperación de contraseña a su correo electrónico')]");

}
