package pages;

import java.util.List;

public class PaginaInventory extends BasePage {

    private String elementText = "//div[@class='product_label']";
    private String elementDrop = "//select[@class='product_sort_container']";

    public PaginaInventory() {
        super(driver);
    }

    public String getElementText() {
        return getText(elementText);
    }

    public List<String> getdropDownValue(){
        return getDropdownValues(elementDrop);
    }

}