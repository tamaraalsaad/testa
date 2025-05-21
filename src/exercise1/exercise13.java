package exercise1;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        // 13.Skapa ett program som läser in ett tal och skriver ut om det är jämnt. (Använd
        //modulooperatorn)
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("Det är jämt numer");
        }
    }
}