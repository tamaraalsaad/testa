package exercise1;

import java.util.Scanner;

public class exercasis41 {
    public static void main(String[] args) {
      //  41.Skapa ett program som skriver ut summan av talen 1 till 50
        Scanner scan =new Scanner(System.in);
        int x = scan.nextInt();
        int summan =0;
        for ( int i = 1; i<=50; i++);
        summan= summan+ x;
        System.out.println( summan);
    }
}
