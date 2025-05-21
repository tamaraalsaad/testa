package Exercise28;

import java.util.Scanner;

public class exercasis75 {
    public static void main(String[] args) {
        //75.En array med 50 inlästa tal finns. Beräkna och skriv ut summan av alla positiva tal och
        //summan av alla negativa tal i arrayn.
       // Scanner scanner=new Scanner(System.in);
      int []tal=new int[50];
      int summan=tal.length;

      for (int i=0; i<50;i++){
          summan+=i;

      }
      if (summan%2==0){
          System.out.println("positiva tal="+ summan);

      }
      else {
          System.out.println("negativa tal="+summan);
      }

    }
}
