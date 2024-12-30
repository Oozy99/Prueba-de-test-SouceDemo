package testingslag.com.steps;

import org.fluentlenium.core.annotation.Page;
import testingslag.com.page.ProductosPage;

public class ProductoSteps {
  @Page ProductosPage productoPage;

  public void verProductosEnCarrito() {
    productoPage.agregarProductoCarrito();
    productoPage.abrirCarrito();
  }
}
