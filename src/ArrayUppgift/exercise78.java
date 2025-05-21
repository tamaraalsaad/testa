package ArrayUppgift;

import java.util.Scanner;

public class exercise78 {
    public static void main(String[] args) {
        //78.Skapa ett program som läser in siffrorna i ett bråk (täljare och nämnare) till en array med
        //två platser. Eftersom det är otillåtet att ha 0 i nämnaren ska ett felmeddelande skrivas ut
        //om så är fallet.
        Scanner scan =new Scanner(System.in);
        double[] siffror=new double[2] ;
        siffror[0]= scan.nextDouble();
        siffror[1]= scan.nextDouble();
        if (siffror[1]==0){
            System.out.println("felmeddelande");
        }

    }
}
