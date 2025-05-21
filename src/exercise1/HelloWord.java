package exercise1;

import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // String text = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        System.out.println(number);
       // System.out.println(" Du skrev dnna text :" + text);
        HelloWordPrinter hwp = new HelloWordPrinter();
        // hwp.print();
        hwp.printManyTims(number);


    }

}
