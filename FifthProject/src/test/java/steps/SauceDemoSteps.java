package steps;
 
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;
 
public class SauceDemoSteps {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
 
    @Given("Entrar pagina principal")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

    @When("verificar que hay un texto llamado Estilo de vida")
    public void validateMessage(){
        Assert.assertEquals(landingPage.getMessage(), "Estilo de vida");
        
    }
}