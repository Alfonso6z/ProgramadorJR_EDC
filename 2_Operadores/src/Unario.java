public class Unario {
    public static void main(String[] args) {

        System.out.println("****** unario menos ******");
        int numero = 66;
        System.out.println("numero =  " + numero);
        // unario menos
        numero = - numero;
        System.out.println("- numero =  " + numero);



        System.out.println("****** operador NO \"!\" ******");
        boolean cond = true;
        int a = 6, b =9;
        System.out.println("cond =  " + cond);
        System.out.println("a =  " + a);
        System.out.println("b =  " + b);
        
        // aplicamos el operador NO
        System.out.println("!cond =  " + cond);
        System.out.println("!(a>b) =  " + !(a>b));
        System.out.println("!(b>a) =  " + !(b>a));
        
        
        System.out.println("****** Incremento(++) y Decremento(--) ******");
        System.out.println("a =  " + a);
        System.out.println("b =  " + b);
        /* posincremento 
        Cuando se coloca después del nombre de la variable, el valor del operando
        se incrementa pero el valor anterior se retiene temporalmente hasta la 
        ejecución de esta instrucción y se actualiza antes de la ejecución de la 
        siguiente instrucción.
        */ 
        a++;
        b--;
        System.out.println("a++ =  " + a);
        System.out.println("b-- =  " + b);
        /* preincremento 
        Cuando se coloca antes del nombre de la variable, el valor del operando 
        se incrementa instantáneamente.
        */
        ++a;
        --b;
        System.out.println("++a =  " + a);
        System.out.println("--b =  " + b);

        System.out.println("****** Complemento bit a bit (~) ******");
        int cB1 = 6;
        int cB2 = -2;
        System.out.println("cB1 =  " + cB1);
        System.out.println("cB2 =  " + cB2);
        System.out.println("~cB1 =  " + ~cB1);
        System.out.println("~cB2 =  " + ~cB2);
    }
}
