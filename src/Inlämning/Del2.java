package Inlämning;


import java.util.Scanner;

public class Del2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        read read = new read();
        while (true) {

            String rad = scanner.nextLine();
            if (rad.equals("stop")) {
                break;
            }
            read.RadCount(rad);
        }
            System.out.println(read.getRadCount());

            System.out.println(read.getCharCount());




    }








    }