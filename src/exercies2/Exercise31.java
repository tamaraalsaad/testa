package exercies2;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {

    //   31.Skapa ett program som läser in ett antal tal och skriver ut dem. Talföljdens slut
        //markeras med 0.

        Scanner scan = new Scanner(System.in);
        for ( int i= 0;i<10;i++){



            int firstTal = scan.nextInt();
            System.out.println(firstTal);
        }
    }
}
