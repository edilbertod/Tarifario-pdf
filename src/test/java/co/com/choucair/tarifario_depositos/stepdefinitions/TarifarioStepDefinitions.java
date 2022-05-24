package co.com.choucair.tarifario_depositos.stepdefinitions;

import co.com.choucair.tarifario_depositos.questions.ValidarPDF;
import co.com.choucair.tarifario_depositos.tasks.AbrirBancolombia;
import co.com.choucair.tarifario_depositos.tasks.AbrirTarifario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class TarifarioStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que entro a la seccion de tarifario")
    public void queEntroALaSeccionDeTarifario() {
        OnStage.theActorCalled("Edi").wasAbleTo(AbrirBancolombia.laPagina());
    }

    @Cuando("consulto el pdf")
    public void consultoElPdf() {
        OnStage.theActorInTheSpotlight().attemptsTo(AbrirTarifario.laPagina());
    }

    @Entonces("verifico que sea el correcto")
    public void verificoQueSeaElCorrecto(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        List<List<String>> rowsWithoutHead = rows.subList(1, rows.size());
        for (List<String> pdf : rowsWithoutHead) {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPDF.laPagina(pdf.get(0))));
        }
    }
}
