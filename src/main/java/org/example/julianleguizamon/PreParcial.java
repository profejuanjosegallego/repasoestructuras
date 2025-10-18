package org.example.julianleguizamon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PreParcial {

    public static void main(String[] args) {
        String CorreoGuardado = "correo@gmail.com";
        String CorreoDigitado;
        String ContraseñaGuardado = "admind123";
        String ContraseñaDigitada;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el Correo: ");
        CorreoDigitado = leer.next();
        System.out.println("Ingrese la Contraseña: ");
        ContraseñaDigitada = leer.next();

        Integer opcion;

        if (CorreoDigitado.equals(CorreoGuardado) && ContraseñaDigitada.equals(ContraseñaGuardado)){
            System.out.println("Bienvenido 🤖");
            while(true){
                System.out.println("-------- Menú --------");
                System.out.println("1. Para crear un objeto");
                System.out.println("2. Para crear una lista");
                System.out.println("3. Para salir");
                System.out.println("-----------------------");
                System.out.print("Digita la Opcion: ");
                opcion = leer.nextInt();
                HashMap<String,Object> videojuego = new HashMap<>();
                
                if (opcion == 1){
                    System.out.println("Vamos a crear un objeto.");
                    //Necesito Registrar un videojuego:
                    //* Id (Integer)
                    //* Nombre (String)
                    //* ClasificacionEdad (String)
                    //* Precio (double)
                    //* FechaEstreno (String)
                    

                    videojuego.put("Id", 1);
                    videojuego.put("Nombre", "FIFA26");
                    videojuego.put("Clasificacion", "18+");
                    videojuego.put("Precio", 50000.0);
                    videojuego.put("FechaEstreno", "15/12/2025");
                    
                } else if (opcion == 2) {
                    System.out.println("Vamos a crear una lista.");

                    ArrayList<Object> videojuegos = new ArrayList<>();
                    videojuegos.add(videojuego);
                    
                }else if (opcion == 3){
                    System.out.println("Adios");
                }else {
                    System.out.println("Opción no valida ❌");
                }
            }


        }else {
            System.out.println("Intente nuevamente ❌");
        }

    }

}
