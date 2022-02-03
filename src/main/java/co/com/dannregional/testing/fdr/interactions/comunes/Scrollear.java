package co.com.dannregional.testing.fdr.interactions.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Scrollear implements Interaction {

    public static Target ELEMENTO;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(ELEMENTO))
        ;
    }
    public static Scrollear scrollearHasta(Target element) {
        ELEMENTO = element;
        return instrumented(Scrollear.class);
    }
}
