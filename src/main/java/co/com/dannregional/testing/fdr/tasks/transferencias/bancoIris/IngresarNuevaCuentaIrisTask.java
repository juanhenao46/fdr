package co.com.dannregional.testing.fdr.tasks.transferencias.bancoIris;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.ClicEnSiguiente.clicEnSiguiente;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.inscribirCuentas.cuentasIris.ConcluirInscripcionTask.concluirInscripcion;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.inscribirCuentas.cuentasIris.IngresarNumeroDeCuentaTask.ingresarNumeroDeCuenta;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasPropias.CuentasPropias.*;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasIris.CuentasIris.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class IngresarNuevaCuentaIrisTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DRP_PRODUCTO_ORIGEN, isCurrentlyEnabled()),
                esperarEnSegundos(1000),
                Click.on(DRP_PRODUCTO_ORIGEN),
                esperarEnSegundos(1000),
                Click.on(BTN_ORIGEN.of(obtener("cuenta origen"))),
                esperarEnSegundos(1000),
                Click.on(DRP_PRODUCTO_DESTINO),
                esperarEnSegundos(1000),
                Click.on(BTN_NUEVA_CUENTA),
                esperarEnSegundos(1000),
                ingresarNumeroDeCuenta(),
                Click.on(CHK_INSCRIBIR_CUENTA),
                concluirInscripcion(),
                clicEnSiguiente()
        );
    }
    public static IngresarNuevaCuentaIrisTask ingresarNuevaCuentaIris() {
        return instrumented(IngresarNuevaCuentaIrisTask.class);
    }
}
