package impresora;

public class Informe extends Hoja {
    
    private String autor;
    private String revisor;

    public Informe(String autor,String revisor,String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        // TODO Auto-generated method stub
        return "Informe escrito por: " + autor +
                "\n Revisado por: " + revisor + 
                "\n" + this.contenido;
    }
    
}
