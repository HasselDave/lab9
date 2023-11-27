package com.company;
import java.io.File; // import clasa File
import java.io.IOException; //clasa IOException trateaza erori
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Main {

    public static void main(String[] args) { //cerinta 1
        try {
            File myObj = new File("fisier.txt");
            if (myObj.createNewFile()) {
                System.out.println("Fisier creat: " + myObj.getName());
            } else {
                System.out.println("Fisierul deja exista!");
            }
        } catch (IOException e) {
            System.out.println("A aparaut o eroare!");
            e.printStackTrace();
        }
        // cerinta 2
        try {
            FileWriter myWriter = new FileWriter("fisier.txt");
            myWriter.write("Please send help!");
            myWriter.close();
            System.out.println("Actiune realizata cu succes!");
        } catch (IOException e) {
            System.out.println("A aparut o eroare!");
            e.printStackTrace();
        }


        //cerinta 3
        try {
            File myObj = new File("fisier.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
               String data = myReader.nextLine();
               System.out.println(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e){
         System.out.println("A aparut o eroare!");
         e.printStackTrace();
        }

        // cerinta 4

        File myObj = new File("fisier.txt");
        if(myObj.delete()){
            System.out.println("Fisier sters: " + myObj.getName());
        }
        else{
            System.out.println("Fisierul nu poate fi sters!");
        }
    }
}
