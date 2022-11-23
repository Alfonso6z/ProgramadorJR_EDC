import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;

public class VarialbesTexto {
    static String PATH_ARCHIVO = "";
    public static void concatenacion() {
        String str1 = "Programación en";
        String str2 = "Java";

        // concatenar str1 y str2
        System.out.println(str1.concat(" ").concat(str2));
        // Salida: Programación en Java
    }

    public static void mayusculas() {
        String str1 = "Aprender Java";
        String str2 = "Java123";
        // convierte en mayúsculas los caracteres de la cadena
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toUpperCase());
        /*
         * Salida
         * APRENDER JAVA
         * JAVA123
         */
    }

    public static void minusculas() {
        String str1 = "PROGRAMACIÓN EN JAVA";
        // convierte en minúsculas los caracteres de la cadena
        System.out.println(str1.toLowerCase());
        // programación en java
    }

    public static void longitud() {
        String str1 = "Programar en Java es divertido";
        // cuenta número de caracteres en una cadena
        // contando los espacios en blanco
        System.out.println(str1.length());
    }

    public static void castingString() {
        int i = 200;
        String s = String.valueOf(i);
        // imprimirá 300 porque i tiene un valor numérico
        System.out.println(i + 100);
        // imprimirá 200100 porque s es una cadena
        System.out.println(s + 100);
    }

    public static void castingInt() {
        // Declarando una variable de tipo String
        String s = "200";
        System.out.println(s + " pesos");
        // Convirtiendo la variable de tipo String en una
        // de tipo int usando
        // Integer.parseInt()
        int i = Integer.parseInt(s);
        // Imprimiendo el valor de i
        System.out.println(i);
        System.out.println(i + 300);
    }

    public static void leerTexto(){
        // Crea un arreglo de caracteres
        char[] arreglo= new char[1000];
        try {
            // Crea un lector de texto usando FileReader
            Reader entrada = new FileReader(PATH_ARCHIVO);
            // Revisa si el lector de texto está listo
            System.out.println("Hay datos en la transmision?  " + entrada.ready());
            // Lee los caracteres
            entrada.read(arreglo);
            System.out.println("Datos en la transmision:");
            System.out.println(arreglo);
            // Cierra el lector de texto
            entrada.close();
        }
        catch(Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }

    public static void escribirArchivo(){
        String datos = "Esta es la información que tendra el archivo de salida Exercitation minim proident nostrud exercitation dolore fugiat ex. Aliqua sit qui ex irure excepteur deserunt et incididunt veniam amet qui magna. Consectetur est nostrud ea dolor do id culpa aute exercitation pariatur magna sint proident do. Cillum aute velit sunt quis. Dolor nisi quis ipsum velit quis duis sit est mollit exercitation magna. Enim qui nisi veniam tempor esse in amet aute culpa pariatur deserunt.Adipisicing officia non sit ullamco ad ad esse eu in nostrud. Dolor eiusmod nisi ut fugiat magna duis ut. Veniam qui esse ex aliqua et cupidatat. Do non elit dolor Lorem ipsum laborum nulla sit duis qui nostrud. Enim sint eiusmod consequat laborum. Elit qui ut magna ullamco enim elit in non.Quis duis sunt laboris anim Lorem aliqua sint laborum aliqua. Aliqua adipisicing incididunt aliquip sunt dolore anim veniam consequat laborum reprehenderit. Duis dolor aliqua tempor in nulla mollit aute magna dolor nostrud velit non non pariatur. Incididunt eu sint et culpa veniam pariatur. Laboris incididunt veniam est cupidatat voluptate.Anim anim cupidatat qui tempor nisi anim. Nostrud eu nostrud dolor duis sunt nostrud culpa ut. Dolore velit excepteur ad sit. Tempor sit nostrud ad ut adipisicing laborum eu amet officia aute deserunt anim adipisicing officia. Fugiat elit ea aliqua sit minim aliqua irure do id. Mollit quis labore laboris sit et cupidatat voluptate mollit sit esse dolor commodo cillum. Eiusmod officia voluptate amet veniam ipsum enim adipisicing nulla voluptate.Enim magna laborum duis commodo magna excepteur quis nulla culpa pariatur ullamco mollit reprehenderit. Consequat reprehenderit pariatur commodo incididunt veniam magna ullamco magna proident amet anim sit fugiat. Qui aliqua veniam labore Lorem eu Lorem reprehenderit tempor tempor.Commodo reprehenderit consectetur aute culpa duis laborum. Dolore tempor est id fugiat ad velit. Cupidatat proident mollit reprehenderit eiusmod ipsum reprehenderit cupidatat adipisicing consectetur.Sunt dolor commodo cupidatat magna exercitation ullamco tempor cillum Lorem reprehenderit. Culpa eu anim nostrud culpa consequat adipisicing proident qui esse mollit excepteur adipisicing nisi cupidatat. Labore consectetur Lorem ullamco sint. Excepteur officia sit consequat consequat. Officia id deserunt reprehenderit aliquip tempor.Consequat ipsum ea veniam consequat sint enim deserunt ipsum cillum ex consectetur enim laborum. Incididunt ea sint voluptate do nostrud ea eiusmod eiusmod minim ullamco laboris ex id pariatur. Magna eiusmod proident in commodo dolor laboris sit proident ex.Pariatur consectetur adipisicing dolore excepteur consectetur culpa do. Eu adipisicing ipsum proident aute deserunt elit qui adipisicing adipisicing cupidatat minim. Adipisicing dolor cupidatat nulla sunt eu in exercitation exercitation nostrud reprehenderit. Id culpa magna nostrud cupidatat pariatur quis reprehenderit nulla Lorem et reprehenderit. Cillum dolore enim laborum labore sit consectetur elit in commodo excepteur excepteur quis.Qui dolore laboris id culpa dolor velit. Lorem officia est in nisi magna sint incididunt incididunt non. Sunt minim commodo exercitation in mollit commodo nisi est elit laboris aliqua dolore aliquip. Nulla laborum commodo ad mollit ipsum proident est eiusmod anim magna. Labore velit cupidatat exercitation in ipsum. Cillum ullamco nostrud cupidatat cupidatat ut dolor mollit. Velit veniam duis sint non eu.";
        try {
            // Crear un Writer usando la clase FileWriter
            Writer salida = new FileWriter("archivosalida.txt");
            
            // Escribe la cadena en el archivo
            salida.write(datos);
            // cierra el Writer
            salida.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

