package co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.programadas.pagos;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PagosProgramados extends PageObject {

    public static final Target BTN_PESTAÑA_PAGOS = Target.the("Pestaña pagos").locatedBy("//a[contains(text(),'Pagos')]");
    public static final Target DRP_TIPO = Target.the("Desplegable tipo").locatedBy("(//div[@class='ng-input'])[1]");
    public static final Target DRP_RANGO_FECHA = Target.the("Campo rango de fecha").locatedBy("//input[contains(@placeholder, 'Fecha inicial')]");
    public static final Target BTN_OPCION_90_DIAS = Target.the("Opcion 90 días").locatedBy("//span[contains(text(),'90 Días')]");
    public static final Target CHK_PRIMER_REGISTRO = Target.the("Checkbox primer transaccion del listado").locatedBy("(//div[contains(@class,'custom-control custom-checkbox')])[2]");
    public static final Target BTN_OPCION_MANUALES_NOMINAS = Target.the("Opcion Manuales: nominas").locatedBy("//span[contains(text(),'Manuales: nominas')]");
    public static final Target BTN_OPCION_MANUALES_PROVEEDORES = Target.the("Opcion Manuales: proveedores").locatedBy("//span[contains(text(),'Manuales: proveedores')]");
    public static final Target BTN_LIMPIAR_TIPO = Target.the("Icono limpiar campo tipo").locatedBy("//span[contains(@title, 'Clear all')]");
    public static final Target LBL_COLUMNAS_TABLA_PAGOS_PROGRAMADOS = Target.the("Columnas de la tabla").locatedBy("//thead");
    public static final Target LBL_TIPO_MANUALES_NOMINAS = Target.the("Etiqueta tipo Manuales: nominas").locatedBy("(//td[contains(text(),'Manuales: nominas')])[1]");
    public static final Target LBL_TIPO_MANUALES_PROVEEDORES = Target.the("Etiqueta tipo Manuales: proveedores").locatedBy("(//td[contains(text(),'Manuales: proveedores')])[1]");
    public static final Target BTN_PRIMER_OPCION_DEL_LISTADO = Target.the("Flecha del primer pago del listado").locatedBy("(//i[@class='ic-arrow-right'])[1]");

}
