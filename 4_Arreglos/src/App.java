import database.Database;
import models.Mascota;
import models.Utils;

public class App {
    public static void main(String[] args){

        // int intArray[];
        // byte byteArray[];
        // short shortArray[];
        // long longArray[];
        // float floatArray[];
        // double doubleArray[];
        // char charArray[];
        // String stringArray[];
        
        // intArray = new int[10];
        // byteArray = new byte[8];
        // shortArray = new short[2];
        // longArray = new long[5];
        // floatArray = new float[20];
        // doubleArray = new double[5];
        // charArray = new char[7];
        // stringArray = new String[5];

        // int matrizLiteral[] = new int[]{1,2,3,4,5,6,7,8,9};
        // char matrizLiteral2[] = {'h','o','l','a'};

        // int matriz2d[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // int matriz3d[][][] = {{{1},{2},{3}},{{4},{5},{6}},{{7},{8},{9}}};
        // int matrizIrregular[][] = {
        //     {1},
        //     {2,3},
        //     {4,5,6},
        // };
        // int arregloNum[] = {45,6,8,489,7,5,7,12};
        // int suma = sumaArreglo(arregloNum);
        // System.out.println("suma =  " + suma); // 579

        Mascota[] mascotas = Utils.crearMascotas(Database.bd());
        Utils.imprimeMascota(mascotas);

        // int[] arregloLleno = matrizAB(0, 10);
        // int[] arregloClone = arregloLleno.clone();
        // System.out.println(arregloClone == arregloLleno);
        
        // int matriz2[][] = {{1,2,3},{4,5,6}};
        // int[][] matrizClone = matriz2.clone();
        // System.out.println(matriz2 == matrizClone); //false
        // System.out.println(matriz2[0] == matrizClone[0]); //true
    } 
}
