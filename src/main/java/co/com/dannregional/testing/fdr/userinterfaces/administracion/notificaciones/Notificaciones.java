package co.com.dannregional.testing.fdr.userinterfaces.administracion.notificaciones;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Notificaciones extends PageObject {

    public static final Target CHK_ALERTAS_CORREO = Target.the("Checkbox notificacion alertas por correo").locatedBy("(//span[contains(@class, 'c-switch-slider')])[1]");
    public static final Target LBL_NOTIFICACIONES_ACTUALIZADAS = Target.the("Pop up Notificaciones actualizadas").locatedBy("//div[contains(text(), 'Notificaciones actualizadas con éxito')]");

}
