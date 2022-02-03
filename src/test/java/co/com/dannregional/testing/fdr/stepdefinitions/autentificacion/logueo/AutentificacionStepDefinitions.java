package co.com.dannregional.testing.fdr.stepdefinitions.autentificacion.logueo;

import co.com.dannregional.testing.fdr.utilities.datos.CargarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;
import java.util.Map;

import static co.com.dannregional.testing.fdr.questions.resumen.dashboard.ValidaTituloResumenDelSaldoQuestion.validaTituloResumenDelSaldo;
import static co.com.dannregional.testing.fdr.questions.resumen.dashboard.ValidaTituloResumenPorProductoQuestion.validaTituloResumenPorProducto;
import static co.com.dannregional.testing.fdr.questions.resumen.dashboard.ValidaTituloUltimasOperacionesQuestion.validaTituloUltimasOperaciones;
import static co.com.dannregional.testing.fdr.questions.resumen.dashboard.ValidaTituloProductosQuestion.validarTituloProductos;
import static co.com.dannregional.testing.fdr.questions.resumen.dashboard.ValidaTituloSaldoTotalQuestion.validarTituloSaldoTotal;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.dannregional.testing.fdr.tasks.opensite.OpenSiteTask.openSiteDannRegional;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.dannregional.testing.fdr.questions.autentificacion.logueo.ValidarUsuarioQuestion.validarUsuario;
import static co.com.dannregional.testing.fdr.tasks.autentificacion.logueo.IngresarUsuarioTask.ingresarUsuario;


public class AutentificacionStepDefinitions {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario tiene toda la informacion que necesita$")
    public void queElUsuarioTieneTodaLaInformacionQueNecesita(List<Map<String, Object>> informacion) {
        theActorCalled("Usuario").attemptsTo(CargarDatos.conLaSiguiente(informacion));
    }

    @Dado("^que el usuario se encuentra en el aplicativo Banca Digital$")
    public void queElUsuarioSeEncuentraEnElAplicativoBancaDigital() {
        theActorInTheSpotlight().attemptsTo(
                openSiteDannRegional()
        );
    }

    @Cuando("^el usuario se autentifica con sus credenciales$")
    public void elUsuarioSeAutentificaConSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(ingresarUsuario());
    }

    @Dado("^que el usuario se encuentra logueado en el aplicativo Banca Digital$")
    public void que_el_usuario_se_encuentra_logueado_en_el_aplicativo_Banca_Digital() {
        theActorInTheSpotlight().attemptsTo(
                openSiteDannRegional(),
                ingresarUsuario()
        );
    }
    @Entonces("^el usuario deberia poder ver su nombre en el header y la informacion del dashboard$")
    public void el_usuario_deberia_poder_ver_su_nombre_en_el_header_y_la_informacion_del_dashboard() {
        theActorInTheSpotlight().should(seeThat(validarUsuario()),seeThat(validarTituloProductos()));
        theActorInTheSpotlight().should(seeThat(validarTituloProductos()));
        theActorInTheSpotlight().should(seeThat(validaTituloUltimasOperaciones()));
        theActorInTheSpotlight().should(seeThat(validaTituloResumenDelSaldo()));
        theActorInTheSpotlight().should(seeThat(validaTituloResumenPorProducto()));
        theActorInTheSpotlight().should(seeThat(validarTituloSaldoTotal()));
    }
}