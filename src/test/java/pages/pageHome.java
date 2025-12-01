package pages;

public class pageHome extends basePage {

    // Localizadores

    private String paginaIngresar = "https://demoqa.com/";
    private String opcionElements = "//h5[normalize-space()='Elements']";
    private String mensajeElements = "//div[@class='col-12 mt-4 col-md-6']";
    private String mensaje = "Please select an item from left to start practice.";

    public pageHome() {
        super();
    }

    // Metodo para ingresar a la pagina
    public void ingresarPagina() {
        navegacionA(paginaIngresar);
    }

    // Metodo para dar clic en la opción
    public void darClicOpción() {
        clickElemento(opcionElements);
    }

    // Metodo para verificar ingreso correcto muestre mensaje esperado
    public void mensajeAlIngresar() {
        verificarMensaje(mensajeElements, mensaje);
    }
}
