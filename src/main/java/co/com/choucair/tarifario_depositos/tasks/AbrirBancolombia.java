package co.com.choucair.tarifario_depositos.tasks;

import co.com.choucair.tarifario_depositos.interactions.CambioPDF;
import co.com.choucair.tarifario_depositos.userinterfaces.AbrirPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirBancolombia implements Task {
    private AbrirPagina abrirPagina;

    public static AbrirBancolombia laPagina(){
        return Tasks.instrumented(AbrirBancolombia.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirPagina));


    }
}
