package co.com.dannregional.testing.fdr.userinterfaces.salir.cerrarSesión;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CerrarSesion extends PageObject {

    public static final Target BTN_SALIR = Target.the("Botón Salir").locatedBy("//header/div[1]/div[1]/div[4]/button[1]");
    public static final Target BTN_CONFIRMAR_SALIR = Target.the("Botón Confirmar Salir").locatedBy("//body/app-root[1]/div[1]/app-private-layout[1]/app-logout-confirmation[1]/app-modal[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]");
    public static final Target BTN_CANCELAR_SALIR = Target.the("Botón Cancelar Salir").locatedBy("//a[contains(text(),'Cancelar')]");
}
