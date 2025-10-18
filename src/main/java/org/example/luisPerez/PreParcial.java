package org.example.luisPerez;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PreParcial {
    public static void main(String[] args) {
        String emailGuardado = "luis@gmail.com";
        String contraseñaGuardado = "luis" ;
        String emailIngresado   ;
        String contraseñaIngresado;
        Integer menu ;

        Scanner teclado = new Scanner(System.in);
        HashMap<String , Object > juego = new HashMap<>();
        ArrayList<Object> juegos = new ArrayList<>();

        System.out.println("ingrese el correo");
        emailIngresado= teclado.nextLine();

        System.out.println("ingrese el contraseña");
        contraseñaIngresado= teclado.nextLine();

        if (emailGuardado.equals(emailIngresado) && contraseñaGuardado.equals(contraseñaIngresado)) {
            System.out.println("Bienvenido");
            while (true){
                System.out.println("--MENU--");
                System.out.println("1 = para crear un objeto \n");
                System.out.println("2 = para crear un lista \n");
                System.out.println("3 = para salir \n");
                menu = teclado.nextInt();
 
                switch (menu){
                    case 1:
                        System.out.println("creando objeto");
                        /*
                        necesito programar un video juego:
                        - id tipo entero
                        - nombre String
                        - clasificacion de edad
                        - precio flotante
                        - fecha de lansamiento cadena de texto
                        */


                        juego.put("id" , 1);
                        juego.put("nombre" , "Gta5");
                        juego.put("edad" , "18+" );
                        juego.put("precio" , 10_00.10);
                        juego.put("fecha", "17-10-2025");
                        break;

                    case 2:
                        System.out.println("vamos a crear una lista");
                        juegos.add(juego);
                        break;

                    case 3:
                        System.out.println("adios");
                        break;

                    default:
                        System.out.println("amigo esta equivocado");
                        break;
                }
            }
        }else {
            System.out.println("intentalo de nuevo");
        }

    }
}
