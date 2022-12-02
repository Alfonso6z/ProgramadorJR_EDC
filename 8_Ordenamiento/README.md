### Completa el siguiente código de tal forma que el resultado obtenido sea el que se muestra en la imagen:
```
Arreglo inicial: 
 11 23 9 20

i = 0
 Arreglo comparando:
 11 23 9 20 <----- j = 0 -- 11 > 23?
 Arreglo comparando:
 11 23 9 20 <----- j = 1 -- 23 > 9?
 ------- Intercambia 23 con 9
 Arreglo modificado:
 11 9 23 20

 Arreglo comparando:
 11 9 23 20 <----- j = 2 -- 23 > 20?
 ------- Intercambia 23 con 20
 Arreglo modificado:
 11 9 20 23

i = 1
 Arreglo comparando:
 11 9 20 23 <----- j = 0 -- 11 > 9?
 ------- Intercambia 11 con 9
 Arreglo modificado:
 9 11 20 23

 Arreglo comparando:
 9 11 20 23 <----- j = 2 -- 20 > 23?


Arreglo final:
 9 11 20 23
```
```java
public class MetodoOrdenamiento {

    public void imprimeArreglo(String mensaje, int[] arreglo) {
        /** 
         *TODO: Implementar Código
         */
    }

    public void saltoLinea() {
        System.out.println("\n");
    }

    public static void main(String args[]) {
        /** 
         *TODO: Implementar Código
         */
        MetodoOrdenamiento objOrdena = new MetodoOrdenamiento();
        objOrdena.imprimeArreglo("Arreglo inicial: ", arreglo);
        objOrdena.saltoLinea();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < arreglo.length - 1; j++) {
                objOrdena.imprimeArreglo(" Arreglo comparando: ", arreglo);
                System.out.println(" <----- j = " + j + " -- " + arreglo[j] + " > " + arreglo[j + 1] + "?");
                if (arreglo[j] > arreglo[j + 1]) {
                    System.out.println(" ------- Intercambia " + arreglo[j] + " con " + arreglo[j + 1]);
                    /** 
                    * TODO:Implementar Código
                    */
                    objOrdena.imprimeArreglo(" Arreglo modificado: ", arreglo);
                    objOrdena.saltoLinea();
                }
            }
        }
        objOrdena.saltoLinea();
        objOrdena.imprimeArreglo("Arreglo final: ", arreglo);
    }
}
```
