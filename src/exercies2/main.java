package exercies2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("skrin det första talet=");
         int number1= scan.nextInt();

        System.out.println("skriva det andra tale=");
        int number2 = scan.nextInt();

        calculator cal= new calculator(number1,number2);
        System.out.println("Addition");
        cal.printAddition();
        System.out.println("dived");
        cal.dived();
        // Calculator calculator= new Calaulator(3,54);
        // Calculator funCalclator= new Calaulator(73,-90)
        // calculator.printSum();
        //








    }

    }

