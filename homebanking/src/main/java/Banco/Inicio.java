package Banco;
import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Cuenta> cuentas = new ArrayList();

    public static void main(String[] args) {
         System.out.println("|::::::::: MI BANQUITO :::::::::|");
         System.out.println("|:::: Acciones (Seleccione 1-4) ::::|");
         System.out.println("|:: 1-Listado cuentas ::|");
         System.out.println("|:: 2-Acceder a cuenta ::|");
         System.out.println("|:: 3-Agregar cuenta ::|");
         System.out.println("|:: 4-Eliminar cuenta cuenta ::|"+"\n");

         String input= sc.nextLine();

        switch(input) {
            case "1":
                System.out.println("|:: 1-Listado cuentas ::|");
                if(cuentas.isEmpty()){
                    System.out.println("|:: NO HAY CUENTAS REGISTRADAS ::|");
                } else{
                    System.out.println("|:: CUENTAS REGISTRADAS ::|");
                    for (int i = 0; i < cuentas.size() ; i++) {
                        System.out.println("|:: CUENTAS "+i+"::|");
                            System.out.println(
                                        "Username: "+cuentas.get(i).getUsername()+"\n"+
                                        "Password: NO DISPONIBLE"+"\n"+
                                        "Nombre: "+cuentas.get(i).getNombre()+"\n"+
                                        "Apellido: "+cuentas.get(i).getApellido()+"\n"+
                                        "Saldo: "+cuentas.get(i).getSaldo()+"\n"+
                                        "CVU: "+cuentas.get(i).getCVU()
                            );
                    }
                }
                break;
            case "2":
                System.out.println("|:: 2-Acceder a cuenta ::|");
                System.out.println("|:: Ingrese username de la cuenta: ::|");
                String username= sc.nextLine();
                for (int i = 0; i < cuentas.size() ; i++) {
                    if(cuentas.get(i).getUsername().equals(username)){
                        System.out.println("|:: Ingrese el password: ::|");
                        String password= sc.nextLine();
                        if(cuentas.get(i).getPassword().equals(password)){
                            System.out.println("|::::::::: MI CUENTA :::::::::|");
                            System.out.println("|:::: Acciones (Seleccione 1-4) ::::|");
                            System.out.println("|:: 1-Agregar saldo ::|");
                            System.out.println("|:: 2-Extraer saldo ::|");
                            System.out.println("|:: 3-Transferir dinero ::|");
                        }
                    }
                }

                break;
            case "3":
                // code block
                break;
            case "4":
                // code block
                break;

            default:
                System.out.println("|:: Accion no disponible ::|");
        }


    }


}
