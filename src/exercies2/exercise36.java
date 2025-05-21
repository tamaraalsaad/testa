package exercies2;

import java.util.Scanner;

public class exercise36 {
    public static void main(String[] args) {
        //36.Skapa ett program som räknar ut hur mycket man har på banken under
        // vart och ett av de
        //följande 10 åren om man sätter in 1000 kr. Räntan ska läsas in och är
        // densamma för alla åren
        Scanner scanner= new Scanner(System.in);
        double saldo=1000;
        double ranta =scanner.nextDouble();
        for (int ar =1;ar<=10;ar++){
            saldo += saldo*ranta;
            System.out.println( ar+saldo+ranta);

        }

    }
}
