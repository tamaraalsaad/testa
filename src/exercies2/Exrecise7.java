package exercies2;

public class Exrecise7 {
    public static void main(String[] args) {
        //. Skapa ett program som läser in tre tal och beräknar och skriver ut summan samt medelvärdet
        //av de tre talen.
        int number1 = 5;
        int number2 = 7;
        int number3 = 9;
        int summan = number1 + number2 + number3;

        System.out.println("summan:" +summan);
        int theAverage = summan / 3;
        System.out.println("The average:"  +theAverage);

    }
}
