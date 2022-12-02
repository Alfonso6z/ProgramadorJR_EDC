
public class Ordenamiento {

    public static void burbuja(int[] array){
        int n = array.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux; 
                }
            }
        }
    }

    public static void insercion(int[] array){
        int aux,key,ant;
        for (int i = 1;i<array.length;i++){
            key = i;
            ant = i-1;
            while(ant>=0 && array[key]<array[ant]){
                aux = array[key];
                array[key] = array[ant];
                array[ant] = aux;
                key = ant;
                ant--;
            }
        }
    }

    public static void quicksort(int[] array,int izq, int der){
        // retorna donde se realiza la partición
        int particion = particion(array,izq,der);
        // si el elemento más a la izq existe en la particón ordena
        if(izq<particion-1){
            quicksort(array, izq, particion -1);
        }
        // si el elemento más a la der existe en la prtición ordena
        if(particion+1<der){
            quicksort(array, particion+1, der);
        }
    }
    
    private static int particion(int[] array, int izq,int der){
        int pivote = array[izq];
        int i = izq;
        int d = der;
        int aux;

        while(i<d){
            // buscar el mayor de izq a der
            while(array[i] <= pivote && i<d){
                i++;
            }
            // buscar el menor de der a izq
            while(array[d]>pivote){
                d--;
            }
            // si no se cruzan, intercambia
            if(i<d){
                aux = array[i];
                array[i] = array[d];
                array[d] = aux;
            }
        }
        array[izq] = array[d];
        array[d] = pivote;
        return d;
    }
}
