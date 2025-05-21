package exercise1;

import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        //22.Skapa ett program som testar om ett tal är 0-9 men inte 5. Skriv ut lämplig text.
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x <= 9&& x>=0 && x!=5) {
            System.out.println(x);
        } else if (x == 5) {
            System.out.println("can not skriva");
        }
    }
}



