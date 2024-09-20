package testingslag.com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features =
        "src/test/resources/feature/agregar_producto_carrito.feature", // definicion de los features
                                                                       // en los
    // runners
    // NOTA: ASEGURATE DE QUE ESTE VIEN INDICADA LA RUTA
    glue =
        "testingslag.com.stepdefinitions", // indicacion de los stepdefinitions o el codigo que esta
    // relacionado con el feature

    snippets = SnippetType.CAMELCASE)
public class AgregarProducto_carrito {}
