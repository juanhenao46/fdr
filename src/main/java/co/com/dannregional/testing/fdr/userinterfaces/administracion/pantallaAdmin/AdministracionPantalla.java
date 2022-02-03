package co.com.dannregional.testing.fdr.userinterfaces.administracion.pantallaAdmin;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AdministracionPantalla extends PageObject {

    public static final Target BTN_CAMBIAR_CONTRASEÑA = Target.the("Opcion cambiar contraseña").locatedBy("//div[@class='box-card img-cambiar-contrasena']");
    public static final Target BTN_ETIQUETAS_DE_IDENTIFICACION = Target.the("Opcion Etiquetas de identificacion").locatedBy("//div[@class='box-card img-tag-de-identificacion']");
    public static final Target BTN_IDENTIFICADOR_DE_CUENTA = Target.the("Opcion identificador de cuenta").locatedBy("//div[@class='box-card img-identificacion-de-cuentas']");
    public static final Target BTN_NOTIFICACIONES = Target.the("Opcion Notificaciones").locatedBy("//div[@class='box-card img-notificaciones']");

}
