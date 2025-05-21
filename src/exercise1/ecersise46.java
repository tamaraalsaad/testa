package exercise1;

public class ecersise46 {
    public static void main(String[] args) {
        //46.En man erbjuds ett ovanligt riskfyllt arbete. Lönesättningen är också ovanlig. För första
        //dagen erbjuds han 1 öra, för andra dagen 2 öra, för tredje dagen 4 öra osv. Lönen
        //fördubblas alltså varje dag. Skapa ett program som beräknar hur många dagar mannen måste
        //arbeta för att tjäna en miljon kronor.
        int miljon = 1000000000;
        int totalSalary = 0;
        int todaysSalary = 1;
        int numberOfDays = 0;
        while (todaysSalary < miljon) {
            numberOfDays++;
            totalSalary += todaysSalary;
            todaysSalary *= 2;
        }
        System.out.println(numberOfDays);


    }
}
