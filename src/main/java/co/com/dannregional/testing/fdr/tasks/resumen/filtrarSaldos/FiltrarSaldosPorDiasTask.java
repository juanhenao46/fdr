package co.com.dannregional.testing.fdr.tasks.resumen.filtrarSaldos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.Resumen.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FiltrarSaldosPorDiasTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(obtener("producto").equals("Saldo total")).andIfSo(
                        WaitUntil.the(DRP_FILTRO_SALDO_TOTAL_DIAS, isCurrentlyEnabled()),
                        Click.on(DRP_FILTRO_SALDO_TOTAL_DIAS),
                        esperarEnSegundos(1000),
                        Click.on(BTN_DIAS.of(obtener("dias"))),
                        esperarEnSegundos(1000)
                ),
                Check.whether(obtener("producto").equals("Resumen del saldo")).andIfSo(
                        WaitUntil.the(DRP_FILTRO_RESUMEN_SALDO_DIAS, isCurrentlyEnabled()),
                        Scroll.to(LBL_PRODUCTOS),
                        esperarEnSegundos(1000),
                        Click.on(DRP_FILTRO_RESUMEN_SALDO_DIAS),
                        esperarEnSegundos(1000),
                        Click.on(BTN_DIAS.of(obtener("dias"))),
                        esperarEnSegundos(1000)
                ),
                Check.whether(obtener("producto").equals("Resumen por producto")).andIfSo(
                        WaitUntil.the(DRP_FILTRO_RESUMEN_PRODUCTO_DIAS, isCurrentlyEnabled()),
                        Scroll.to(DRP_FILTRO_RESUMEN_PRODUCTO_DIAS),
                        esperarEnSegundos(1000),
                        Click.on(DRP_FILTRO_RESUMEN_PRODUCTO_DIAS),
                        esperarEnSegundos(1000),
                        Click.on(BTN_DIAS.of(obtener("dias"))),
                        esperarEnSegundos(1000)
                )
                );
    }
    public static FiltrarSaldosPorDiasTask filtrarSaldoDias () {
        return instrumented(FiltrarSaldosPorDiasTask.class);
    }
}
