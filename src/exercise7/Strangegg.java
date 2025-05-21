package exercise7;


import java.util.Scanner;

public class Strangegg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String myString = "some text";
        if (text.equals("ägg")) {
            System.out.println("ägg är knasit");
        } else {

            for (int i = 0; i < text.length(); ++i) {
                System.out.print(text.charAt(i) + " ");
            }

        }

    }
}
