package exercise1;

public class Exercise {
    public static void main(String[] args) {


        int first = 5;
        int second = 8;
        int third = 14;

        int sum = first + second + third;
        int median = sum / 3;

        System.out.println("The sum is:" + sum);
        System.out.println("The median is:" + median);
        System.out.println();
        int height = 3;
        int lingth = 5;

        int arean = lingth * height;
        int omkretsen = lingth * 2 + height * 2;

        System.out.println("The arean is:" + arean);
        System.out.println("The omkretsen is:" + omkretsen);

    }

    public static class Myinteger {
        public static void main(String[] args) {

            int number = 5 + 3;
            int nextNumber = number + 1;

            System.out.println(number);
            System.out.println(nextNumber);

            number = 5 + 3;
            nextNumber = number + 1;
            number += 3;
            System.out.println(number);
            number++;
            System.out.println(number);
            nextNumber -= 2;
            System.out.println(nextNumber);
            nextNumber--;

            System.out.println(nextNumber);
        }
    }
}
