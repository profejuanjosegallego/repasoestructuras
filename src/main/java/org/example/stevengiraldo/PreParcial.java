package org.example.stevengiraldo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PreParcial {

    public static void main(String[] args) {

        String emailGuard="nash1@gmail.com";
        String emailEnterd;
        String passwordGuard="admin";
        String passwordEnterd;
        String colorAzul="\u001B[34m";
        String colorVerde="\u001B[32m";
        String colorRojo="\u001B[31m";

        Scanner LEER= new Scanner(System.in);
        System.out.print( colorAzul+"por favor ingrese su email: ");
        emailEnterd=LEER.nextLine();
        System.out.print(colorAzul+"Por favor ingrese su contraseña: ");
        passwordEnterd=LEER.nextLine();

        Integer option;



        HashMap<String,Object> videojuego =new HashMap<>();
        ArrayList<Object> videojuegos =new ArrayList<>();

        if (emailEnterd.equals(emailGuard) && passwordEnterd.equals(passwordGuard) ){
            System.out.println(colorAzul+"Bienvenidos🤩");

            while (true){

                System.out.println(colorVerde+"1.para crear un objeto");
                System.out.println(colorVerde+"2.para crear una lista📑");
                System.out.println(colorVerde+"3.salir🚪");

                System.out.print(colorAzul+"Digite la option que deseas: ");
                option=LEER.nextInt();



                if (option==1){
                    System.out.println(colorAzul+"Vamos a crear el objet");
                    /* Necesito registrar un video juego
                    *Id integer
                    * name String
                    * ClasificasionEdad String
                    * Presio double
                    * fechaEstreno String
                     */


                    videojuego.put("Id",1);
                    videojuego.put("Name","gta 6");
                    videojuego.put("Range","18+");
                    videojuego.put("Preci",230);
                    videojuego.put("Date","26/05/2026");

                } else if (option==2) {
                    System.out.println(colorAzul+"Vamos a crear una lista");


                    videojuegos.add(videojuego);
                    System.out.println(videojuegos);

                } else if (option==3) {
                    System.out.println(colorVerde+"Adios 🚪");
                }else {
                    System.out.println(colorRojo+" Option no valida");
                }

            }
        }else{
            System.out.println(colorRojo+"Erro datos incorrecto❌");
        }
    }

}
