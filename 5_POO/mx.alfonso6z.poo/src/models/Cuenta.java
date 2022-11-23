package models;
public class Cuenta {

    private String nombre;
    private String numeroCuenta;
    private double tazaInteres;
    private double saldo;

    public Cuenta() {
        
    }
    
    public Cuenta(String nombre, String numeroCuenta, double tazaInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tazaInteres = tazaInteres;
        this.saldo = saldo;
    }

    public Cuenta(final Cuenta c){
        this.nombre = c.nombre;
        this.numeroCuenta = c.numeroCuenta;
        this.tazaInteres = c.tazaInteres;
        this.saldo = c.saldo;
    }

    public boolean ingreso(double cantidad){
        if(cantidad>0)
            this.saldo+=cantidad;
        return cantidad>0;
    }

    public boolean egreso(double cantidad){
        if(cantidad<= this.saldo){
            this.saldo-=cantidad;
            return true;
        }
        return false;
    }
    public boolean transferencia(Cuenta c,double cantidad){
        if(this.saldo>=cantidad){
            egreso(cantidad);
            c.ingreso(cantidad);
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tazaInteres;
    }

    public void setTipoInteres(double tazaInteres) {
        this.tazaInteres = tazaInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
