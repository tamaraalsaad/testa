package exercise1;

import java.util.Scanner;

public class exersise51 {
    public static void main(String[] args) {
        //51.Skapa ett program som läser in 100 tal och räknar och skriver ut hur många gånger talet 7 har
        //lästs in.
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for (int i = 0; i <= 100; i++) {
            System.out.println(x);
            if (x == 7) {
                System.out.println("Tal 7 läst in");
            }
        }

    }
}
