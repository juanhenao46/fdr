package co.com.dannregional.testing.fdr.tasks.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.dannregional.testing.fdr.interactions.bancoIris.ClicEnSiguiente.clicEnSiguiente;
import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.NuevoRol.*;
import static co.com.dannregional.testing.fdr.utilities.datos.DatosPrueba.obtener;
import static co.com.dannregional.testing.fdr.utilities.random.RandomNombreNuevoRol.generarNuevoNombreRolRandom;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class IngresarDatosDelRolTask implements Task {

    public static String nombreRol = generarNuevoNombreRolRandom();
    public static String nombreRolInactivo = generarNuevoNombreRolRandom();

    public static String descripcionRol = "Creacion rol automatizado";
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(obtener("estado rol").equals("Activo")).andIfSo(
                        WaitUntil.the(TXT_NOMBRE_ROL, isCurrentlyEnabled()),
                        Enter.theValue(nombreRol).into(TXT_NOMBRE_ROL),
                        esperarEnSegundos(1000),
                        Enter.theValue(descripcionRol).into(TXT_DESCRIPCION),
                        clicEnSiguiente()
                ),
                Check.whether(obtener("estado rol").equals("Inactivo")).andIfSo(
                        WaitUntil.the(TXT_NOMBRE_ROL, isCurrentlyEnabled()),
                        Enter.theValue(nombreRolInactivo).into(TXT_NOMBRE_ROL),
                        esperarEnSegundos(1000),
                        Click.on(CHK_ACTIVO_INACTIVO),
                        esperarEnSegundos(1000),
                        Enter.theValue(descripcionRol).into(TXT_DESCRIPCION),
                        clicEnSiguiente()
                )
        );
    }
    public static IngresarDatosDelRolTask ingresarDatosDelRol() {
        return instrumented(IngresarDatosDelRolTask.class);
    }
}
