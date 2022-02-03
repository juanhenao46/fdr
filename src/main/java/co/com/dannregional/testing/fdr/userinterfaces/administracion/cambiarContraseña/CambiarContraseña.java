package co.com.dannregional.testing.fdr.userinterfaces.administracion.cambiarContraseña;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CambiarContraseña extends PageObject {

    public static final Target TXT_CONTRASEÑA_ACTUAL = Target.the("Campo contraseña actual").locatedBy("//input[@id='password-old']");
    public static final Target TXT_NUEVA_CONTRASEÑA = Target.the("Campo nueva contraseña").locatedBy("//input[@id='password-new']");
    public static final Target TXT_REPETIR_CONTRASEÑA = Target.the("Campo repetir nueva contraseña").locatedBy("//input[@id='confirm-password']");
    public static final Target LBL_CONTRASEÑA_ACTUALIZADA = Target.the("Pop up contraseña actualizada").locatedBy("//div[contains(text(), 'Contraseña actualizada exitosamente')]");

}
