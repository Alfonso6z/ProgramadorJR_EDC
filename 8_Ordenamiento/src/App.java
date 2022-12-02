import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // int [] array ={7,3,1,2,4,6};
        int [] array ={4,3,5,1,8,2,7,6};
        System.out.println("Arrays.toString(array) =  " + Arrays.toString(array));
        // Ordenamiento.insercion(array);
        Ordenamiento.quicksort(array, 0, array.length-1);
        System.out.println("Arrays.toString(array) =  " + Arrays.toString(array));

    }
}
