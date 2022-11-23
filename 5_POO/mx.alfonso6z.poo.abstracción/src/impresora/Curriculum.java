package impresora;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja {

    private String persona;
    private String perfil;
    private List<String> experiencias;

    public Curriculum(String persona, String perfil, List<String> experiencias,String contenido) {
        super(contenido);
        this.persona = persona;
        this.perfil = perfil;
        this.experiencias = new ArrayList<String>();
    }

    public Curriculum agregarExperiencia(String exp){
        experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre ");
        sb.append(this.persona)
            .append("Resumen: ").append(this.contenido)
            .append("\n").append("Profesión: ")
            .append(this.perfil).append("\n")
            .append("Experiencias: \n");
        
        for (String exp : experiencias) {
            sb.append("- ").append(exp).append("\n");
        }

        return sb.toString();
    }


    
}
