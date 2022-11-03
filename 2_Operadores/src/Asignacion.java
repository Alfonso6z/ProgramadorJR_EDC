public class Asignacion {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        numero1 = 6;
        numero2 = 5;

        System.out.println("****** (+=) ******");
        numero1+=numero2;
        System.out.println("numero1+=numero2 =  " + numero1);
        
        System.out.println("****** (-=) ******");
        numero2-=numero1;
        System.out.println("numero2-=numero1 =  " + numero2);
        
        System.out.println("****** (*=) ******");
        numero1*=numero2;
        System.out.println("numero1*=numero2 =  " + numero1);

        System.out.println("****** (/=) ******");
        numero1/=numero2;
        System.out.println("numero2/=numero1 =  " + numero2);

        System.out.println("numero2 =  " + numero2);
        System.out.println("numero1 =  " + numero1);
        System.out.println(numero2/numero1);
    }
}
