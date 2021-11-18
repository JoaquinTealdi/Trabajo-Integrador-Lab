package com.example.homebanking;

import com.example.homebanking.Banco.Banco;

import java.util.ArrayList;
import java.util.Scanner;

public class homebanking {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("|::::::::::: HOMEBANKING :::::::::::|");
//        System.out.println("|::USERNAME::|");
//        String usernameInput= sc.nextLine();
//        System.out.println("|::PASSWORD::|");
//        String passwordInput= sc.nextLine();
//
        Banco banco1 = new Banco("Banco del Chaco");
        banco1.agregarCuenta("ivanherrera","12345", "Ivan", "Herrera");
        banco1.agregarCuenta("ivanherrera2","12345", "Ivannn", "Herreraaa");
        banco1.verCuentas();

    }
}
