package exercise7;

import java.util.Scanner;

public class Öveningägg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();


        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));

        }
        if (text.equals("ägg")) {
            System.out.println("ägg är knasigt");
        }
    }

}
