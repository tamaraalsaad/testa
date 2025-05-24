package Inlämning;

import java.util.Scanner;

public class textRead {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        textCounter counter= new textCounter();
        while (true ) {

            String line = scan.nextLine();
            if (line.equals("stop")) {
                break;

            }
            counter.addLine(line);
        }

        System.out.println("Namber of lines:"+counter.getLineCount());
        System.out.println("Naumder of characters:"+counter.getCharCount());

    }
}

