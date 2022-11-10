package models;
public class Utils {

    public static void imprimirArreglo(int arreglo[]){
        for(int elemento: arreglo){
            System.out.println("stringArray - "+ elemento);
        }
    }

    public static void imprimirArreglo2D(int arreglo[][]){
        for(int fila = 0;fila<arreglo.length;fila++){
            for(int columna = 0;columna<arreglo.length;columna++){
                System.out.println(arreglo[fila][columna]);
            }
        }
    }

    public static void imprimirArregloIrregular(int arreglo[][]){
        for(int fila = 0;fila<arreglo.length;fila++){
            for(int columna = 0;columna<arreglo[fila].length;columna++){
                System.out.println(arreglo[fila][columna]);
            }
        }
    }

    public static int sumaArreglo(int[] arreglo){
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma+=arreglo[i];
        }
        return suma;
    }

    public static int[] matrizAB(int inicio, int fin){
        int tamaño = fin - inicio + 1;
        int arreglo[] = new int[tamaño];
        for(int i = 0;i<arreglo.length;i++){
            arreglo[i] = inicio+i;
        }
        return arreglo;
    }

    public static Mascota[] crearMascotas(String[][] mascotasDB){
        Mascota[] mascotas = new Mascota[mascotasDB.length];
        
        for(int i = 0;i<mascotas.length;i++){
            mascotas[i] = new Mascota(mascotasDB[i][0], mascotasDB[i][1], mascotasDB[i][2]);
        }
        return mascotas;
    }

    public static void imprimeMascota(Mascota[] mascota){
        for (Mascota m : mascota) {
            System.out.println("==============");
            System.out.println(m.toString());
        }
    }
}
