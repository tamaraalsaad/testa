package exercise8;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        // 1.Skapa ett program som läser in ett antal tal och skriver ut dem. Talföljdens slut
        //markeras med 0.
        Scanner scanner = new Scanner(System.in);
        int tal = scanner.nextInt();
        while (tal >= 0) {
            System.out.println(tal);

            if (tal == 0)
                System.out.println(0);
                break;
            }
        }
    }
