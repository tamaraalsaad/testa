package övning2;

import java.util.Scanner;

public class ovening4 {
    //4. Skapa ett program som läser in tre tal och beräknar och skriver ut summan samt medelvärdet
    //av de tre talen.
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int tal1 = scan.nextInt();
        int tal2 = scan.nextInt();
        int tal3 = scan.nextInt();
        int summan = tal1+tal2+tal3;
        int mean = summan/3;
        System.out.println(summan);
        System.out.println(mean);

    }
}
