public class Ternarios {
    public static void main(String[] args) {
        int edad = 18;
        double calf = 5.9;
        int n = -5;
        
        System.out.println("Eres mayor de edad ? -> " + ( edad >= 18 ? "Si" : "No"));
        System.out.println("Aprobaste ? -> " + (calf >= 6.0 ? "Aprobe":"Reprobe"));
        System.out.println("n es negativo o positivo ? -> " + (n > 0 ? "Positivo" :"Negativo"));

    }
}
