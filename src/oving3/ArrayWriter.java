package oving3;

import java.util.Scanner;

public class ArrayWriter {
    public static void main(String[] args) {
        //skapa ett program som läser in fem ifrån terminalen
        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];

    //och spara dem i en array
        for (int i=0;i< names.length;i++){
            names[i]= scan.nextLine();
        }
        //skriv ut det först och sista namnet
        System.out.println(names[0]);
        System.out.println(names[names.length-1]);

    }
}
