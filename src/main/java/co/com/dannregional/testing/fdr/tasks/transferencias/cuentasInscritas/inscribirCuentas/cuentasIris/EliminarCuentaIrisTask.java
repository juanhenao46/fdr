package co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.inscribirCuentas.cuentasIris;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.IngresarOTPInscribirCuentas.ingresarOTPInscribirCuentas;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.comunes.AccederACuentasInscritasTask.accederACuentasInscritas;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.pantalla.PantallaCuentasInscritas.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarCuentaIrisTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                accederACuentasInscritas(),
                esperarEnSegundos(2000),
                Enter.theValue(obtener("titular de cuenta")).into(TXT_TITULAR_O_DESCRIPCION),
                esperarEnSegundos(1000),
                Click.on(BTN_CUENTA.of(obtener("numero de cuenta"))),
                esperarEnSegundos(1000),
                Click.on(BTN_ELIMINAR_CUENTA),
                Click.on(BTN_ELIMINAR),
                ingresarOTPInscribirCuentas()
        );
    }

    public static EliminarCuentaIrisTask eliminarCuentaIris() {
        return instrumented(EliminarCuentaIrisTask.class);
    }
}
