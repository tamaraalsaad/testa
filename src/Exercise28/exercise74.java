package Exercise28;

import java.util.Scanner;

public class exercise74 {
    public static void main(String[] args) {
        //74.En array med 50 inlästa tal finns. Leta upp det största och det minsta talet i arrayn och
       // skriv ut dem.

                Scanner scanner = new Scanner(System.in);
                int[] numbers = new int[50];
                int positiveSum = 0;
                int negativeSum = 0;

                System.out.println("Ange 50 heltal (positiva eller negativa):");

                for (int i = 0; i < 50; i++) {
                    System.out.print("Tal " + (i + 1) + ": ");
                    numbers[i] = scanner.nextInt();

                    if (numbers[i] %2==0) {
                        positiveSum += numbers[i];
                    } else {
                        System.out.println(negativeSum);;
                    }
                }

                System.out.println("\nSumman av alla positiva tal: " + positiveSum);
                System.out.println("Summan av alla negativa tal: " + negativeSum);
            }
        }


