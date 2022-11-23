import java.util.Stack;
public class Pila {
    
    public static void metodoPush(){
        Stack pila = new Stack();
        Stack<String> sPila = new Stack<String>();
        
        pila.push(4);
        pila.push("Hola");
        pila.push("Mundo");

        sPila.push("Hola");
        sPila.push("Mundo");
        sPila.push("Desde");
        sPila.push("Java");

        System.out.println(pila);
        System.out.println(sPila);
    }

    public static void metodoPeek(){
        Stack<Integer> pila = new Stack<Integer>();
        for(int i = 0;i<10;i++){
            pila.push(i);
        }

        System.out.println("Pila: "+pila);
        System.out.println("El ultimo elemento es : "+ pila.peek());
        System.out.println("Pila Final: "+ pila);
    }

    public static void metodoPop(){
        Stack<Integer> pila = new Stack<Integer>();
        for(int i = 0;i<10;i++){
            pila.push(i);
        }

        System.out.println("Pila: "+pila);
        System.out.println("El ultimo elemento es : "+ pila.pop());
        System.out.println("Pila: "+pila);
        System.out.println("El ultimo elemento es : "+ pila.pop());
        System.out.println("Pila Final: "+ pila);
    }

    public static void metodoSearch(){
        Stack<String> animales= new Stack<String>();
        // agregar elementos a la pila
        animales.push("Perro");
        animales.push("Caballo");
        animales.push("Gato");
        animales.push("Conejo");
        System.out.println("Pila: " + animales);
        // Busca en la pila al elemento
        int posicion = animales.search("Caballo");
        System.out.println("Posición del Caballo: " + posicion);
    }

    public static void metodoEmpty(){
        Stack<String> animales= new Stack<String>();
        // agregar elementos a la pila
        animales.push("Perro");
        animales.push("Caballo");
        animales.push("Gato");
        animales.push("Conejo");
        System.out.println("Pila: " + animales);
        // Revisa si la pila está vacía
        boolean resultado = animales.empty();
        System.out.println("¿La pila está vacía? " + resultado);
    }
}
