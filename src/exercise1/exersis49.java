package exercise1;

import java.util.Scanner;

public class exersis49 {
    public static void main(String[] args) {
        //49.Skapa ett program som beräknar f (x)= x
        //n
        //x och n ska läsas in.
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int total = 1;
        for (int i = 0; i < n; i++)
            total *= x;
        {
            System.out.println(total);
        }
    }
}
