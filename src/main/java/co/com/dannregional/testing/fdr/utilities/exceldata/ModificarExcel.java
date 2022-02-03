package co.com.dannregional.testing.fdr.utilities.exceldata;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static co.com.dannregional.testing.fdr.tasks.administracion.cambiarContraseña.IngresarRepetirNuevaContraseñaTask.nuevaContraseña;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ModificarExcel implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            FileInputStream file = new FileInputStream(new File("C:/Users/EQUIPO/Documents/Automation/Proyectos/Dann Regional/src/test/resources/co.com.dannregional.testing.fdr/datadriver/administracion/cambiarContraseña/CambiarContraseña.xlsx"));
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);

            XSSFRow fila = sheet.getRow(1);

            if(fila == null){
                fila = sheet.createRow(2);
            }

            XSSFCell celda = fila.createCell(2);

            if(celda == null){
                celda = fila.createCell(2);
            }

            celda.setCellValue(nuevaContraseña);

            file.close();

            FileOutputStream output = new FileOutputStream("C:/Users/EQUIPO/Documents/Automation/Proyectos/Dann Regional/src/test/resources/co.com.dannregional.testing.fdr/datadriver/administracion/cambiarContraseña/CambiarContraseña.xlsx");
            wb.write(output);
            output.close();

        } catch (IOException ex) {
            Logger.getLogger(ModificarExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static ModificarExcel modificarCeldaExcel(){
        return instrumented(ModificarExcel.class);
    }
}
