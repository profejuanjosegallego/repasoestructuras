package org.example.emanuelcelis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Preparcial {
    public static void main(String[] args) {
        String correoAlmacenado = "emanuelceliscano@gmail.com";
        String correoDigitado;
        String contraseñaAlamacenada = "123456";
        String contraseñaDigitada;

        Scanner leer = new Scanner(System.in);

        System.out.print("Digite su correo: ");
        correoDigitado = leer.nextLine();

        System.out.print("Digite la contraseña: ");
        contraseñaDigitada = leer.nextLine();

        if (correoAlmacenado.equals(correoDigitado) && contraseñaAlamacenada.equals(contraseñaDigitada)){
            System.out.println("\nBienvenido");

            Integer opcion;
            ArrayList<Object> videojuegos = new ArrayList<>(); // Declararla fuera para almacenar la lista de juegos

            while (true){
                System.out.println("1. Para crear un objeto");
                System.out.println("2. para crear una lista");
                System.out.println("3. Para salir");

                System.out.println("Digita la opcion que deseas");
                opcion = leer.nextInt();
                HashMap<String, Object> videojuego = new HashMap<>();

                if (opcion == 1) {
                    System.out.println("Vamos a crear un objeto");
                    /*Necesito crear un videojuego:
                    * Id Integer
                    * Name String
                    * Edad  String
                    * Precio Double
                    * Fecha Lanzamiento String*/

//                    videojuego.put("id", 1);
//                    videojuego.put("nombre", "Bo6");
//                    videojuego.put("edad", "+18");
//                    videojuego.put("precio", 250.000);
//                    videojuego.put("fechaLanzamiento", "13/09/2025");
                    System.out.println("Digite el id del videojuego");
                    Integer idVideoJuego = leer.nextInt();
                    videojuego.put("id", idVideoJuego);
                    leer.nextLine(); // Usar para limpiar ya que es un numero

                    System.out.println("Digite el nombre del videojuego");
                    String nombreVideoJuego = leer.nextLine();
                    videojuego.put("nombre", nombreVideoJuego);
                    // No es necesario limpiar por que es un string

                    System.out.println("Digite la clasificacion de edad del videojuego");
                    String edadVideoJuego = leer.nextLine();
                    videojuego.put("edad", edadVideoJuego);
                    // No es necesario limpiar por que es un string

                    System.out.println("Digite el precio del videojuego");
                    Double precioVideoJuego = leer.nextDouble();
                    videojuego.put("precio", precioVideoJuego);
                    leer.nextLine();// Usar para limpiar ya que es un numero

                    System.out.println("Digite la fecha de lanzamiento del videojuego");
                    String fechaVideoJuego = leer.nextLine();
                    videojuego.put("fecha", fechaVideoJuego);
                    // No es necesario limpiar por que es un string

                    videojuegos.add(videojuego);
                    System.out.println(videojuegos);

                } else if (opcion == 2) {
                    System.out.println("Vamos a crear una lista");
                } else if (opcion == 3) {
                    break;
                } else {
                    System.out.println("Opcion incorrecta");
                }

            }
        } else {
            System.out.println("Los datos ingresados no coinciden");
        }
    }
}
