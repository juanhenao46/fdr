package co.com.dannregional.testing.fdr.userinterfaces.pagos.guardados;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PagosGuardados extends PageObject {

    public static final Target BTN_PAGOS_GUARDADOS = Target.the("Opcion Pagos Guardados").locatedBy("//div[@class='box-card img-pagos-guardados']");
    public static final Target DRP_OPCIONES = Target.the("Desplegable opciones").locatedBy("//i[contains(@id, 'dropdownOptions')][1]");
    public static final Target BTN_OPCION_EDITAR = Target.the("Opcion editar").locatedBy("//button[contains(text(), 'Editar')]");
    public static final Target BTN_OPCION_ELIMINAR = Target.the("Opcion eliminar").locatedBy("//button[contains(text(), 'Eliminar')]");
    public static final Target BTN_ELIMINAR = Target.the("Boton eliminar").locatedBy("//div[contains(@class,'col text-center')]//following::button[contains(text(), 'Eliminar')]");

}
