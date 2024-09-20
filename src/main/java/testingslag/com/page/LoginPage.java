package testingslag.com.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/v1/")
public class LoginPage extends PageObject {

  @FindBy(id = "user-name")
  private WebElement inputUsuario;

  @FindBy(id = "password")
  private WebElement inputContraseña;

  @FindBy(id = "login-button")
  private WebElement botonLogin;

  public void ingresarUsuario(String usuario) {
    inputUsuario.clear(); // Limpiar el campo antes de ingresar texto (opcional)
    inputUsuario.sendKeys(usuario); // Usar sendKeys() en lugar de type()
  }

  public void ingresarContraseña(String contraseña) {
    inputContraseña.clear(); // Limpiar el campo antes de ingresar texto (opcional)
    inputContraseña.sendKeys(contraseña); // Usar sendKeys() en lugar de type()
  }

  public void clickBotonLogin() {
    botonLogin.click(); // Este método debería funcionar sin problemas
  }
}
