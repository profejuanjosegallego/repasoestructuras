package org.example.mauriciopava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class preparcial {

    public static void main(String[] args) {
        String CorreoGuardado = " mauropava@gmail.com";
        String CorreoDigitado, ContrasenaDigitada;
        String ContrasenaGuarda = "admin";

        Scanner leer =new Scanner(System.in);
        System.out.println( " Ingrese su Correo ");
        CorreoDigitado = leer.nextLine();
        System.out.println( " Ingrese su Contraseña");
        ContrasenaDigitada = leer.nextLine();

        Integer opcion;

        if (CorreoDigitado.equals( CorreoGuardado)&& ContrasenaDigitada.equals(ContrasenaGuarda)){
            System.out.println( " Bienvenido a Preparcial");

            while (true){

                System.out.println( "1.  Crear un Objeto");
                System.out.println( " 2. Crear un Arreglo");
                System.out.println( " 3. Salir");

                opcion = leer.nextInt();
                HashMap <String,Object>  videoJuego = new HashMap<>();

                if (opcion==1){
                    System.out.println( " Vamos a Crear el Objeto");
                    /* Necesito registrar un video juego:
                    *   Id Integer
                    * Name String
                    * ClasificacionEdad String
                    * precio double
                    * fechaLanzamiento
                    */

                    /*Creando un Diccionario*/



                    /* Llenar un diccionario*/

                    videoJuego.put("Id", 1);
                    videoJuego.put("Name", "FIFA26");
                    videoJuego.put("Range", "18+");
                    videoJuego.put("Price", 15.22);
                    videoJuego.put("Date", "17/10/2025");






                } else if (opcion ==2) {
                    System.out.println( " Vamos a Crear un Arreglo");


                    /* Crear una lita*/
                    ArrayList<Object>videoJuegos =new ArrayList<>();
                    videoJuegos.add(videoJuego);



                } else if (opcion==3) {
                    System.out.println( " Adios");

                }


            }



        }else{
            System.out.println( " Eror!!! Intentalo de Nuevo ");
        }


    }
}
