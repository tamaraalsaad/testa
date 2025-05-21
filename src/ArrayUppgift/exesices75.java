package ArrayUppgift;

public class exesices75 {
    public static void main(String[] args) {
        // 75.En array med 50 inlästa tal finns. Beräkna och skriv ut summan av alla positiva tal och
        // summan av alla negativa tal i arrayn.
        int[] numbers = {5, 23, 123, 4, 2, 6, 8, 138, 2341, 231,
                5, 23, 123, 4, 2, 6, 8, -100, 2341, 541,
                5, 23, 123, -4, 2, 6, 8, 138, 2341, 43,
                5, 23, 123, 4, 2, 6, 8, 138, 2341, 1,
                5, 23, -123, 4, 2, 6, -8, -138, 2341, -61};

        int positive = 0;
        int negative = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negative += numbers[i];
            } else {
                positive += positive;
            }
            System.out.println("summ of all=" + negative);
            System.out.println("summan av postiv" + positive);
        }
    }
}




