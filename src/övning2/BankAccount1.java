package övning2;

public class BankAccount1 {
    private int saldo;

    public BankAccount1(int saldo) {
        this.saldo = 0;
    }

    public void mySaldo() {

        System.out.println("my saldo are:" + saldo);
    }

    public void nySaldo(int nyttSaldo) {


        if (saldo < nyttSaldo) {
            System.out.println("fel meddalnad");
        } else {

            saldo -= nyttSaldo;


        }

    }
}



