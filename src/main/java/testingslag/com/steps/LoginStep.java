package testingslag.com.steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import testingslag.com.page.LoginPage;

public class LoginStep {
  @Page private LoginPage loginPage;

  @Step
  public void abrirNavegador() {
    loginPage.open();
  }

  @Step
  public void realizarAutenticacion(String usuario, String contraseña) {
    loginPage.ingresarUsuario(usuario);
    loginPage.ingresarContraseña(contraseña);
    loginPage.clickBotonLogin();
  }
}
