package co.com.dannregional.testing.fdr.tasks.transferencias.enLote;

import co.com.dannregional.testing.fdr.utilities.robot.CargarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.ClicEnSiguiente.clicEnSiguiente;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasPropias.CuentasPropias.BTN_NEXT;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.enLote.EnLote.BTN_CARGAR_ARCHIVO;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.enLote.EnLote.TXT_NOMBRE_DEL_LOTE;
import static co.com.dannregional.testing.fdr.utilities.random.RandomNombreLote.genenrarNuevoNombreLote;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class IngresarDetalleDelLoteTask implements Task {

    public static String nombreLote = genenrarNuevoNombreLote();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_NOMBRE_DEL_LOTE, isCurrentlyEnabled()),
                Enter.theValue(nombreLote).into(TXT_NOMBRE_DEL_LOTE)
        );
        actor.attemptsTo(
                WaitUntil.the(BTN_NEXT, isCurrentlyEnabled()),
                clicEnSiguiente()
        );
    }
    public static IngresarDetalleDelLoteTask ingresarDetalleDelLote() {
        return instrumented(IngresarDetalleDelLoteTask.class);
    }
}
