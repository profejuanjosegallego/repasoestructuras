package org.example.mateoarcila;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PreParcial {
    public static void main(String[] args) {

        String savedEmail = "email@gmail.com";
        String savedPassword = "admin123";
        String typedEmail , typedPassword;

        Scanner read = new Scanner(System.in);

        System.out.println("Type your Email: ");
        typedEmail = read.nextLine();

        System.out.println("Type your Password: ");
        typedPassword = read.nextLine();
        Integer option;
        HashMap<String , Object>  videoGame = new HashMap<>();

        if (typedPassword.equals(savedPassword) && typedEmail.equals(savedEmail)){

            System.out.println("Welcome 🚀");


            while (true){

                System.out.println("""
                        
                        ------------------------------------
                        
                        1. Create an Object ➕
                        2. Create a list 📋
                        3. Exit ❌
                        
                        ------------------------------------
                        """);

                System.out.println("Choose your Option: ");
                option = read.nextInt();

                if (option == 1){
                    System.out.println(" Let's Create and Object");

                    /*

                    I need to register a videoGame

                    Id -> Type Integer
                    Name -> Type String
                    AgeRange -> Type String
                    Price -> Type double
                    release date -> Type String



                    */


                    videoGame.put("Id" , 1);
                    videoGame.put("Name" , "Def Jam Fight for NY");
                    videoGame.put("AgeRange" , "+16");
                    videoGame.put("Price" , 57.2);
                    videoGame.put("release date" , "04/07/2005");


                } else if (option == 2) {

                    System.out.println(" Let's Create a list 📋");

                    ArrayList<Object> videoGames = new ArrayList<>();
                    videoGames.add(videoGame);

                } else if (option == 3) {

                    System.out.println(" Bye 👋🏼");

                }else{

                    System.out.println(" Invalid option ❌");
                }

            }

        }else{

            System.out.println("Invalid Credentials ❌");

        }





    }
}
