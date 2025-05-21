package exercies2;

public class While2 {
    public static void main(String[] args) {

        int tal = 1;
        while (tal <= 100) {
            System.out.println(tal);

            tal = tal + 1;
        }
        System.out.println();
        if (tal % 2 == 0) {
            System.out.println(tal + "");
        }

    }
}

