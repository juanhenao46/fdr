package co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.pantalla;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PantallaCuentasInscritas extends PageObject {

    public static final Target LBL_SPINNER_CARGA = Target.the("Botón inscribir cuenta").located(By.id("spinner"));
    public static final Target BTN_INSCRIBIR_CUENTA = Target.the("Botón inscribir cuenta").locatedBy("//button[contains(text(),'Inscribir cuenta')]");
    public static final Target TXT_TITULAR_O_DESCRIPCION = Target.the("Campo busqueda de titular o descripcion").locatedBy("//input[contains(@name, 'description')]");
    public static final Target BTN_CUENTA = Target.the("Cuenta del listado").locatedBy("//td[contains(text(), '{0}')]");
    public static final Target BTN_ELIMINAR_CUENTA = Target.the("Botón eliminar cuenta").locatedBy("//button[contains(text(), 'Eliminar cuenta')]");
    public static final Target BTN_ELIMINAR = Target.the("Botón eliminar").locatedBy("//button[text()=' Eliminar ']");

}
