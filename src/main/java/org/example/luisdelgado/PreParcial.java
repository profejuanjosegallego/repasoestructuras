package org.example.luisdelgado;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class PreParcial {
    public static void main(String[] args) {
        String email = "ldg@gmail.com";
        String contraseña = "PRueBa25";
        String emailUsuario, contraseñaUsuario;
        Integer opcion;
        Scanner consola = new Scanner(System.in);
        HashMap <String, Object> videoJuego = new HashMap<>();

        System.out.println("Digite su correo");
        emailUsuario = consola.nextLine();

        System.out.println("Digite su contraseña");
        contraseñaUsuario = consola.nextLine();

        if((emailUsuario.equals(email)) && (contraseñaUsuario.equals(contraseña))){
            System.out.println("🆗 Bienvenido al software..!");

            while (true){
                System.out.println("Menu \n" +
                        "1.Crear un objeto \n" +
                        "2.Crear un arreglo \n" +
                        "3.Salir");
                System.out.println("Digite la opcion que deseas");
                opcion = consola.nextInt();


                if(opcion == 1){
                    System.out.println("Vamos a crear un objeto");

                    videoJuego.put("Id",1);
                    videoJuego.put("Name","Star Wars Jedi fallet order");
                    videoJuego.put("Range","18+");
                    videoJuego.put("Prince",15.9);
                    videoJuego.put("Date","17/10/2025");

                } else if (opcion == 2) {
                    System.out.println("Vamos a crear la lista");

                    ArrayList<Object> videoJuegos = new ArrayList<>();

                    videoJuegos.add(videoJuego);

                } else if (opcion == 3){
                    break;
                }else {
                    System.out.println("Opcion no valido ❎");
                }

            }
        }else {
            System.out.println("🛑 Usuario no valido");
        }
    }
}
