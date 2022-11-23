package models;
public class Contador {

    private int contador;

    public Contador(){}

    public Contador(int contador){
        this.contador = contador>0? contador : 0;
    }

    public Contador(final Contador cont){
        this.contador=cont.contador;
    }

    public void incrementarContador(){
        contador++;
    }
    public void decrementarContador(){
        contador--;
        contador = contador<0?0:contador; 
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
