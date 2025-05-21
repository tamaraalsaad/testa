package övning2;
public class BankAcoount {
    private int saldo;

    public BankAcoount(int startSaldot) {
        saldo = startSaldot;
    }

    public void printSaldo() {
        System.out.println("Saldo:" + saldo + "kr");

    }

    public void setSaldo(int nyttSaldo) {

        saldo += nyttSaldo;

        System.out.println(nyttSaldo);
    }

    public void setIn(int summa) {
        System.out.println(summa + "kr har satt in");
    }

    public void taUt(int summa) {
        if (summa > saldo) {
            System.out.println("Inte tillräcklig med penger!");
        } else if ( saldo <= summa){



            System.out.println(summa + "kr har tagits ut");
        }
         else if (saldo <= 0){

            System.out.println("Man kan int ta ut penger" + saldo);
        }
        {


        }


    }


}


