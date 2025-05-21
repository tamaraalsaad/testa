package övning2;

import java.util.Scanner;

import static java.lang.System.in;

public class ovning39 {
    public static void main(String[] args) {
        //39.Skapa ett program som läser in ett pris exkl moms och skriver ut priset inkl 25 % moms.
        //Inläsningen ska pågå tills 0 anges.
        Scanner scan = new Scanner(System.in);
        int price = scan.nextInt();
        while (price != 0) {
            System.out.println(price * 1.25 + "kr");
            price=scan.nextInt();



        }


    }

}

