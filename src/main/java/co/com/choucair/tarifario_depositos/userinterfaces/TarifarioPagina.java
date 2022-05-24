package co.com.choucair.tarifario_depositos.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TarifarioPagina extends PageObject {


    public static final Target TARIFARIO = Target.the("").located(By.xpath("//*[@id=\"footer-content\"]/div[2]/div/div/div[2]/div/ul/li[5]/a"));

    public static final Target PDF = Target.the("").located(By.xpath("//*[@id=\"layoutContainers\"]/div/div[1]/section/div[2]/div[2]/div/div/table/tbody/tr[3]/td[2]/span/a/img"));

}
