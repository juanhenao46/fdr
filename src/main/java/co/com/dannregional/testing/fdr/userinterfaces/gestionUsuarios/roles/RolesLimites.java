package co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RolesLimites extends PageObject {

    public static final Target BTN_CREAR_NUEVO = Target.the("Boton Crear nuevo").locatedBy("//button[contains(@class,'ml-3 btn btn-primary btn-lg create-new-role-btn')]");
    public static final Target DRP_FILTRO_ROLES = Target.the("Filtro Roles").locatedBy("//label[contains(text(),'Roles')]//following::span[contains(@class, 'ng-arrow-wrapper')][1]");
    public static final Target BTN_OPCION_ROL_EDITAR = Target.the("Opcion Rol").locatedBy("//span[contains(text(),'{0}')]");

    public static final Target BTN_TARJETA_ROL = Target.the("Tarjeta rol master").locatedBy("//div[@class='card']");

}
