package co.com.dannregional.testing.fdr.stepdefinitions.autentificacion.olvidoContraseña;

import co.com.dannregional.testing.fdr.utilities.datos.CargarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;
import java.util.Map;

import static co.com.dannregional.testing.fdr.questions.autentificacion.olvidoContraseña.ValidaMensajeConfirmacionQuestion.validaMensajeConfirmacion;
import static co.com.dannregional.testing.fdr.tasks.autentificacion.olvidoSuContraseña.RecuperarContraseñaTask.recuperarContraseña;
import static co.com.dannregional.testing.fdr.tasks.autentificacion.olvidoSuContraseña.CrearNuevaContraseñaTask.crearNuevaContraseña;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class OlvidoContraseñaStepDefinitions {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }


    @Cuando("^el usuario selecciona olvidaste tu contraseña e ingresa los datos$")
    public void el_usuario_selecciona_olvidaste_tu_contraseña_e_ingresa_los_datos() {
        theActorInTheSpotlight().attemptsTo(
                recuperarContraseña()
        );
    }

    @Entonces("^el usuario deberia poder ver el mensaje de confirmacion$")
    public void el_usuario_deberia_poder_ver_el_mensaje_de_confirmacion() {
        theActorInTheSpotlight().should(seeThat(validaMensajeConfirmacion()));
    }
}
