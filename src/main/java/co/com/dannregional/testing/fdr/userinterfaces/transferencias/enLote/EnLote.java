package co.com.dannregional.testing.fdr.userinterfaces.transferencias.enLote;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class EnLote extends PageObject {

    public static final Target BTN_CARGAR_ARCHIVO = Target.the("Input archivo").locatedBy("//ngx-dropzone[@class='custom-dropzone']");
    public static final Target TXT_NOMBRE_DEL_LOTE = Target.the("campo nombre del lote").locatedBy("//input[@id='details']");

    public static final Target LBL_NOMBRE_DEL_ARCHIVO = Target.the("texto nombre del archivo").locatedBy("//h6[@class='clickable link']");
    public static final Target LBL_NOMBRE_DEL_LOTE = Target.the("texto nombre del lote").locatedBy("(//small[contains(text(),'Nombre del lote')]//following::h6)[1]");
    public static final Target LBL_FECHA_CREACION = Target.the("texto fecha de creacion").locatedBy("(//small[contains(text(),'Fecha de creación')]//following::h6)[1]");
    public static final Target LBL_TOTAL_A_PROCESAR = Target.the("texto total a procesar").locatedBy("//h3[@class='total-amount']");
    public static final Target LBL_PRODUCTO = Target.the("texto producto origen").locatedBy("(//small[contains(text(),'Producto')]//following::h6)[1]");
    public static final Target LBL_ERROR_FORMATO = Target.the("popup el archivo debe estar en csv/txt").locatedBy("//div[contains(text(),'El archivo debe estar en formato CSV o TXT')]");
    public static final Target LBL_ERROR_PESO = Target.the("popup el archivo no debe pesar más de 2mb").locatedBy("//div[contains(text(),'El archivo no debe pesar más de 2mb')]");


}
