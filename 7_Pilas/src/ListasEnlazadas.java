import java.util.LinkedList;

public class ListasEnlazadas {
    
    public static void metodoAdd(){
        // crear una lista enlazada
        LinkedList<String> cadenas = new LinkedList<String>();
        cadenas.add("Perro");
        cadenas.add("Gato");
        cadenas.add("Conejo");
        System.out.println(cadenas);
        cadenas.add(2, "Aguila");;
        System.out.println(cadenas);
        cadenas.addFirst("Antílope");
        cadenas.addLast("Zorro");
        System.out.println(cadenas);
    }

    public static void metodoGet(){
        LinkedList<String> cadenas = new LinkedList<String>();
        cadenas.add("Perro");
        cadenas.add("Gato");
        cadenas.add("Conejo");

        System.out.println(cadenas.get(1));
        System.out.println(cadenas);
        

    }
}
