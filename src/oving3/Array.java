package oving3;

public class Array {
    public static void main(String[] args) {
        // String[]names={"nadin","josef","adam","axel","tara"};
        String[] names = new String[5];
        names[0] = "nadin";
        names[1] = "josef";
        names[2] = "adam";
        names[3] = "axel";
        names[4] = "tara";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);}
            // System.out.println(names[0]);
            // System.out.println(names[4]);
            String myString = "hej på dig";
            String[] stringsArray = myString.split(" ");

            for (int i = 0; i < stringsArray.length; i++) {
                System.out.println(stringsArray[i]);
            }

        }
    }


