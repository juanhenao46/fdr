package co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasPropias;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CuentasPropias extends PageObject {

    public static final Target DRP_PRODUCTO_ORIGEN = Target.the("Desplegable Producto origen").locatedBy("(//DIV[@class='ng-value-container'])[1]");
    public static final Target BTN_ORIGEN = Target.the("Opción Cuenta origen").locatedBy("//span[contains(text(),'{0}')]");
    public static final Target DRP_PRODUCTO_DESTINO = Target.the("Desplegable Producto destino").locatedBy("(//DIV[@class='ng-value-container'])[2]");
    public static final Target BTN_DESTINO = Target.the("Opción Cuenta destino").locatedBy("//span[contains(text(),'{0}')]");
    public static final Target BTN_NEXT = Target.the("Botón Siguiente").locatedBy("//button[contains(text(),'Siguiente')]");
    public static final Target TXT_VALOR = Target.the("Campo Valor").located(By.id("amount"));
    public static final Target TXT_FECHA_EJECUCION = Target.the("Campo Fecha de Ejecución").locatedBy("//h5[contains(text(),'Fecha de')]//following::div");
    public static final Target BTN_MESES =Target.the("Boton para seleccionar el mes").locatedBy("//button[contains(@class,'ant-picker-header-month-btn ng-star-inserted')]");
    public static final Target BTN_MES =Target.the("Botón para seleccionar el mes").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target BTN_DIA =Target.the("Botón para seleccionar el dia  del mes").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target BTN_FECHA_EJECUCION = Target.the("ícono Fecha de Ejecución").locatedBy("//span[contains(@class,'ng-tns-c110-4 ant-picker-suffix ng-star-inserted')]");
    public static final Target DRP_PERIOCIDAD = Target.the("Desplegable Periocidad").locatedBy("");
    public static final Target TXT_DETALLE = Target.the("Campo Detalle").located(By.id("details"));
    public static final Target DRP_ETIQUETA = Target.the("Desplegable Etiqueta").locatedBy("");
    public static final Target LBL_RESUMEN = Target.the("Titulo Resumen").locatedBy("//h5[contains(text(),'Resumen')]");
    public static final Target BTN_EJECUTAR_TRANSFERENCIA = Target.the("Botón Ejecutar transferencia").locatedBy("//button[contains(text(),'Ejecutar')]");
    public static final Target LBL_TRANSACCION_EXITOSA = Target.the("Titulo Transacción exitosa").locatedBy("//h5[contains(text(),'¡Transacción exitosa!')]");
    public static final Target LBL_TRANSACCION_PENDIENTE_DE_AUTORIZACION = Target.the("Titulo Transacción pendiente autorización").locatedBy("//h5[contains(text(),'Transacción pendiente de autorización')]");

}
