package co.com.dannregional.testing.fdr.tasks.administracion.etiquetasIdentificacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.etiquetasIdentificacion.EtiquetasDeIdentificacion.*;
import static co.com.dannregional.testing.fdr.userinterfaces.administracion.pantallaAdmin.AdministracionPantalla.BTN_ETIQUETAS_DE_IDENTIFICACION;
import static co.com.dannregional.testing.fdr.utilities.random.RandomNombreNuevaEtiqueta.generarNuevoNombreEtiquetaRandom;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CrearNuevaEtiquetaDeIdentificacionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(1000),
                Click.on(BTN_CREAR_NUEVA),
                esperarEnSegundos(1000),
                Enter.theValue(generarNuevoNombreEtiquetaRandom()).into(TXT_NOMBRE_ETIQUETA),
                esperarEnSegundos(1000),
                Click.on(BTN_CREAR),
                esperarEnSegundos(1000)
        );
    }
    public static CrearNuevaEtiquetaDeIdentificacionTask crearNuevaEtiquetaDeIdentificacion() {
        return instrumented(CrearNuevaEtiquetaDeIdentificacionTask.class);
    }
}
