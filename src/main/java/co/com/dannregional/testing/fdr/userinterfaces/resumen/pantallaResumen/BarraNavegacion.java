package co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BarraNavegacion extends PageObject {

    public static final Target BTN_RESUMEN = Target.the("Menú de Resumen").locatedBy("//p[contains(text(),'Resumen')]");
    public static final Target BTN_TRANSFERENCIAS = Target.the("Menú de Transferencias").locatedBy("//p[contains(text(),'Transferencias')]");
    public static final Target BTN_PAGOS = Target.the("Menú de Pagos").locatedBy("//p[contains(text(),'Pagos')]");
    public static final Target BTN_TRANSACCIONES_PENDIENTES = Target.the("Menú de Transacciones Pendientes").locatedBy("//p[contains(text(),'Transacciones pendientes')]");
    public static final Target BTN_HISTORICO_TRANSACCIONES = Target.the("Menú de Histórico de Transacciones").locatedBy("//p[contains(text(),'Histórico de transacciones')]");
    public static final Target BTN_GESTION_USUARIOS = Target.the("Menú de Gestión de Usuarios").locatedBy("//p[contains(text(),'Gestión de usuarios')]");
    public static final Target BTN_ADMINISTRACION = Target.the("Menú de Administración").locatedBy("//p[contains(text(),'Administración')]");

}
