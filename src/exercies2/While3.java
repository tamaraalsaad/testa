package exercies2;

public class While3 {
    public static void main(String[] args) {
        int first = 1;
        System.out.println(first + " ");

        int second = 1;
        System.out.println(second + " ");


        while (second <= 100) {
            System.out.println(second + " ");
            int third = first + second;
            first = second;
            second = third;
            System.out.println();
            System.out.println("Fibonacci number 1-100");
        }


    }
}
