package org.example.juliangarcia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PreParcial {
    public static void main(String[] args) {
        String correoGuardado = "juan@gmail.com";
        String correoDigitado;
        String contraseñaGuardada = "admin123";
        String contraseñaDigitada;

        Scanner leer = new Scanner(System.in);

        System.out.println("Digita tu correo");
        correoDigitado = leer.nextLine();
        System.out.println("Digita tu contraseña");
        contraseñaDigitada = leer.nextLine();

        Integer opcion;

        if (correoDigitado.equals(correoGuardado) && contraseñaDigitada.equals(contraseñaGuardada)){
            System.out.println("Bienvenido");
            while (true){
                System.out.println("1.para crear un objeto");
                System.out.println("2.para crear una lista");
                System.out.println("3.para salir");

                System.out.println("Digita una opcion:");
                opcion = leer.nextInt();



                HashMap<String,Object> videoJuego = new HashMap<>();


                if (opcion == 1){
                    System.out.println("Vamos a crear un objeto");
                    /**
                     * necesito registar un video juego:
                     * Id integer
                     * Name String
                     * clasificacionEdad String
                     * precio Double
                     *
                     */

                    videoJuego.put("Id",1);
                    videoJuego.put("Name","Call of dutty");
                    videoJuego.put("clasificacionEdad","18+");
                    videoJuego.put("Precio",15.9);
                    videoJuego.put("fecha","17/10/2025");

                } else if (opcion == 2) {
                    System.out.println("Vamos a crear una lista");

                    ArrayList<Object> videoJuegos = new ArrayList<>();
                    videoJuegos.add(videoJuego);
                    

                } else if (opcion == 3) {
                    System.out.println("Adios");
                } else {
                    System.out.println("Opcion no valida");
                }
            }
        } else {
            System.out.println("ERROR: Datos incorrectos");
        }

    }
}
