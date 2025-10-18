package org.example.danielavendaño;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PreParcial {
    public static void main(String[] args) {
        String correoGuardado="nash123@gmail.com";
        String correoDigitado;
        String contraseñaDigitada;
        String contraseñaGuardada="admin";

        Scanner leer= new Scanner(System.in);
        System.out.println("Por favor ingrese su correo:");
        correoDigitado=leer.nextLine();
        System.out.println("Por favor ingrese su contraseña");
        contraseñaDigitada=leer.nextLine();

        Integer opcion;
        if(correoDigitado.equals(correoGuardado)&& contraseñaDigitada.equals(contraseñaGuardada)){
            System.out.println("Bienvenido");
            while (true){
                System.out.println("1.Para crear un objeto");
                System.out.println("2.Para crear una lista");
                System.out.println("3.Para salir");

                System.out.println("Digita la opción que deseas");
                opcion = leer.nextInt();
                HashMap <String, Object> videojuego = new HashMap<>();
                if (opcion == 1){
                    System.out.println("Vamos a crear un objeto");
                    /*Necesito registrar un video juego:
                    * Id Integrar
                    * Name string
                    * ClasificacionEdad string*
                    *Precio double
                    * FechaEstreno string */


                    videojuego.put("Id",1);
                    videojuego.put("Nombre","daniel");
                    videojuego.put("Range","18");
                    videojuego.put("Price",15.9);
                    videojuego.put("Date","17/10/2025");


                } else if (opcion == 2) {
                    System.out.println("Vamos a Crear una lista");

                    ArrayList<Object> videojuegos = new ArrayList<>();
                    videojuegos.add(videojuego);

                } else if (opcion == 3) {
                    System.out.println("Adios🏎️");
                }else {
                    System.out.println("Error Datos incorretos❌");
                }
            }


        }
    }
}
