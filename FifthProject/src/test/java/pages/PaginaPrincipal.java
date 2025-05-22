package pages;

public class PaginaPrincipal extends BasePage {

    //private String elementUsername = "//input[@id='user-name']";
    //private String elementPassword = "//input[@id='password']";
    //private String elementClickBoton = "//input[@id='login-button']";
    private String elementoMessage = "//span[normalize-space()='Estilo de vida']";
 
    public PaginaPrincipal() {
        super(driver);
    }
 
    // Método para navegar a www.elespectador.com/
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.elespectador.com/");
 
    }
 
    // public void clickOnSectionNavigationBar(String section) {
    //     // Reemplaza el marcador de posición en sectionLink con el nombre
    //     String xpathSection = String.format(sectionLink, section);
    //     clickElement(xpathSection);
    // }

    public String getMessage(){
        return getText(elementoMessage);
        
    }
    
}
