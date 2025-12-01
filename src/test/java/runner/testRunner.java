package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", // Directorio de nuestros archivos .feature
        glue = { "steps", "hooks" }, // Paquete donde tenemos nuestros clases definido los steps escritos en el
                                     // feature y la case que levanta el dwebdrive de Chrome y lo cierra
        plugin = { "pretty",
                "html:target/cucumber-reports"

        }, monochrome = true)

public class testRunner {

}
