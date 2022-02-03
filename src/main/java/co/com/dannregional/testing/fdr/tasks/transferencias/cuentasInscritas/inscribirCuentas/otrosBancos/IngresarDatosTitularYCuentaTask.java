package co.com.dannregional.testing.fdr.tasks.transferencias.cuentasInscritas.inscribirCuentas.otrosBancos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.InscribirCuentas.InscribirCuentaOtrosBancos.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static co.com.dannregional.testing.fdr.utilities.random.RandomNumeroIdentificacion.generarNumeroIdentificacionRandom;
import static co.com.dannregional.testing.fdr.utilities.random.RandomNumeroCuenta.generarNumeroCuentaRandom;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class IngresarDatosTitularYCuentaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Enter.theValue(obtener("titular de cuenta")).into(TXT_TITULAR_CUENTA),
                Click.on(DRP_TIPO_DE_DOCUMENTO),
                esperarEnSegundos(1000),
                Click.on(BTN_TIPO_DE_DOCUMENTO.of(obtener("tipo de documento"))),
                Enter.theValue(generarNumeroIdentificacionRandom()).into(TXT_NUMERO_DE_DOCUMENTO),
                Click.on(DRP_BANCO),
                Click.on(BTN_BANCO.of(obtener("banco"))),
                Click.on(DRP_TIPO_DE_CUENTA),
                Click.on(BTN_TIPO_DE_CUENTA.of(obtener("tipo de cuenta"))),
                Enter.theValue((generarNumeroCuentaRandom())).into(TXT_NUMERO_DE_CUENTA),
                esperarEnSegundos(2000)
        );
    }
    public static IngresarDatosTitularYCuentaTask ingresarDatosTitularYCuenta() {
        return instrumented(IngresarDatosTitularYCuentaTask.class);
    }
}
