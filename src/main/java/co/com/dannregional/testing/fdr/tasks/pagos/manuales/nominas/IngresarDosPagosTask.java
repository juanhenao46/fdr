package co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.ClicEnSiguiente.clicEnSiguiente;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.pagos.manuales.PagosManuales.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarDosPagosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Click.on(BTN_LIMPIAR_BANCO),
                Click.on(DRP_BANCO_DESTINO),
                Click.on(BTN_BANCO_DESTINO.of(obtener("banco destino"))),
                Click.on(DRP_CUENTA_DESTINO),
                Click.on(BTN_DESTINO.of(obtener("cuenta destino"))),
                Enter.theValue(obtener("valor")).into(TXT_VALOR),
                esperarEnSegundos(1000),
                Click.on(BTN_AÑADIR_A_LISTA),
                esperarEnSegundos(1000),
                Click.on(BTN_LIMPIAR_BANCO),
                Click.on(DRP_BANCO_DESTINO),
                Click.on(BTN_BANCO_DESTINO.of(obtener("banco destino 2"))),
                Click.on(DRP_CUENTA_DESTINO),
                Click.on(BTN_DESTINO.of(obtener("cuenta destino 2"))),
                Enter.theValue(obtener("valor")).into(TXT_VALOR),
                esperarEnSegundos(1000),
                Click.on(BTN_AÑADIR_A_LISTA),
                clicEnSiguiente()
        );
    }
    public static IngresarDosPagosTask ingresarDosPagos() {
        return instrumented(IngresarDosPagosTask.class);
    }
}
