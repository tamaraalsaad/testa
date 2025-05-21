package ArrayUppgift;

import java.util.Scanner;

public class Fraction78 {
    public static void main(String[] args) {
        //78.Skapa ett program som läser in siffrorna i ett bråk (täljare och nämnare) till en array med
        //två platser. Eftersom det är otillåtet att ha 0 i nämnaren ska ett felmeddelande skrivas ut
        //om så är fallet.
        //Täljare/Närmnaren t.ex 7/3 .7 Täljare och 3 närmnare
        //Skape en array med två platser(som är två siffror)
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[2];
        numbers[0] = scan.nextInt();
        numbers[1] = scan.nextInt();
        if (numbers[1] == 0) {
            System.out.println("fel medlanda");


        } else {
            System.out.println(" bråk är :" +numbers[0]+ "/" +numbers[1]);

        }
    }
}
