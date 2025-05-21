package övning2;

public class Accoount {
    public static void main(String[] args) {
        BankAcoount mittKonto = new BankAcoount(1000);
        mittKonto.printSaldo();
        mittKonto.setIn(500);

        mittKonto.printSaldo();
        mittKonto.taUt(2000);
        mittKonto.printSaldo();
        mittKonto.setSaldo(600);
        mittKonto.printSaldo();

    }
}
