package blucles;

import java.util.Scanner;

public class RepetirMientras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String pass_db = "batman";
        final String user_db = "admin";
        String pass,user;
        boolean acceso;
        do {
            System.out.print("Ingresa el usuario: ");
            user = sc.nextLine();
            System.out.print("Ingresa la contraseña: ");
            pass = sc.nextLine();
            acceso = (user.equals(user_db) && pass.equals(pass_db)) ? true:false;
            System.out.println(acceso?"Correcto...":"Usuario o contraseñan incorrectos...");
        } while (!acceso);
        sc.close();
    }
}
