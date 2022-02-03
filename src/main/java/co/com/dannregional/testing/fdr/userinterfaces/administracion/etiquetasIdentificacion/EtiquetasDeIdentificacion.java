package co.com.dannregional.testing.fdr.userinterfaces.administracion.etiquetasIdentificacion;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class EtiquetasDeIdentificacion extends PageObject {

    public static final Target BTN_CREAR_NUEVA = Target.the("boton crear nueva etiqueta").locatedBy("//button[contains(text(),'Crear nueva')]");
    public static final Target TXT_NOMBRE_ETIQUETA = Target.the("Campo nombre etiqueta").locatedBy("//input[@id='name']");
    public static final Target BTN_CREAR = Target.the("Boton crear").locatedBy("//button[contains(text(),'Cancelar')]//following::button[contains(text(),'Crear')]");
    public static final Target LBL_ETIQUETA_CREADA = Target.the("Pop up etiqueta creada").locatedBy("//div[contains(text(), 'Etiqueta creada exitosamente')]");
    public static final Target BTN_EDITAR_ETIQUETA = Target.the("Etiqueta a editar").locatedBy("//span[contains(text(), 'QAEditar')]");
    public static final Target BTN_GUARDAR = Target.the("Boton guardar").locatedBy("//button[contains(text(),'Guardar')]");
    public static final Target LBL_ETIQUETA_ACTUALIZADA = Target.the("Pop up etiqueta actualizada").locatedBy("//div[contains(text(), 'Etiqueta actualizada exitosamente')]");

}
