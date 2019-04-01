package entornos;

public class CopiasLibros extends Copias {

    /* ---- Atributos ---- */
    private Libros libro = null;
    private String editorial = null;
    private Miembros miembro = null;
    private Personal empleado = null;


    /* ---- Constructor ---- */
    public CopiasLibros() {

    }

    public CopiasLibros(Libros libro) {
        this.libro = libro;
    }

    public CopiasLibros(Biblioteca bibliotecaPropietaria, Libros libro) {
        super(bibliotecaPropietaria);
        this.libro = libro;
    }

    // Lógica


}
