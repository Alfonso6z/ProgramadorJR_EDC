import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            System.out.println("a =  " + a);
        }catch(Exception e){
            System.out.println("erro escribe un entero");
        }

        VarialbesTexto.mayusculas();
    }
}
