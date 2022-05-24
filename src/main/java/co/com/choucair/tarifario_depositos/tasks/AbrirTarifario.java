package co.com.choucair.tarifario_depositos.tasks;

import co.com.choucair.tarifario_depositos.interactions.CambioPDF;
import co.com.choucair.tarifario_depositos.userinterfaces.TarifarioPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class AbrirTarifario implements Task {
    private TarifarioPagina tarifarioPagina;

    public static AbrirTarifario laPagina(){
        return Tasks.instrumented(AbrirTarifario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TarifarioPagina.TARIFARIO),
                Click.on(TarifarioPagina.PDF)

        );
        actor.attemptsTo(CambioPDF.the());

    }
}
