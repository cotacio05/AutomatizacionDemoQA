package steps;

import io.cucumber.java.en.*;
import pages.pageElements;
import pages.pageFormularioTextBox;
import pages.pageHome;

public class pasos {

    pageHome home = new pageHome();
    pageElements elements = new pageElements();
    pageFormularioTextBox textBox = new pageFormularioTextBox();

    @Given("Que el usuario esta en la pagina princial")
    public void yoIngresoAlSistema() {
        home.ingresarPagina();
    }

    @When("El usuario da clic en la opción de Elements")
    public void yoDoyClicOpcion() {
        home.darClicOpción();
    }

    @And("El sistema muestra el mensaje correcto")
    public void verificarMensajeIngreso() {
        home.mensajeAlIngresar();
    }

    @Then("Ingrasa al formulario de TextBox")
    public void yoDoyClicOpcionTextBox() {
        elements.clicOpcion();
    }

    @And("El usuario ingresa el nombre completo {string}")
    public void yoRegistroNombreCompleto(String nombreCompleto) {
        textBox.ingresarNombre(nombreCompleto);
    }

    @And("El usuario Ingresa el Correo {string}")
    public void yoRegistroCorreo(String correo) {
        textBox.ingresarCorreo(correo);
    }

    @And("El usuario ingresa la direccion {string}")
    public void yoRegistroDireccion(String direccion) {
        textBox.ingresarDireccion(direccion);
    }

    @And("El usuario ingresa Permanent direccion {string}")
    public void yoRegistroDireccionPermanente(String pDireccion) {
        textBox.ingresarDireccionPermanente(pDireccion);
    }

    @And("El usuario da clic en boton submit")
    public void yoDoyClicBtnSubmit() {
        textBox.darClicBotonSubmit();
    }

    @Then("El sistema muestra la información registrada correctamente.")
    public void yoVerificoinfroamcionRegistrada() {
        textBox.verificarMensaje();
    }

}
