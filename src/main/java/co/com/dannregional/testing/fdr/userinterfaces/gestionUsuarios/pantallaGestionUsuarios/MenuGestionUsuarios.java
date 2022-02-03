package co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.pantallaGestionUsuarios;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenuGestionUsuarios extends PageObject {

    public static final Target BTN_CUENTAS_DE_USUARIOS = Target.the("Opcion Cuentas de usuarios").locatedBy("//div[@class='box-card img-cuentas-de-usuarios']");
    public static final Target BTN_ROLES_Y_LIMITES = Target.the("Opcion Roles y Limites").locatedBy("//div[@class='box-card img-roles-y-limites']");
    public static final Target BTN_LOG_DE_USUARIOS = Target.the("Log de usuarios").locatedBy("//div[@class='box-card img-log-de-usuarios']");

}
