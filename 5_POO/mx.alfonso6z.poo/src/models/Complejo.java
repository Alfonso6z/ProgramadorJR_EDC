package models;
public class Complejo {
    private double real;
    private double imag;
  
    public Complejo() {
   
    }
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
  
    //sumar dos números complejos
    //(a, b) + (c, d) = (a + c, b + d);
    public Complejo sumar(Complejo c){
        Complejo suma = new Complejo();
        suma.real = real + c.real;
        suma.imag = imag + c.imag;
        return suma;
    }
   
    //restar dos números complejos
    //(a, b) - (c, d) = (a - c, b - d);
    public Complejo restar(Complejo c){
        Complejo resta = new Complejo();
        resta.real = real - c.real;
        resta.imag = imag - c.imag;
        return resta;
    }
   
    //multiplicar dos números complejos
    //(a, b) * (c, d) = (a*c – b*d, a*d + b*c)
    public Complejo multiplicar(Complejo c){
        Complejo mult = new Complejo();
        mult.real = real * c.real - imag * c.imag;
        mult.imag = real * c.imag + imag * c.real;
        return mult;
    }
   
    //multiplicar un número complejo por un número de tipo double
    //(a, b) * n = (a * n, b * n)
    public Complejo multiplicar(double n){
        Complejo mult = new Complejo();
        mult.real = real * n;
        mult.imag = imag * n;
        return mult;
    }
   
    //dividir dos números complejos
    //(a, b) / (c, d) = ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))
    public Complejo dividir(Complejo c){
        Complejo div = new Complejo();
        div.real = (real * c.real + imag * c.imag)/(c.real * c.real + c.imag * c.imag);
        div.imag = (imag * c.real - real * c.imag)/(c.real * c.real + c.imag * c.imag);                           
        return div;
    }

    //método toString
    @Override
    public String toString() {
        return "(" + real + ", " + imag + ")";
    }

    //método equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complejo other = (Complejo) obj;
        if (this.real != other.real) {
            return false;
        }
        if (this.imag != other.imag) {
            return false;
        }
        return true;
    }
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImag() {
        return imag;
    }
    public void setImag(double imag) {
        this.imag = imag;
    } 
}