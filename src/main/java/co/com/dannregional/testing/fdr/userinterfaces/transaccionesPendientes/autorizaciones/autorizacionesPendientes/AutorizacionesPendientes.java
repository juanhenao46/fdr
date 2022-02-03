package co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.autorizacionesPendientes;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutorizacionesPendientes extends PageObject {

    public static final Target BTN_MIS_AUTORIZACIONES = Target.the("Pestaña mis autorizaciones").locatedBy("//a[contains(text(),'Mis autorizaciones')]");
    public static final Target BTN_AUTORIZACIONES_PENDIENTES = Target.the("Pestaña autorizaciones pendientes").locatedBy("//a[contains(text(),'Autorizaciones Pendientes')]");
    public static final Target BTN_ELIMINAR_OPERACIONES = Target.the("Boton eliminar operaciones").locatedBy("//button[contains(text(),'Eliminar operaciones')]");
    public static final Target BTN_ELIMINAR = Target.the("Detalle boton eliminar").locatedBy("(//button[(text()=' Eliminar ')])[1]");
    public static final Target BTN_CONFIRMAR_ELIMINAR = Target.the("Modal boton eliminar").locatedBy("//a[contains(text(),'Cancelar')]//following::button[contains(text(),'Eliminar')]");
    public static final Target LBL_TRANSACCIONES_ELIMINADAS = Target.the("Pop up transacciones eliminadas con exito").locatedBy("//div[contains(text(),'con éxito')]");
    public static final Target LBL_COLUMNAS_TABLA_AUTORIZACIONES_PENDIENTES = Target.the("Columnas de la tabla").locatedBy("//thead");

}
