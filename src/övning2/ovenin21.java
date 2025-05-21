package övning2;

import java.util.Scanner;

public class ovenin21 {
    //21.Skapa ett program som testar om ett tal är mindre än -10 eller större än +10. I så fall ska ett
    //lämpligt meddelande ges.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int nummer = scan.nextInt();
        if (nummer <= -10) {
            System.out.println(" The nummer is negative" + nummer);
        } else if (nummer >= 10) {
            System.out.println("The nummer is positive" + nummer);
        }
        else { System.out.println("Correct number"); }

    }
}

