public class Si {
    public static void main(String[] args) throws Exception {
        boolean condicion = true;

        if(condicion){
            System.out.println("Dentro del if ");
            /*
             * Sentencias a ejecutar 
             * Si la condición es verdadera
             */
        }
        /*
         * Si no colocamos las {} despues del if, por defecto, la 
         * declaración considerará que la linea de código inmediata
         * está dentrok de su bloque
         */
        if(!condicion)
            System.out.println("Primera declaración"); // dentro 
            System.out.println("Segunda  declaración"); // fuera if
    }
}
