package com.example.homebanking.Banco;

public class Nodo {
    public String username;
    public String password;
    public String nombre;
    public String apellido;
    private int CVU;
    private int saldo;
    public Nodo siguiente;

    public Nodo(String username, String password, String nombre, String apellido) {
        this.username=username;
        this.password=password;
        this.nombre=nombre;
        this.apellido=apellido;
        this.saldo=0;
        this.CVU=1;
        this.siguiente = null;
    }

    public int getCVU(){
        return this.CVU;
    }
    public int getSaldo(){
        return this.saldo;
    }

    // toString() retorna el valor del nodo.
    @Override
    public String toString() {
        return this.username + " " + this.password;
    }
}

