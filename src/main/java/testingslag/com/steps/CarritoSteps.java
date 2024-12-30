package testingslag.com.steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import testingslag.com.page.CarritoPage;

public class CarritoSteps {
  @Page CarritoPage carritoPage;

  @Step
  public void validarProductoCarrito() {
    carritoPage.verificarProductoCarrito();
  }
}
