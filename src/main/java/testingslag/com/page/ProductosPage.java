package testingslag.com.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductosPage extends PageObject {
  @FindBy(xpath = "//div[@class='pricebar']//button[@class='btn_primary btn_inventory']\n")
  WebElement botonAgregarCarrito;

  @FindBy(id = "shopping_cart_container")
  WebElement botonCarritoCompra;

  public void agregarProductoCarrito() {
    botonAgregarCarrito.click();
  }

  public void abrirCarrito() {
    botonCarritoCompra.click();
  }
}
