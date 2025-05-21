package exercies2;

public class exercise {
    public static void main(String[] args) {

        int first = 21;
        int second = 7;

        if (first > second) {
            System.out.println("Första tal är störst");
        } else if (second > first) {
            System.out.println("Andar tal är störst");
        }


        if (first % second == 0) {
            System.out.println("jämt delbart ");

        } else  {
            System.out.println("Inte jämt delbart");
        }
    }
}
