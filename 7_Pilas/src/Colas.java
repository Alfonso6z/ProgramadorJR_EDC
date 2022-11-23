import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Colas {
    static Scanner sc = new Scanner(System.in);

    public static void metodoAdd(){
        Queue<Integer> cola = new LinkedList<Integer>();
        for(int i = 1;i<=10;i++){
            cola.add(i);
        }
        // * Si el proceso es exitoso devuelve true
        // ! sino devuelve una exepción
        System.out.println(cola.add(5));
        System.out.println(cola);
    }

    public static void metodoOffer(){
        Queue<Integer> cola = new LinkedList<Integer>();
        for(int i = 1;i<=10;i++){
            // inserta el elemento en la cola
            cola.offer(i);
        }
        // * Si el proceso es exitose devuelve true
        // ! sino devuelve false 
        System.out.println(cola.offer(5));
        System.out.println(cola);
    }

    public static void metodoElement(){
        Queue<Integer> cola = new LinkedList<Integer>();
        for(int i = 1;i<=10;i++){
            cola.add(i);
        }
        // * devuelve la parte delantera de la cola.
        // ! Lanza una exeptción si la cola está vacia.
        System.out.println(cola.element());
        System.out.println(cola.element());
        System.out.println(cola);
    }

    public static void metodoPeek(){
        Queue<Integer> cola = new LinkedList<Integer>();
        for(int i = 1;i<=10;i++){
            cola.add(i);
        }

        // * devuelve la parte delantera de la cola
        // ! devuelve null si la cola esta vacia
        System.out.println(cola.peek());
        System.out.println(cola);
    }

    public static void metodoRemove(){
        Queue<Integer> cola = new LinkedList<Integer>();
        for(int i = 1;i<=10;i++){
            cola.add(i);
        }

        // * devuelve y elimina la parte delantera de la cola.
        // ! lanca una excepción si la cola esta vacia.
        System.out.println(cola.remove());
        System.out.println(cola);
    }

    public static void metodoPoll(){
        Queue<Integer> cola = new LinkedList<Integer>();
        for(int i = 1;i<=10;i++){
            cola.add(i);
        }

        // * devuelve y elimina la parte delantera de la cola.
        // ! devuelve null si la cola esta vacia.
        System.out.println(cola.poll());
        System.out.println(cola);
    }
}
