package InlamningDel2;

import java.util.Scanner;

public class formationMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TextFormation formation = new TextFormation();


        while (true) {

           String line = scan.nextLine();
           formation.processLine(line);
            if (formation.shouldStop()) {
                break;

            }
        }

        System.out.println("Number of lines :"+formation.getLineCount());
        System.out.println("Number of characters:"+formation.getCharacterCount());
        System.out.println("Namber of word:"+formation.getWordCount());
        System.out.println("longest word:"+formation.getLongestWord());

    }
}
