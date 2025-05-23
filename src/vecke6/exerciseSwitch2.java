package vecke6;

import java.util.Scanner;

public class exerciseSwitch2 {
    //Skriv en metod som läser in ett tal (1-11) och skriver ut en Simpson’s catch phrase för olika karaktärer
    //Skriver man fel tal skriver metoden ut “please choose a correct character”
    //Använd en switch
    //
    //Överkurs
    //Gör om metoden så att den läser in namn på karaktärerna
   //Homer	D’oh!
    //Marge	Mmm~mmmmm
    //Bart	¡Ay, caramba!
    //Lisa	If anyone wants me, I'll be in my room.
    //Maggie	(Pacifier Suck)
    //Ned	Hi-Diddily-Ho!
    //Burns	Excellent!
    //Edna	Ha!
    //Chalmers	SEEEEYYYMOOUURRR!
    //Apu	Thank You, Come Again!
    //Stu
    public void catchPhrase(String name) {

        switch (name) {
            case "Homer":
                System.out.println("D’oh!");
                break;
            case "Marge":
                System.out.println("Mmm~mmmmm");
                break;
            case "Bart":
                System.out.println("¡Ay, caramba!");
                break;
            case "Lisa":
                System.out.println("If anyone wants me, I'll be in my room.");
                break;
            case "Maggie":
                System.out.println("Pacifier Suck");
                break;

            case "Ned":
                System.out.println("Hi-Diddily-Ho!");
                break;

            case "Burns":
                System.out.println("Excellent!");
                break;

            case "Edna":
                System.out.println("Ha!");
                break;

            case "Chalmers":
                System.out.println("SEEEEYYYMOOUURRR!");
                break;

            case "Apu":
                System.out.println("Thank You, Come Again!");
                break;

        }


    }


}

