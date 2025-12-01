package hooks;

import driver.DriverFactory;
import io.cucumber.java.*;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.getDriver();
    }

    @After
    public void finalizarEjecucion() {
        DriverFactory.quitDriver();
    }

}
