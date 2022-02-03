package co.com.dannregional.testing.fdr.tasks.transferencias.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasPropias.CuentasPropias.*;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.otrosBancos.OtrosBancos.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;

public class IngresarOrigenYDestinoTask implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
                if(DRP_PRODUCTO_DESTINO_OTROS_BANCOS.resolveFor(actor).isCurrentlyEnabled()) {
                    actor.attemptsTo(
                            WaitUntil.the(DRP_PRODUCTO_ORIGEN, isCurrentlyEnabled()),
                            esperarEnSegundos(1000),
                            Click.on(DRP_PRODUCTO_ORIGEN),
                            Click.on(BTN_ORIGEN.of(obtener("cuenta origen"))),
                            esperarEnSegundos(1000),
                            Click.on(DRP_BANCO_DESTINO),
                            Click.on(BTN_BANCO_DESTINO.of(obtener("banco destino"))),
                            esperarEnSegundos(1000),
                            Click.on(DRP_PRODUCTO_DESTINO_OTROS_BANCOS),
                            Click.on(BTN_DESTINO.of(obtener("cuenta destino"))),
                            esperarEnSegundos(1000),
                            Click.on(BTN_NEXT),
                            esperarEnSegundos(1000)
                    );
                }else {
                    actor.attemptsTo(
                            WaitUntil.the(DRP_PRODUCTO_ORIGEN, isCurrentlyEnabled()),
                            esperarEnSegundos(1000),
                            Click.on(DRP_PRODUCTO_ORIGEN),
                            Click.on(BTN_ORIGEN.of(obtener("cuenta origen"))),
                            esperarEnSegundos(1000),
                            Click.on(DRP_PRODUCTO_DESTINO),
                            Click.on(BTN_DESTINO.of(obtener("cuenta destino"))),
                            esperarEnSegundos(1000),
                            Click.on(BTN_NEXT),
                            esperarEnSegundos(1000)
                    );
                }
    }
    public static IngresarOrigenYDestinoTask ingresarOrigenYDestino() {
        return instrumented(IngresarOrigenYDestinoTask.class);
    }
}
