package co.com.dannregional.testing.fdr.tasks.administracion.cambiarContraseña;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.ClicEnSiguiente.clicEnSiguiente;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.cambiarContraseña.CambiarContraseña.*;
import static co.com.dannregional.testing.fdr.utilities.exceldata.ModificarExcel.modificarCeldaExcel;
import static co.com.dannregional.testing.fdr.utilities.random.RandomContraseñaNueva.generarNuevaContraseñaRandom;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarRepetirNuevaContraseñaTask implements Task {

    public static String nuevaContraseña = generarNuevaContraseñaRandom();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                Enter.theValue(nuevaContraseña).into(TXT_NUEVA_CONTRASEÑA),
                esperarEnSegundos(1000),
                Enter.theValue(nuevaContraseña).into(TXT_REPETIR_CONTRASEÑA),
                modificarCeldaExcel(),
                clicEnSiguiente(),
                esperarEnSegundos(2000)
        );
    }
    public static IngresarRepetirNuevaContraseñaTask ingresarRepetirNuevaContraseña() {
        return instrumented(IngresarRepetirNuevaContraseñaTask.class);
    }
}
