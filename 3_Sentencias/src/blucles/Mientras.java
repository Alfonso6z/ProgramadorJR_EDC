package blucles;

import java.util.Scanner;

public class Mientras {
    public static void main(String[] args) {
        // métodos
        
    }

    public static void imprimeN(int n){
        int cont = 0;
        while(cont<n){
            System.out.println("Hola Mundo");
            cont++;
        }
    }
    
    public static void sumaN(int n){
        int suma = 0,x=1;
        while(x<=n){
            suma+=x;
            x++;
        }
        System.out.println("suma =  " + suma);
    }

    public static void pregunta(){
        String opt;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Ingresa si para continuar, no para salir");
            opt = sc.nextLine();
            if(opt.equals("no"))
                break;
            System.out.println("continuar..");
        }
        sc.close();// ya no aparece el warning
    }
}
