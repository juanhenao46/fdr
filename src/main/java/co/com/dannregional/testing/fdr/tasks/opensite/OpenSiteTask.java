package co.com.dannregional.testing.fdr.tasks.opensite;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.dannregional.testing.fdr.userinterfaces.autentificacion.logueo.FdrLogin;
import co.com.dannregional.testing.fdr.utilities.properties.PropertiesProject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.io.IOException;

public class OpenSiteTask implements Task {

    FdrLogin usuario = new FdrLogin();

    public static OpenSiteTask openSiteDannRegional()
    {
        return (OpenSiteTask) instrumented(OpenSiteTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String strUrl = "";
        try {
            strUrl = PropertiesProject.getUrlDannRegional();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!strUrl.isEmpty() && !strUrl.equals("")) {
            //Metodo Open Absoluto
            usuario.openUrl(strUrl);
        }
    }
}
