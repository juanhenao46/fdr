package co.com.dannregional.testing.fdr.userinterfaces.pagos.manuales;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PagosManuales extends PageObject {


    public static final Target BTN_PAGOS_MANUALES = Target.the("Opcion Pagos Manuales").locatedBy("//div[@class='box-card img-pagos-manuales']");
    public static final Target BTN_OPCION_NOMINAS = Target.the("Opcion Nominas").locatedBy("//h3[contains(text(),'Nóminas')]");
    public static final Target BTN_OPCION_PROVEEDORES = Target.the("Opcion Proveedores").locatedBy("//h3[contains(text(),'Proveedores')]");
    public static final Target BTN_NEXT = Target.the("Botón Siguiente").locatedBy("//button[contains(text(),'Siguiente')]");
    public static final Target DRP_PRODUCTO_ORIGEN = Target.the("Desplegable Producto origen").locatedBy("(//DIV[@class='ng-value-container'])[1]");
    public static final Target BTN_ORIGEN = Target.the("Opción Cuenta origen").locatedBy("//span[contains(text(),'{0}')]");
    public static final Target TXT_FECHA_EJECUCION = Target.the("Campo Fecha de Ejecución").locatedBy("//h5[contains(text(),'Fecha de')]//following::div");
    public static final Target BTN_MESES = Target.the("Boton para seleccionar el mes").locatedBy("//button[contains(@class,'ant-picker-header-month-btn ng-star-inserted')]");
    public static final Target BTN_MES = Target.the("Botón para seleccionar el mes").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target BTN_DIA = Target.the("Botón para seleccionar el dia  del mes").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target TXT_IDENTIFICACION = Target.the("Campo identificacion del pago").locatedBy("//input[contains(@id,'details')]");
    public static final Target BTN_LIMPIAR_BANCO = Target.the("Icono limpiar campo banco").locatedBy("//span[contains(@title, 'Clear all')]");
    public static final Target DRP_BANCO_DESTINO = Target.the("Desplegable Banco destino").locatedBy("(//DIV[@class='ng-value-container'])[1]");
    public static final Target BTN_BANCO_DESTINO = Target.the("Opción Banco destino").locatedBy("//span[contains(text(),'{0}')]");
    public static final Target BTN_NUEVA_CUENTA = Target.the("Opción +Nueva Cuenta").locatedBy("//h6[contains(text(),'Nueva cuenta')]");
    public static final Target DRP_CUENTA_DESTINO = Target.the("Desplegable Cuenta destino").locatedBy("(//DIV[@class='ng-value-container'])[2]");
    public static final Target BTN_DESTINO = Target.the("Opción Cuenta destino").locatedBy("//span[contains(text(),'{0}')]");
    public static final Target CHK_INSCRIBIR_NUEVA_CUENTA = Target.the("Checkbox inscribir cuenta").locatedBy("//span[contains(@class, 'c-switch-slider')][1]");
    public static final Target TXT_VALOR = Target.the("Campo valor").locatedBy("//input[@id='amount']");
    public static final Target BTN_AÑADIR_A_LISTA = Target.the("Boton añadir a la lista").locatedBy("//button[contains(text(),'Añadir a lista')]");
    public static final Target BTN_ENVIAR_LOTE = Target.the("Boton enviar lote").locatedBy("//button[contains(text(),'Enviar lote')]");
    public static final Target BTN_GUARDAR_PAGO = Target.the("Boton guardar pago").locatedBy("//button[contains(text(),'Guardar')]");
    public static final Target LBL_PAGO_GUARDADO = Target.the("Label ¡Pago guardado!").locatedBy("//h5[contains(text(),'¡Pago guardado!')]");
    public static final Target LBL_TRANSACCION_PENDIENTE = Target.the("Label Transaccion pendiente").locatedBy("//h5[contains(text(), '¡Transacción pendiente!')]");
    public static final Target LBL_TRANSACCIONES_OTROS_BANCOS = Target.the("Transacciones a otros bancos").locatedBy("//h6[contains(text(), 'Transacciones a otros bancos')]");

}
