package exercise1;

public class exercasis50 {
    public static void main(String[] args) {
        //50.Skapa ett program som skriver ut multiplikationstabellen för ettans till nians tabell.
        for (int y = 1; y <= 9; y++) {
            System.out.println("Det är " + y + "ans tabell");

            for (int i = 1; i <= 10; i++) {
                System.out.print(y * i + ",");
            }
            System.out.println();
        }

    }
}
