package org.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String usuarioRegistradoBD="user024";
        String contraseñaRegistradaBD="admin123";
        String usuarioDigitado;
        String contarseñaDigitada;

        Scanner leerTeclado=new Scanner(System.in);
        Integer contador=0;
        String colorAzul="\u001B[34m";
        String colorVerde="\u001B[32m";
        String colorRojo="\u001B[31m";

        System.out.println(colorAzul+"\nBienvenido al sistema de control SAS: 🤖");

        while(contador<3){

            System.out.print(colorAzul+"\nDigita tu nombre de usuario: ");
            usuarioDigitado=leerTeclado.nextLine();

            System.out.print(colorAzul+"Digita tu contarseña: ");
            contarseñaDigitada=leerTeclado.nextLine();

            if(usuarioDigitado.equals(usuarioRegistradoBD) && contarseñaDigitada.equals(contraseñaRegistradaBD)){
                System.out.println(colorVerde+"\nBienvenido 🚀");

                System.out.println("\nMenu de opciones");
                System.out.println("****************");
                System.out.println("1. Registrar Productos 📝");
                System.out.println("2. Revisar Inventario 👀");
                System.out.println("3. Modificar Producto 📲");
                System.out.println("4. Eliminar Producto ✖️");
                System.out.println("Digita 5 para salir 🚪");

                Integer opcionSeleccionada=1;
                HashMap<String,Object> producto=new HashMap<>();
                while(opcionSeleccionada != 5){
                    System.out.print("\n Que opciones eliges? ");
                    opcionSeleccionada=leerTeclado.nextInt();

                    if(opcionSeleccionada==1){
                        System.out.println("Ingresando un producto");
                        //Un producto es un diccionario
                        //Declarando un diccionario:

                        //Poblando (llenando) un diccionario
                        producto.put("id",5);
                        producto.put("nombre","Play Station 5");
                        producto.put("disponible",true);
                        producto.put("precioUnitario",500.5);

                        //Necesito llevar el diccionario a una lista
                        //Declarando una lista en java
                        ArrayList<Object>productos=new ArrayList<>();
                        // Poblando o ingersando un elemento a una lista
                        productos.add(producto);
                        System.out.println(productos);



                    }else if(opcionSeleccionada==2){
                        System.out.println("Mostrando el inventario");
                    }else if(opcionSeleccionada==3){
                        System.out.println("modificando un producto");
                    }else if(opcionSeleccionada==4){
                        System.out.println("retirando un producto");
                    }else if(opcionSeleccionada==5){
                        System.out.println("Gracias");
                        break;
                    }else{
                        System.out.println("La opcion ingresada no es valida");
                    }
                }
                break;

                System.out.println("prueba");


            }else{
                System.out.println(colorRojo+"\nRevisa los datos ingresados 💩");
                contador++;
            }



        }

    }
}