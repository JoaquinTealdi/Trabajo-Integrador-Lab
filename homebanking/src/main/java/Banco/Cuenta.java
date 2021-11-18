package Banco;

public class Cuenta {
    private String username;
    private String password;
    private String nombre;
    private String apellido;
    private int CVU;
    private int saldo;

    public Cuenta(String username, String password, String nombre, String apellido) {
        this.username=username;
        this.password=password;
        this.nombre=nombre;
        this.apellido=apellido;
        this.saldo=0;
        this.CVU=1;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getCVU() {
        return CVU;
    }

    public String ingresarSaldo(int saldo) {
        this.saldo = this.saldo+saldo;
        return "Dinero ingresado Correctamente";
    }

    public String extraerSaldo(int saldo) {
        if(this.saldo < saldo){
            return "Dinero insuficiente";
        } else{
            this.saldo = this.saldo-saldo;
        }
        return "Dinero extraido Correctamente";
    }



}

