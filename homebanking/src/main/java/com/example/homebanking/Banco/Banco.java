package com.example.homebanking.Banco;

public class Banco {
    private String nombre;
    private ListaEnlazada cuentasRegistradas = new ListaEnlazada();


    public Banco(String nombre){
        this.nombre = nombre;
        ListaEnlazada cuentasRegistradas = new ListaEnlazada();
    }

    public void agregarCuenta(String username, String password,String nombre, String apellido){
        this.cuentasRegistradas.agregar(username,password,nombre,apellido);
    }

    public void verCuentas(){
        this.cuentasRegistradas.imprimir();
    }
}



