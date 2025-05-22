package steps;
 
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PaginaInventory;
import pages.PaginaPrincipal;
 
public class SauceDemoSteps {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaInventory inventoryPage = new PaginaInventory();
 
    @Given("Navego a la página de inicio de sesión de Saucedemo")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }
    
    @When("Ingreso el nombre de usuario {word}") // Ingreso el nombre de usuario standard_user
    public void iWriteUsername(String username) {
        landingPage.writeOnUsername(username);
    }
 
    @And("Ingreso la contraseña {word}")
    public void iWritePassword(String password) {
        landingPage.writeOnPassword(password);
    }

    @And("Hago clic en el botón de Login")
    public void iClickOnLoginButton() {
        landingPage.clickOnLoginButton();
    }
    
    @Then("Verificar que los elementos en el dropdown existan")
    public void verificarDropdown(){
        List<String> lista = inventoryPage.getdropDownValue();
        List<String> listaEsperada = Arrays.asList("Name (A to Z)",
                "Name (Z to A)", "Price (low to high)", "Price (high to low)");

        Assert.assertEquals(listaEsperada, lista);
    
    }    

}