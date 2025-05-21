package ArrayUppgift;

import java.util.Scanner;

public class exercise66 {
    public static void main(String[] args) {
       // 66.I en array finns ett personnummer.
        // Skapa ett program som
        // kontrollerar att födelsedatum och
        //de fyra sista siffrorna åtskiljs av ett
        // bindestreck. Skriv ut ett felmeddelande
        // om så ej är fallet.
       String[]number={"9","0","1","5","0","1","-","1","2","4","3"};
       if (number[8]=="-"){
           System.out.println("korrekt födelsdatum");
       }else {
           System.out.println("inkorrekt födelsdatum");

       }

    }
}
