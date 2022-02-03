package co.com.dannregional.testing.fdr.userinterfaces.historicoTransacciones.transacciones;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HistoricoTransacciones extends PageObject {

    public static final Target LBL_FECHA = Target.the("Etiqueta columna fecha").locatedBy("//th[@_ngcontent-csg-c172][contains(text(), 'Fecha')]");
    public static final Target DRP_TIPO_TRANSFERENCIA = Target.the("Desplegable tipo de transferencia").locatedBy("(//div[@class='ng-input'])[1]");
    public static final Target BTN_OPCION_OTROS_BANCOS = Target.the("Opcion otros bancos").locatedBy("//span[contains(text(),'Otros bancos')]");
    public static final Target BTN_OPCION_CUENTAS_PROPIAS = Target.the("Opcion cuentas propias").locatedBy("//span[contains(text(),'Cuentas propias')]");
    public static final Target BTN_OPCION_CUENTAS_IRIS = Target.the("Opcion cuentas iris").locatedBy("//span[contains(text(),'Cuentas Iris')]");
    public static final Target LBL_TIPO_OTROS_BANCOS = Target.the("Etiqueta Otros bancos").locatedBy("//td[@class='ng-star-inserted'][contains(text(),'Otros bancos')][1]");
    public static final Target LBL_TIPO_CUENTAS_PROPIAS = Target.the("Etiqueta Cuentas propias").locatedBy("//td[@class='ng-star-inserted'][contains(text(),'Cuentas propias')][1]");
    public static final Target LBL_TIPO_CUENTAS_IRIS = Target.the("Etiqueta Cuentas Iris").locatedBy("//td[@class='ng-star-inserted'][contains(text(),'Cuentas Iris')][1]");
    public static final Target BTN_PRIMER_OPCION_DEL_LISTADO = Target.the("Flecha de la primer transaccion del listado").locatedBy("(//i[@class='ic-arrow-right'])[1]");
    public static final Target DRP_ESTADO = Target.the("Desplegable Estado").locatedBy("(//div[@class='ng-input'])[4]");
    public static final Target BTN_OPCION_EXITOSA = Target.the("Opcion Exitosa").locatedBy("(//span[contains(text(),'xitosa')])[1]");
    public static final Target LBL_TITULO_COMPROBANTE_TRANSFERENCIA = Target.the("Titulo Comprobante de transferencia").locatedBy("//p[contains(text(),'COMPROBANTE DE TRANSFERENCIA')]");
    public static final Target BTN_LIMPIAR_TIPO_TRANSFERENCIA = Target.the("Icono limpiar campo tipo de transferencia").locatedBy("//span[contains(@title, 'Clear all')]");
    public static final Target DRP_RANGO_FECHA = Target.the("Campo rango de fecha").locatedBy("//input[contains(@placeholder, 'Fecha inicial')]");
    public static final Target BTN_OPCION_90_DIAS = Target.the("Opcion 90 días").locatedBy("//span[contains(text(),'90 Días')]");
    public static final Target LBL_RESUME_DEL_PAGO = Target.the("Etiqueta Resume del pago").locatedBy("//h6[contains(text(),'Resume del pago')]");
    public static final Target LBL_COLUMNAS_TABLA_HISTORICO_TRANSACCIONES = Target.the("Columnas de la tabla").locatedBy("//thead");

}
