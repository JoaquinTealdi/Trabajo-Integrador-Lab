package Banco;
import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Cuenta> cuentas = new ArrayList();

    public static void main(String[] args) {
<<<<<<< HEAD
        Cuenta cuenta1= new Cuenta("ivanh","12345","Ivan","Herrera");
        Cuenta cuenta2= new Cuenta("ivanherrera","12345678","Roberto","Carlos");
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        boolean parar = true;
        while(parar){
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
                            System.out.println("|:: CUENTAS "+(i+1)+" ::|");
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
                    System.out.println("|:: Desea realizar otra operacion? (Y-N) ::|"+"\n");
                    String pararinput= sc.nextLine().toUpperCase();
                    if(pararinput == "Y"){
                        parar = false;
                    }
                    break;

                case "2":
                    System.out.println("|:: 2-Acceder a cuenta ::|");
                    if(cuentas.isEmpty()){
                        System.out.println("|:: NO hay cuentas registradas ::|");
                    } else {
                        System.out.println("|:: Ingrese username de la cuenta: ::|");
                        String username= sc.nextLine();
                        for (int i = 0; i < cuentas.size() ; i++) {
                            if(cuentas.get(i).getUsername().equals(username)){
                                System.out.println("|:: Ingrese el password: ::|");
                                String password= sc.nextLine();
                                if(cuentas.get(i).getPassword().equals(password)){
                                    System.out.println("|::::::::: MI CUENTA :::::::::|");
                                    System.out.println("|:::: Acciones (Seleccione 1-4) ::::|");
                                    System.out.println("|:: 1-Depositar dinero ::|");
                                    System.out.println("|:: 2-Extraer dinero ::|");
                                    System.out.println("|:: 3-Transferir dinero ::|");
                                    System.out.println("|:: 4-Ver dinero ::|");
                                    String cuentaInput= sc.nextLine();
                                    switch (cuentaInput){
                                        case "1":
                                            System.out.println("|: Ingrese cantidad a depositar: ");
                                            int dineroDepositar= sc.nextInt();
                                            cuentas.get(i).ingresarSaldo(dineroDepositar);
                                            System.out.println("|:: Desea realizar otra operacion? (Y-N) ::|"+"\n");
                                            pararinput= sc.nextLine().toUpperCase();
                                            if(pararinput == "Y"){
                                                parar = false;
                                            }
                                            break;

                                        case "2":
                                            System.out.println("|: Ingrese cantidad a extraer: ");
                                            int dineroExtraer= sc.nextInt();
                                            cuentas.get(i).ingresarSaldo(dineroExtraer);
                                            System.out.println("|:: Desea realizar otra operacion? (Y-N) ::|"+"\n");
                                            pararinput= sc.nextLine().toUpperCase();
                                            if(pararinput == "Y"){
                                                parar = false;
                                            }
                                            break;

                                        case "3":
                                            System.out.println("|: Ingrese CVU: => ");
                                            int CVU= sc.nextInt();
                                            for (int j = 0; j < cuentas.size(); j++) {
                                                if(cuentas.get(j).getCVU()==CVU){
                                                    System.out.println("|: Ingrese dinero a transferir: => ");
                                                    int dineroTransferir= sc.nextInt();
                                                    cuentas.get(j).ingresarSaldo(dineroTransferir);
                                                    System.out.println("|: Dinero transferido con exito :|");
                                                };
                                                break;
                                            }
                                            System.out.println("|:: Desea realizar otra operacion? (Y-N) ::|"+"\n");
                                            pararinput= sc.nextLine().toUpperCase();
                                            if(pararinput == "Y"){
                                                parar = false;
                                            }
                                            break;

                                        case "4":
                                            System.out.println("|: "+cuentas.get(i).getSaldo()+" :|");
                                            System.out.println("|:: Desea realizar otra operacion? (Y-N) ::|"+"\n");
                                            pararinput= sc.nextLine().toUpperCase();
                                            if(pararinput == "Y"){
                                                parar = false;
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                    }
                    break;

                case "3":
                    System.out.println("|:: 3-Agregar cuenta ::|");
                    System.out.println("|: Ingrese username: => ");
                    String username = sc.nextLine();
                    System.out.println("|: Ingrese password: => ");
                    String password = sc.nextLine();
                    System.out.println("|: Ingrese Nombre: => ");
                    String nombre = sc.nextLine();
                    System.out.println("|: Ingrese Apellido: => ");
                    String apellido = sc.nextLine();
                    Cuenta cuenta= new Cuenta(username,password,nombre,apellido);
                    cuentas.add(cuenta);
                    System.out.println("|:: Cuenta agregada exitosamente ::|");
                    System.out.println("|:: Desea realizar otra operacion? (Y-N) ::|"+"\n");
                    pararinput= sc.nextLine().toUpperCase();
                    if(pararinput == "Y"){
                        parar = false;
                    }
                    break;

                case "4":
                    System.out.println("|:: 4-Eliminar cuenta cuenta ::|"+"\n");
                    System.out.println("|:: Ingrese usuario de cuenta a eliminar :  ::|"+"\n");
                    username= sc.nextLine();
                    for (int i = 0; i < cuentas.size() ; i++) {
                        if(cuentas.get(i).getUsername().equals(username)){
                            System.out.println("|:: Ingrese el password para confirmar : ::|");
                            password= sc.nextLine();
                            if(cuentas.get(i).getPassword().equals(password)){
                               cuentas.remove(cuentas.get(i));
                               System.out.println("|:: Cuenta eliminada correctamente ::|"+"\n");
                               break;
                            }
                        }
                    }
                    System.out.println("|:: Desea realizar otra operacion? (Y-N) ::|"+"\n");
                    pararinput= sc.nextLine().toUpperCase();
                    if(pararinput == "Y"){
                        parar = false;
                    }
                    break;

                default:
                    System.out.println("|:: Desea realizar otra operacion? (Y-N) ::|"+"\n");
                    pararinput= sc.nextLine().toUpperCase();
                    if(pararinput == "Y"){
                        parar = false;
                    }
                    System.out.println("|:: Accion no disponible ::|");
            }
        }
    }
=======
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


>>>>>>> d4e9c4f654e6854da62c34d3fec29159ee0920ce
}
