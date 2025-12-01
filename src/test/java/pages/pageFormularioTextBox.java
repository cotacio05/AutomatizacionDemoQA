package pages;

public class pageFormularioTextBox extends basePage {

    // Localizadores
    private String nombreCompleto = "//input[@id='userName']";
    private String correo = "//input[@id='userEmail']";
    private String direccion = "//textarea[@id='currentAddress']";
    private String permanenteDireccion = "//textarea[@id='permanentAddress']";
    private String btnSubmit = "//button[@id='submit']";
    private String mensajeTextBox = "//div[@class='border col-md-12 col-sm-12']";

    public pageFormularioTextBox() {
        super();
    }

    // Metodo para ingresar el Nombre Completo.
    public void ingresarNombre(String nombre) {
        escribir(nombreCompleto, nombre);
    }

    // Metodo para ingresar el correo
    public void ingresarCorreo(String email) {
        escribir(correo, email);
    }

    // Metodo para ingresar direccion
    public void ingresarDireccion(String address) {
        escribir(direccion, address);
    }

    // Metodo para ingresar la direccion permanente
    public void ingresarDireccionPermanente(String pdireccion) {
        escribir(permanenteDireccion, pdireccion);
    }

    // Metodo para dar clic en el botón Submit
    public void darClicBotonSubmit() {
        clickElementoConBloqueo(btnSubmit);
    }

    // Metodo para verificar que muestre mensaje información registrada.
    public void verificarMensaje() {
        mensaje(mensajeTextBox);
    }

}
