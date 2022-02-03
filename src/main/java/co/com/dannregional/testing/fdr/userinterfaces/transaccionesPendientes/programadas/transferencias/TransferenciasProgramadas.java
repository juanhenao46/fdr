package co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.transferencias;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TransferenciasProgramadas extends PageObject {

    public static final Target CHK_PRIMER_REGISTRO = Target.the("Checkbox primer transaccion del listado").locatedBy("(//div[contains(@class,'custom-control custom-checkbox')])[2]");
    public static final Target LBL_COLUMNAS_TABLA_TRANSFERENCIAS_PROGRAMADAS = Target.the("Columnas de la tabla").locatedBy("//thead");
    public static final Target BTN_ELIMINAR_PROGRAMACION = Target.the("Boton eliminar programacion").locatedBy("//button[contains(text(),'Eliminar programación')]");
    public static final Target BTN_ELIMINAR_PROGRAMACION_MODAL = Target.the("Boton eliminar programacion desde detalle").locatedBy("(//button[contains(text(),'Eliminar programación')])[2]");
    public static final Target BTN_CONFIRMAR_ELIMINAR = Target.the("Modal boton eliminar").locatedBy("//button[normalize-space(text())='Eliminar']");
    public static final Target LBL_TRANSACCION_ELIMINADA = Target.the("Pop up transaccion eliminada con exito").locatedBy("//div[contains(text(),'con éxito')]");
    public static final Target DRP_PERIODICIDAD = Target.the("Desplegable periodicidad").locatedBy("(//div[@class='ng-input'])[4]");
    public static final Target BTN_OPCION_UNICA_VEZ = Target.the("Opcion unica vez").locatedBy("//span[contains(text(),'Única vez')]");

}
