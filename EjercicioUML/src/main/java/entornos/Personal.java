package entornos;

public class Personal extends Persona{

    //Atributos

    private String codeEmpleado = null;
    private Biblioteca biblioteca = null;

    //constructor

    public Personal(String codeEmpleado, Biblioteca biblioteca) {
        this.codeEmpleado = codeEmpleado;
        this.biblioteca = biblioteca;
    }

    //Setters

    public void setCodeEmpleado(String codeEmpleado) {
        this.codeEmpleado = codeEmpleado;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    //Getters

    public String getCodeEmpleado() {
        return codeEmpleado;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
}

