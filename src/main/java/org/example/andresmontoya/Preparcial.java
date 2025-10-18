package org.example.andresmontoya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Preparcial {

    public static void main(String[] args) {
        String correoGuardado="andres@gmail.com";
        String correoDigitado;
        String contraseñaDigitada;
        String contraseñaGuardada="admin";

        Scanner leer=new Scanner(System.in);

        System.out.println("por favor ingrese su correo");
        correoDigitado=leer.nextLine();
        System.out.println("por favor ingrese su contraseña");
        contraseñaDigitada=leer.nextLine();


        Integer opcion;
        if(correoDigitado.equals(correoGuardado)&& contraseñaDigitada.equals(contraseñaGuardada)){
            System.out.println("bienvenido");
            //true para que entre infinitamente
            while(true){
                System.out.println("1 para crear un objeto");
                System.out.println("2 para crear un arreglo");
                System.out.println("para salir");
                System.out.print("digita la opcion que deseas:");
                opcion=leer.nextInt();
                HashMap<String,Object>videojuego=new HashMap<>();
                if(opcion==1){
                    System.out.println("vamos a crear el objeto");
                    //declarando dicionario o Objeto
                    //necesito registrar un video juego va a tener unos archivos de tipo: ID integer,name String, range String, price double, fechaEstreno String
                    //singular
                    //HashMap<String,Object>videojuego=new HashMap<>();
                    videojuego.put("id",1);
                    videojuego.put("name","jedi orden fallen");
                    videojuego.put("range","18+");
                    videojuego.put("price",15.22);
                    videojuego.put("date","17/10/2025");

                } else if (opcion==2) {
                    System.out.println("vamos a crear un objeto");
                    //listas plural
                    ArrayList<Object> videojuegos=new ArrayList<>();
                    videojuegos.add(videojuego);

                } else if (opcion==3) {
                    System.out.println("adios");
                }else{
                    System.out.println("opcion no valida");
                }

            }

        }else{
            System.out.println("NO ES CORRECTO");

        }


    }
}
