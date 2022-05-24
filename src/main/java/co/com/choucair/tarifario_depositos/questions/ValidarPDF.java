package co.com.choucair.tarifario_depositos.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.core.Serenity.getDriver;

public class ValidarPDF implements Question<Boolean> {

    private String titulo;

    public ValidarPDF(String titulo) {
        this.titulo = titulo;
    }

    public static ValidarPDF laPagina(String titulo){
        return new ValidarPDF(titulo);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;

        String titulopdf = getDriver().getCurrentUrl();
        if (titulopdf.contains(titulo)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
