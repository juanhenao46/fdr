package co.com.dannregional.testing.fdr.tasks.resumen.barraDeNavegacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.concurrent.Delayed;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.resumen.pantallaResumen.BarraNavegacion.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AccederFuncionalidadesNavBarTask implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Check.whether(obtener("funcionalidad").equals("Transferencias")).andIfSo(
                            WaitUntil.the(BTN_TRANSFERENCIAS, isCurrentlyEnabled()).forNoMoreThan(7).seconds(),
                            Click.on(BTN_TRANSFERENCIAS),
                            esperarEnSegundos(3000)
                    ),
                    Check.whether(obtener("funcionalidad").equals("Pagos")).andIfSo(
                            WaitUntil.the(BTN_PAGOS, isCurrentlyEnabled()).forNoMoreThan(7).seconds(),
                            Click.on(BTN_PAGOS),
                            esperarEnSegundos(3000)
                    ),
                    Check.whether(obtener("funcionalidad").equals("Transacciones pendientes")).andIfSo(
                            WaitUntil.the(BTN_TRANSACCIONES_PENDIENTES, isCurrentlyEnabled()).forNoMoreThan(7).seconds(),
                            Click.on(BTN_TRANSACCIONES_PENDIENTES),
                            esperarEnSegundos(3000)
                    ),
                    Check.whether(obtener("funcionalidad").equals("Historico de transacciones")).andIfSo(
                            WaitUntil.the(BTN_HISTORICO_TRANSACCIONES, isCurrentlyEnabled()).forNoMoreThan(7).seconds(),
                            Click.on(BTN_HISTORICO_TRANSACCIONES),
                            esperarEnSegundos(3000)
                    ),
                    Check.whether(obtener("funcionalidad").equals("Gestion de usuarios")).andIfSo(
                            WaitUntil.the(BTN_GESTION_USUARIOS, isCurrentlyEnabled()).forNoMoreThan(7).seconds(),
                            Click.on(BTN_GESTION_USUARIOS),
                            esperarEnSegundos(3000)
                    ),
                    Check.whether(obtener("funcionalidad").equals("Administracion")).andIfSo(
                            WaitUntil.the(BTN_ADMINISTRACION, isCurrentlyEnabled()).forNoMoreThan(7).seconds(),
                            Click.on(BTN_ADMINISTRACION),
                            esperarEnSegundos(3000)
                    ),
                    Check.whether(obtener("funcionalidad").equals("Resumen")).andIfSo(
                            WaitUntil.the(BTN_RESUMEN, isCurrentlyEnabled()).forNoMoreThan(7).seconds(),
                            Click.on(BTN_RESUMEN),
                            esperarEnSegundos(3000)
                    )
            );
        }
        public static AccederFuncionalidadesNavBarTask accederFuncionalidadesNavBar () {
            return instrumented(AccederFuncionalidadesNavBarTask.class);
        }
}
