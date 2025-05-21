package övning2;

import java.util.Scanner;

public class Account2 {
    public static void main(String[] args) {
       BankAccount2 conto=new BankAccount2();
        Scanner scan=new Scanner(System.in);
        System.out.print("Saldo is=");
        conto.printSaldo();
        System.out.print("The ny saldo is=");
        conto.printNyttSaldo(500);
        conto.draaut(600);



    }
}
