package co.com.dannregional.testing.fdr.userinterfaces.transaccionesPendientes.autorizaciones.misAutorizaciones;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MisAutorizaciones extends PageObject {

    public static final Target CHK_PRIMER_REGISTRO = Target.the("Checkbox primer transaccion del listado").locatedBy("(//div[contains(@class,'custom-control custom-checkbox')])[2]");
    public static final Target BTN_AUTORIZAR = Target.the("Boton autorizar").locatedBy("(//button[contains(text(),'Autorizar')])[1]");
    public static final Target BTN_AUTORIZAR_MODAL = Target.the("Boton autorizar del detalle").locatedBy("(//button[contains(text(),'Autorizar')])[2]");
    public static final Target BTN_CONFIRMAR_AUTORIZAR = Target.the("Boton confirmacion autorizar").locatedBy("//a[contains(text(),'Cancelar')]//following::button[contains(text(),'Autorizar')]");
    public static final Target LBL_TRANSACCIONES_AUTORIZADAS = Target.the("Pop up transacciones autorizadas con exito").locatedBy("//div[contains(text(),'con éxito')]");
    public static final Target DRP_OPERACION = Target.the("Desplegable Operacion").locatedBy("(//div[@class='ng-input'])[1]");
    public static final Target BTN_OPCION_TRANSFERENCIA = Target.the("Opcion Transferencias").locatedBy("//span[contains(text(),'Transferencia')]");
    public static final Target BTN_OPCION_PAGOS = Target.the("Opcion Pagos").locatedBy("//span[contains(text(),'Pagos')]");
    public static final Target DRP_TIPO = Target.the("Desplegable Tipo").locatedBy("(//div[@class='ng-input'])[2]");
    public static final Target BTN_OPCION_CUENTAS_PROPIAS = Target.the("Opcion Cuentas propias").locatedBy("//span[contains(text(),'Cuentas propias')]");
    public static final Target DRP_RANGO_FECHA = Target.the("Campo rango de fecha").locatedBy("//input[contains(@placeholder, 'Fecha inicial')]");
    public static final Target BTN_OPCION_90_DIAS = Target.the("Opcion 90 días").locatedBy("//span[contains(text(),'90 Días')]");
    public static final Target LBL_OPERACION_TRANSFERENCIAS = Target.the("Etiqueta operacion Transferencias").locatedBy("//td[contains(text(),'Transferencia')][1]");
    public static final Target LBL_OPERACION_PAGOS = Target.the("Etiqueta operacion Pagos").locatedBy("//td[contains(text(),'Pagos')][1]");
    public static final Target LBL_COLUMNAS_TABLA_MIS_AUTORIZACIONES = Target.the("Columnas de la tabla").locatedBy("//thead");
    public static final Target BTN_PRIMER_OPCION_DEL_LISTADO = Target.the("Flecha de la primer transaccion del listado").locatedBy("(//i[@class='ic-arrow-right'])[1]");
    public static final Target BTN_LIMPIAR_OPERACION = Target.the("Icono limpiar campo operacion").locatedBy("//span[contains(@title, 'Clear all')]");

}
