public class Logicos {
    
    public static void main(String[] args) {
        ejemplos();
        tablasDeVerdad();
        cortocircuitoAND();
        cortocircuitoOR();
    }

    public static void ejemplos(){
        final int X = 6, Y = 7;
        final boolean A = true, B = false;
        System.out.println("A && X == Y -> " + (A && (X == Y)) );
        System.out.println("A && X != Y -> " + (A && (X != Y)) );
        System.out.println("A == B || X != Y-> " + ((A == B) || (X != Y)));
        System.out.println("X > Y || A != B -> " + ((X > Y) || (A != B)));
        System.out.println("!(X < Y) -> " + !(X < Y));
        System.out.println("!(X >= Y) -> " + !(X >= Y));
    }
    public static void tablasDeVerdad(){
        System.out.println("****** Tabla de verdad AND ******");
        System.out.println("P    Q ->  P&&Q ");
        System.out.println("V    V     "+(true&&true));
        System.out.println("V    F     "+(true&&false));
        System.out.println("F    V     "+(false&&true));
        System.out.println("F    F     "+(false&&false));
        
        System.out.println("****** Tabla de verdad OR ******");
        System.out.println("P    Q ->  P||Q ");
        System.out.println("V    V     "+(true||true));
        System.out.println("V    F     "+(true||false));
        System.out.println("F    V     "+(false||true));
        System.out.println("F    F     "+(false||false));

        System.out.println("****** Tabla de verdad NOT ******");
        System.out.println("P  ->  !P ");
        System.out.println("V      "+!(true));
        System.out.println("F      "+!(false));
    }

    public static void cortocircuitoAND(){
        int a = 10, b = 20, c = 15;
        if((a>c) && (++b > c) ){
            System.out.println(" dentro del if &&");
        }
        System.out.println("b = " + b);
    }

    public static void cortocircuitoOR(){
        int a = 10, b = 20, c = 15;
        if((b<c) || (++c > a) ){
            System.out.println(" dentro del if ||");
        }
        System.out.println("c = " + c);
    }
}
