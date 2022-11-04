public class SiAnidada {
    public static void main(String[] args) {
        boolean condicion1 = true,condicion2 = true;

    
        if(condicion1){
            // if anidado
            if(condicion2)
                System.out.println("Condicion1 y Condicion2 son verdaderas");
            System.out.println("Condicion1 es verdadera");
        }else{
            // if anidado
            if(condicion2)
                System.out.println("Condicion2 es verdadera");
        }
        System.out.println("Fuera de la estructura if-else");

        if(true)
            if(true)
                if(true)
                    if(true)
                        if(true)
                            System.out.println("dentro de todos los ifs");
    }
}
