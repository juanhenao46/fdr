package co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.ClicEnSiguiente.clicEnSiguiente;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class SeleccionarUsuariosYAutorizadoresDelRolTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(obtener("estado rol").equals("Activo")).andIfSo(
                        WaitUntil.the(BTN_USUARIO_ASIGNAR, isCurrentlyEnabled()),
                        Click.on(BTN_USUARIO_ASIGNAR),
                        esperarEnSegundos(1000),
                        Click.on(BTN_FLECHA_ASIGNAR_USUARIO),
                        esperarEnSegundos(1000),
                        Click.on(DRP_AUTORIZADORES_CUENTAS_PROPIAS),
                        esperarEnSegundos(1000),
                        Click.on(BTN_OPCION_ADMINISTRADOR),
                        esperarEnSegundos(1000),
                        Click.on(DRP_AUTORIZADORES_CUENTAS_IRIS),
                        esperarEnSegundos(1000),
                        Click.on(BTN_OPCION_ADMINISTRADOR),
                        esperarEnSegundos(1000),
                        Click.on(DRP_AUTORIZADORES_OTROS_BANCOS),
                        esperarEnSegundos(1000),
                        Click.on(BTN_OPCION_ADMINISTRADOR),
                        esperarEnSegundos(1000),
                        clicEnSiguiente()
                ),
                Check.whether(obtener("estado rol").equals("Inactivo")).andIfSo(
                        WaitUntil.the(BTN_USUARIO_ASIGNAR, isCurrentlyEnabled()),
                        Click.on(DRP_AUTORIZADORES_CUENTAS_PROPIAS),
                        esperarEnSegundos(1000),
                        Click.on(BTN_OPCION_ADMINISTRADOR),
                        esperarEnSegundos(1000),
                        Click.on(DRP_AUTORIZADORES_CUENTAS_IRIS),
                        esperarEnSegundos(1000),
                        Click.on(BTN_OPCION_ADMINISTRADOR),
                        esperarEnSegundos(1000),
                        Click.on(DRP_AUTORIZADORES_OTROS_BANCOS),
                        esperarEnSegundos(1000),
                        Click.on(BTN_OPCION_ADMINISTRADOR),
                        esperarEnSegundos(1000),
                        clicEnSiguiente()
                )
            );
    }
    public static SeleccionarUsuariosYAutorizadoresDelRolTask seleccionarUsuariosYAutorizadoresDelRol() {
        return instrumented(SeleccionarUsuariosYAutorizadoresDelRolTask.class);
    }
}
