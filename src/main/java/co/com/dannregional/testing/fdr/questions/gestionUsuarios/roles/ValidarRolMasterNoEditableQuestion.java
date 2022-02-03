package co.com.dannregional.testing.fdr.questions.gestionUsuarios.roles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.dannregional.testing.fdr.interactions.comunes.Esperar.esperarEnSegundos;
import static co.com.dannregional.testing.fdr.userinterfaces.gestionUsuarios.roles.EditarRol.BOTON_EDITAR;

public class ValidarRolMasterNoEditableQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        esperarEnSegundos(1000);
        System.out.println(BOTON_EDITAR.size());
        if (BOTON_EDITAR.size()==0){
            return true;
        }else {
            return false;
        }

    }
    public static ValidarRolMasterNoEditableQuestion validarRolMasterNoEditable() {
        return new ValidarRolMasterNoEditableQuestion();
    }
}
