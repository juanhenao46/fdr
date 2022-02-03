package co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Resumen extends PageObject {

    public static final Target LBL_SALDO_TOTAL_OCULTO = Target.the("Validación Saldos oculto").locatedBy("//p[contains(@class,'balance hidden')]");
    public static final Target LBL_SALDO_TOTAL = Target.the("Label Saldo total").locatedBy("//h6[contains(text(),'Saldo total')]");
    public static final Target BTN_CUENTA = Target.the("Botón Cuenta de Ahorro").locatedBy("//b[contains(text(),'{0}')]");
    public static final Target BTN_OJO_SALDO_TOTAL = Target.the("Ojo Ocultar y Mostrar Saldo total").locatedBy("//h6[contains(text(),'Saldo total')]//following::span[contains(@class,'show-button')][1]");
    public static final Target BTN_OJO_ULTIMAS_OPERACIONES = Target.the("Ojo Ocultar y Mostrar Ultimas operaciones").locatedBy("//h6[contains(text(),'Saldo total')]//following::span[contains(@class,'show-button')][2]");
    public static final Target LBL_PRODUCTOS = Target.the("Validación título Productos").locatedBy("//b[contains(text(),'Productos')]");
    public static final Target LBL_ULTIMAS_OPERACIONES = Target.the("Validación título Ultimas operaciones").locatedBy("//h5[contains(text(),'Últimas operaciones')]");
    public static final Target LBL_RESUMEN_DEL_SALDO = Target.the("Validación título Resumen del saldo").locatedBy("//h5[contains(text(),'Resumen del saldo')]");
    public static final Target LBL_RESUMEN_POR_PRODUCTO = Target.the("Validación título Resumen por producto").locatedBy("//h5[contains(text(),'Resumen por producto')]");
    public static final Target BTN_VER_TODO = Target.the("Botón Ver todas las operaciones").locatedBy("//button[contains(text(),'Ver todo')]");
    public static final Target LBL_CIFRA_EN_MILES = Target.the("Label Cifras en miles de pesos").locatedBy("//i[contains(text(), 'Cifras en miles de pesos')]");
    public static final Target DRP_FILTRO_SALDO_TOTAL_DIAS = Target.the("Filtro de Saldo total por Días").locatedBy("//div[contains(@class,'ng-input')]//following::span[contains(@class,'ng-arrow-wrapper')][1]");
    public static final Target DRP_FILTRO_RESUMEN_SALDO_DIAS = Target.the("Filtro de Resumen de Saldo por Días").locatedBy("//div[contains(@class,'ng-input')]//following::span[contains(@class,'ng-arrow-wrapper')][2]");
    public static final Target DRP_FILTRO_RESUMEN_PRODUCTO_DIAS = Target.the("Filtro de Resumen por Productos por Días").locatedBy("//div[contains(@class,'ng-input')]//following::span[contains(@class,'ng-arrow-wrapper')][3]");
    public static final Target BTN_DIAS = Target.the("Opción filtrar por X días").locatedBy("//span[contains(text(),'{0}')]");
    public static final Target LBL_VALIDAR_TITULO = Target.the("Validación título").locatedBy("//h2[contains(text(),'{0}')]");
    public static final Target LBL_VALIDAR_SUBTITULO = Target.the("Validación Subtitulo").locatedBy("//*[contains(text(),'{0}')]");
    public static final Target LBL_VALIDAR_NOMBRE_USUARIO = Target.the("Validación Nombre de usuario").locatedBy("//b[contains(text(),'{0}')]");

}
