package co.com.choucair.tarifario_depositos.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;

public class CambioPDF implements Interaction {

    public static CambioPDF the(){return new CambioPDF();}

    @Override
    public <T extends Actor> void performAs(T actor) {
        int venti=2;
        int vent = 0;
        Set<String> ventanas = getDriver().getWindowHandles();
        for(String ventana2 : ventanas) {
            vent = vent + 1;
            if(vent == venti) {
                getDriver().switchTo().window(ventana2);
                break;
            }
        }
    }
}
