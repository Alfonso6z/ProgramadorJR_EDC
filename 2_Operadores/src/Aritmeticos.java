public class Aritmeticos {
    
    public static void main(String[] args) throws Exception {
        int a, b;
        int suma, resta, mul, div;

        a = 15;
        b = 3;
        suma = a + b;
        resta = a - b;
        mul = a * b;
        div = a / b;
        System.out.println("suma =  " + suma);
        System.out.println("resta =  " + resta);
        System.out.println("mul =  " + mul);
        System.out.println("div =  " + div);

        // la división con tipos de datos int toma la parte entera
        int c = 15, d = 4;
        int divEntera = c/d;
        System.out.println("divEntera =  " + divEntera);

        boolean variable;
        boolean expresion1,expresion2,expresion3;
        expresion1 = true;
        expresion2 = false;
        expresion3 = false;

        variable = expresion1 ? expresion2 : expresion3;

        System.out.println("variable =  " + variable);
    }
}
