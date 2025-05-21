package övning2;

import java.util.Scanner;

public class ovning35 {
    public static void main(String[] args) {
        //35.Skapa ett program som beräknar och skriver ut kvadraterna för talen 1 till 9.
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        for (number = scan.nextInt(); number <= 9; number++) {

            System.out.println(" sqer are :" + number * number);

        }

    }
}

