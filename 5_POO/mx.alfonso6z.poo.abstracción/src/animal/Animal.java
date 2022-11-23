package animal;

public class Animal  {
    private String especie;
    private String dieta;
    private String sonido;

    public String hablar(){
        return sonido;
    }

    public String commer(){
        return especie + " : " + " esta comiendo "+ dieta;
    }

}
