package co.com.dannregional.testing.fdr.utilities.robot;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CargarArchivo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        esperarEnSegundos(2000);
        String fileLocation = ("C:\\Users\\EQUIPO\\Desktop\\DataLotes\\loteOk.csv");
        StringSelection filePath = new StringSelection(fileLocation);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
        esperarEnSegundos(2000);

        try{
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }catch (AWTException e){
            e.printStackTrace();
        }
    }
    public static CargarArchivo conRobot() {
        return instrumented(CargarArchivo.class);
    }
}
