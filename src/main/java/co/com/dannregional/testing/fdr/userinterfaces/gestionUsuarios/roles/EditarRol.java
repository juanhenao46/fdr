package co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class EditarRol extends PageObject {


    public static final WebDriver driver = new ChromeDriver();

    public static final Target BTN_EDITAR = Target.the("Boton Editar").locatedBy("//button[contains(text(),'Editar')]");

    public static final List<WebElement> BOTON_EDITAR = driver.findElements(By.xpath("//button[contains(text(),'Editar')]"));

    public static final Target BTN_GUARDAR = Target.the("Boton Guardar").locatedBy("//button[contains(text(),'Guardar')]");
    public static final Target DRP_EDITAR_AUTORIZADORES_CUENTAS_PROPIAS = Target.the("Desplegable edicion autorizadores cuentas propias").locatedBy("(//span[@class='ng-arrow-wrapper'])[5]");


}
