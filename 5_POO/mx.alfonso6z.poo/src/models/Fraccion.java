package models;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador<0?1:denominador;
        simplificar();
    }

    public Fraccion sumar(Fraccion f){
        Fraccion suma = new Fraccion();
        suma.numerador = this.numerador * f.denominador + this.denominador * f.numerador;
        suma.denominador = this.denominador*f.denominador;
        suma.simplificar();
        return suma;
    }

    public Fraccion resta(Fraccion f){
        Fraccion resta = new Fraccion();
        resta.numerador = this.numerador * f.denominador - this.denominador * f.numerador;
        resta.denominador = this.denominador*f.denominador;
        resta.simplificar();
        return resta;
    }

    public Fraccion multiplicar(Fraccion f){
        Fraccion mult = new Fraccion();
        mult.numerador = this.numerador * f.numerador;
        mult.denominador = this.denominador*f.denominador;
        mult.simplificar();
        return mult;
    }

    public Fraccion dividir(Fraccion f){
        Fraccion div = new Fraccion();
        div.numerador = this.numerador * f.denominador;
        div.denominador = this.denominador * f.numerador;
        div.simplificar();
        return div;
    }

    private void simplificar() {
        int n = mcd();
        this.numerador = this.numerador/n;
        this.denominador = this.denominador/n;
    }

    

    private int mcd() {
        int absDenominador = this.denominador>0?this.denominador:(this.denominador)*-1;
        int absNumerador = this.numerador>0?this.numerador:(this.numerador)*-1;
        int dividendo = absDenominador>absNumerador?absDenominador:absNumerador;
        int divisor = absDenominador<absNumerador?absDenominador:absNumerador;
        int r;
        do{
            r = dividendo%divisor;
            dividendo = divisor;
            divisor = r;
        }while(!(r==0));
        return dividendo;
    }

    @Override
    public String toString() {
        return this.numerador + "/" +this.denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    

}
