package org.example.juangallego;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class PreParcial {

    public static void main(String[] args) {
        String correoGuradado="nash1@gmail.com";
        String correoDigitado;
        String contraseñaDigitada;
        String contraseñaGuardada="admin";

        Scanner leer= new Scanner(System.in);
        System.out.print("Por favor ingrese su correo: ");
        correoDigitado=leer.nextLine();
        System.out.print("Por favor ingrese su contraseña: ");
        contraseñaDigitada=leer.nextLine();

        Integer opcion;

        if(correoDigitado.equals(correoGuradado) && contraseñaDigitada.equals(contraseñaGuardada)){
            System.out.println("Bienvenido🤩");
            while (true) {
                System.out.println("1.Para crear un objeto");
                System.out.println("2.Para crear una lista");
                System.out.println("3.Para salir");

                System.out.print("Digita la opción que deseas:");
                opcion = leer.nextInt();
                HashMap <String, Object> videoJuego = new HashMap<>();

                if (opcion == 1){
                    System.out.println("Vamos a crear un objeto");
                    /*Necesito registrar un video juego:
                    * Id Integer
                    * Name String
                    * clasificacionEdad String
                    * precio double
                    * fechaEstreno String*/



                    videoJuego.put("Id", 1);
                    videoJuego.put("Name","Jedi orden fallen");
                    videoJuego.put("Range", "18+");
                    videoJuego.put("Price",15.9);
                    videoJuego.put("Date","17/10/2025");

                } else if (opcion == 2) {
                    System.out.println("Vamos a crear una lista");

                    ArrayList<Object> videosJuegos = new ArrayList<>();
                    videosJuegos.add(videoJuego);

                } else if (opcion == 3) {
                    System.out.println("Adios ");
                }else{
                    System.out.println(" Opción no valida ✖️");
                }
            }

        }else {
            System.out.println("No es correcto✖️");

        }
    }

}
