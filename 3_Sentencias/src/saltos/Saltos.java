package saltos;
public class Saltos {
    public static void main(String[] args) {

    }

    public static void rompe(){
        int cont = 1;
        for(int i = 0;i<10;i++){
            if(cont==32){
                // solo se ejecuta cuando dentro del if
                System.out.println("\nUtiliza break");
                System.out.println("cont =  " + cont);
                System.out.println("i =  " + i);
                break; // rompe el ciclo for
            }
            System.out.print(". ");
            cont*=2;
        }
        System.out.println("Termine ...");
    }

    public static void continuar(){
        for (int i = 0; i < 10; i++) {
            // Si el número es par
            if (i % 2 == 0)
                // saltar y continuar
                continue;
            // Si el número es impar, imprímelo
            System.out.print(i + " ");
        }
    }

    public static String regresa(boolean a){
        if ( a){
            return "Es verdadero";
        }
        return "Es falso";
    }
}
