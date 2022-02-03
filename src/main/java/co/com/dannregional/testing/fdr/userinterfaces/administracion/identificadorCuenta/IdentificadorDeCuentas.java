package co.com.dannregional.testing.fdr.userinterfaces.administracion.identificadorCuenta;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IdentificadorDeCuentas extends PageObject {

    public static final Target BTN_CREAR_NUEVA = Target.the("boton crear nueva etiqueta").locatedBy("//button[contains(text(),'Crear nueva')]");
    public static final Target TXT_NOMBRE_CUENTA = Target.the("Campo nombre cuenta").locatedBy("//input[@id='name']");
    public static final Target BTN_EDITAR_CUENTA = Target.the("Cuenta a editar").locatedBy("//span[contains(text(), 'QAEditar')]");
    public static final Target BTN_GUARDAR = Target.the("Boton guardar").locatedBy("//button[contains(text(),'Guardar')]");
    public static final Target LBL_ETIQUETA_ACTUALIZADA = Target.the("Pop up etiqueta actualizada").locatedBy("//div[contains(text(), 'Etiqueta actualizada exitosamente')]");

}
