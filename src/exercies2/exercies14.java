package exercies2;


import java.util.Scanner;

public class exercies14 {
    public static void main(String[] args) {
        //11.Skapa ett program där två tal läses in och det första talet skrivs ut om det är störst.
        Scanner scan = new Scanner(System.in);


        int firstTal = scan.nextInt();

        int secondTal = scan.nextInt();
        if (firstTal >= secondTal) {
            System.out.println(firstTal);
        }
    }
}

