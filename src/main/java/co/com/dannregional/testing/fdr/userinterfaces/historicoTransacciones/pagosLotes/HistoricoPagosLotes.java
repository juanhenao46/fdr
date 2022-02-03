package co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.pagosLotes;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HistoricoPagosLotes extends PageObject {

    public static final Target BTN_HISTORICO_PAGOS_LOTES = Target.the("Pestaña pagos y lotes").locatedBy("//a[contains(text(),'Pagos y lotes')]");
    public static final Target DRP_TIPO_PAGO = Target.the("Desplegable tipo de pago").locatedBy("(//div[@class='ng-input'])[1]");
    public static final Target BTN_OPCION_MANUALES_NOMINAS = Target.the("Opcion Manuales: nominas").locatedBy("//span[contains(text(),'Manuales: nominas')]");
    public static final Target BTN_OPCION_MANUALES_PROVEEDORES = Target.the("Etiqueta Manuales: proveedores").locatedBy("//span[contains(text(),'Manuales: proveedores')]");
    public static final Target LBL_TIPO_MANUALES_NOMINAS = Target.the("Etiqueta Manuales: nominas").locatedBy("//td[contains(text(),'Manuales: nominas')][1]");
    public static final Target LBL_TIPO_MANUALES_PROVEEDORES = Target.the("Etiqueta Manuales: proveedores").locatedBy("//td[contains(text(),'Manuales: proveedores')][1]");
    public static final Target BTN_LIMPIAR_TIPO_PAGO = Target.the("Icono limpiar campo tipo de pago").locatedBy("//span[contains(@title, 'Clear all')]");
    public static final Target LBL_COLUMNAS_TABLA_HISTORICO_PAGOS = Target.the("Columnas de la tabla").locatedBy("//thead");

}
