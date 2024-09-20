package testingslag.com.stepdefinitions;

import cucumber.api.java.ast.Cuando;
import cucumber.api.java.ast.Dada;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import testingslag.com.steps.LoginStep;

public class AgregarProductoStepdefinitions {

  @Managed WebDriver driver;

  @Steps LoginStep loginStep;

  @Dada("^que estoy en SouceDemo$")
  public void queEstoyEnSouceDemo() {
    loginStep.abrirNavegador();
    loginStep.realizarAutenticacion("standard_user", "secret_sauce");
  }

  @Cuando("^slecciono un producto$")
  public void sleccionoUnProducto() {}

  @Entonces("^verifico que se agrege a mi carrito de compras$")
  public void verificoQueSeAgregeAMiCarritoDeCompras() {}
}
