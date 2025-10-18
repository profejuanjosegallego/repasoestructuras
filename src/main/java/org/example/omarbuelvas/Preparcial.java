package org.example.omarbuelvas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Preparcial {
    public static void main(String[] args) {

        String CorreoGuardado="jose@gmail.com";
        String CorreoDigitado;
        String Contraseña;
        String contraseñaGuardada="admin";


        Integer  opcion;
        HashMap<String,Object> VIDEO_JUEGO= new HashMap<>();

        Scanner leer = new Scanner(System.in);
        System.out.println(" por favor ingrese su correo 📧");
        CorreoDigitado=leer.nextLine();
        System.out.println("por favor ingresa su contraseña ⚙️");
        Contraseña= leer.nextLine();
        if (CorreoDigitado.equals(CorreoGuardado)&&Contraseña.equals(contraseñaGuardada)){
            System.out.println("bienvenidos");
            while (true){
                System.out.println("1.para crear un objeto");
                System.out.println("2.para crear una lista");
                System.out.println("3.para salir");

                System.out.println("ingrese la opcion del 1 a 3 ");
                opcion = leer.nextInt();

                if (opcion==1){
                    System.out.println("vamos a crear un objeto");
                    //NESECITO REGISTRAR UN VIDEO JUEGO
                    /* ID INTEGER
                     * NOMBRE STRING
                     * CLASIFICACIONEDAD STRING
                     * PRECIO DOUBLE
                     * FECHAESTRENO STRING
                     */

                    VIDEO_JUEGO.put("ID",1);
                    VIDEO_JUEGO.put("NOMBRE","GTA6");
                    VIDEO_JUEGO.put("RANGO","15+");
                    VIDEO_JUEGO.put("PRECIO",500.000);
                    VIDEO_JUEGO.put("ESTRENO","7/08/2026");


                } else if (opcion == 2){
                    System.out.println("vamos a crear una lista");

                    ArrayList<Object>videos_juegos = new ArrayList<>();
                    videos_juegos.add(videos_juegos);


                } else if(opcion==3){
                    System.out.println("Adios");
                }

            }
        }else {
            System.out.println(" CONTRASEÑA INVALIDAD 🥺");
        }

    }
}
