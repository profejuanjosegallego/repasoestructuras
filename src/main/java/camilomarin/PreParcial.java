package camilomarin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PreParcial {
    //psv crea stand alone=solo ejecuta un main
    public static void main(String[] args) {
        String emailSaved="camdresmarin@gmail.com",
                passwordSaved="admin123",
                nameWrited,
                emailWrited,
                passwordWrited;

        System.out.print("Bienvenido a Biomédica S.A.S 🩺\n");
        Scanner read=new Scanner(System.in);
        System.out.print("Ingrese su correo: ");
        emailWrited= read.nextLine();
        System.out.print("Ingrese su contraseña: ");
        passwordWrited= read.nextLine();
        Integer opcion=0;
        if(emailWrited.equals(emailSaved) && passwordWrited.equals(passwordSaved)){
            System.out.println("Bienvenido 🤖🚀");

            while(true){
                System.out.println("1-Crear un objeto");
                System.out.println("2-Crear una lista");
                System.out.println("3-Salir");

                System.out.println("Elija una de las siguientes opciones: ");
                opcion=read.nextInt();

                //Creo el diccionario
                HashMap<String,Object> videoJuego= new HashMap<>();
                if (opcion==1){
                    System.out.println("Vamos a crear nuestro primer objeto");
                    /*Necesito registrar un video juego
                    *id Integer
                    *name String
                    *ageClass String
                    *price Double
                    *dateSale String
                    */
                    //Llenado del diccionario
                    videoJuego.put("id",1);
                    videoJuego.put("name","Call of Duty");
                    videoJuego.put("ageClass","18+");
                    videoJuego.put("price",30.5);
                    videoJuego.put("dateSale","11/11/1995");
                    System.out.println(videoJuego);

                } else if (opcion==2) {
                    System.out.println("Vamos a crear nuestra primera lista");
                    ArrayList <Object>videoJuegos=new ArrayList<>();
                    videoJuegos.add(videoJuego);
                    System.out.println(videoJuegos);
                } else if (opcion==3) {
                    System.out.println("Hasta luego.\nEsperamos que vuelva pronto");
                    break;
                }else {
                    System.out.println("Opción invalida ✖️.\nVuelva a intentarlo");
                }
            }
        }else {
            System.out.print("Usuario o contraseña erroneos ✖️.\nVuelva a intentarlo");
        }



    }
}
