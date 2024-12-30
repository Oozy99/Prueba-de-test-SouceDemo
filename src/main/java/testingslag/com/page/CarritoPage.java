package testingslag.com.page;

import static org.hamcrest.MatcherAssert.assertThat;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarritoPage extends PageObject {
  @FindBy(xpath = "//a[@id='item_4_title_link']")
  WebElement tituloProducto;

  public void verificarProductoCarrito() {
    assertThat(
        "El producto no responde al agregado",
        "Sauce Labs Backpack".equals(tituloProducto.getText()));
  }
}
