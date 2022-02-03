package co.com.dannregional.testing.fdr.tasks.pagos.manuales.nominas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.ClicEnSiguiente.clicEnSiguiente;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.pagos.manuales.PagosManuales.*;
import static co.com.dannregional.testing.fdr.userinterfaces.transferencias.cuentasInscritas.InscribirCuentas.InscribirCuentaOtrosBancos.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static co.com.dannregional.testing.fdr.utilities.random.RandomNumeroCuenta.generarNumeroCuentaRandom;
import static co.com.dannregional.testing.fdr.utilities.random.RandomNumeroIdentificacion.generarNumeroIdentificacionRandom;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarUnPagoNuevaCuentaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                esperarEnSegundos(2000),
                Click.on(BTN_LIMPIAR_BANCO),
                Click.on(DRP_BANCO_DESTINO),
                Click.on(BTN_BANCO_DESTINO.of(obtener("banco destino"))),
                Click.on(DRP_CUENTA_DESTINO),
                Click.on(BTN_NUEVA_CUENTA),
                esperarEnSegundos(2000),
                Enter.theValue(obtener("titular de cuenta")).into(TXT_TITULAR_CUENTA),
                Click.on(DRP_TIPO_DE_DOCUMENTO),
                Click.on(BTN_TIPO_DE_DOCUMENTO.of(obtener("tipo de documento"))),
                Enter.theValue(generarNumeroIdentificacionRandom()).into(TXT_NUMERO_DE_DOCUMENTO),
                Click.on(DRP_TIPO_DE_CUENTA),
                Click.on(BTN_TIPO_DE_CUENTA.of(obtener("tipo de cuenta"))),
                Enter.theValue((generarNumeroCuentaRandom())).into(TXT_NUMERO_DE_CUENTA),
                esperarEnSegundos(1000),
                Click.on(CHK_INSCRIBIR_NUEVA_CUENTA),
                Click.on(BTN_FINALIZAR),
                Enter.theValue(obtener("valor")).into(TXT_VALOR),
                esperarEnSegundos(1000),
                Click.on(BTN_AÑADIR_A_LISTA),
                esperarEnSegundos(1000),
                clicEnSiguiente()
        );
    }
    public static IngresarUnPagoNuevaCuentaTask ingresarUnPagoNuevaCuenta() {
        return instrumented(IngresarUnPagoNuevaCuentaTask.class);
    }
}
