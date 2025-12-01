package pages;

public class pageElements extends basePage {


    //Localizador
    private String  opcion = "//span[normalize-space()='Text Box']";

    public pageElements(){
        super();
    }

    public void clicOpcion(){
        clickElemento(opcion);
    }


    
}
