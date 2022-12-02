public class Recursividad {

    public static int fac(int n){
        if(n == 0){
            return 1;
        }
        return n * fac(n-1);
    }

    public static int fib(int n){
        if(n==0 || n == 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void torresDeHanoi(int n, char deVarilla,
                             char aVarrilla, char auxVarrilla){
        if (n == 0) {
            return;
        }
        torresDeHanoi(n - 1, deVarilla, auxVarrilla, aVarrilla);
        System.out.println("Mover el disco " + n + " de  "
        + deVarilla + " a "
        + aVarrilla);
        torresDeHanoi(n - 1, auxVarrilla, aVarrilla, deVarilla);
    }
}
