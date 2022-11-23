package figura;

public abstract class Figura {
    String color;
    
    
    public Figura(String color) {
        this.color = color;
    }

    abstract double area();
    
    public abstract String toString();

    public String getColor(){
        return this.color;
    }
    
}
