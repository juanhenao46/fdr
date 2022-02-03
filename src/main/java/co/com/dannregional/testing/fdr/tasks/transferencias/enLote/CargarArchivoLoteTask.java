package co.com.dannregional.testing.fdr.tasks.transferencias.enLote;

import co.com.dannregional.testing.fdr.utilities.robot.CargarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.dannregional.testing.fdr.interactions.bancoIris.ClicEnSiguiente.clicEnSiguiente;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.enLote.EnLote.BTN_CARGAR_ARCHIVO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class CargarArchivoLoteTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CARGAR_ARCHIVO, isCurrentlyEnabled()),
                Click.on(BTN_CARGAR_ARCHIVO));
        actor.attemptsTo(
                CargarArchivo.conRobot(),
                clicEnSiguiente()
        );
    }
    public static CargarArchivoLoteTask cargarArchivoLoteTask() {
        return instrumented(CargarArchivoLoteTask.class);
    }
}
