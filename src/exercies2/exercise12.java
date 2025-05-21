package exercies2;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
       // 31.Skapa ett program som läser in ett antal tal och skriver ut dem. Talföljdens slut
        //markeras med 0.
        Scanner input =new Scanner(System.in);

        int tal;
        tal =input.nextInt();
        while (tal != 0){
            System.out.println(tal);
            tal=input.nextInt();
        }



    }
}
