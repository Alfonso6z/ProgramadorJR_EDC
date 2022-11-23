package models;
public class Libro {
    
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    public Libro(){}

    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public boolean prestamo(){
        if(prestados<ejemplares)
            prestados++;
        return prestados<ejemplares;
    }

    public boolean devolucion(){
        if(this.prestados==0)
            return false;
        prestados--;
        return true;
    }
    
    @Override
    public String toString() {
        return "titulo: " + this.titulo+
                "\nautor: " + this.autor+
                "\nejemplares: " + this.ejemplares+
                "\nprestados: " + this.prestados;

    }
}
