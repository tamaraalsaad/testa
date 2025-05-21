package övning2;

public class BankAccount2 {
    private int saldo;
    public BankAccount2(){
        this.saldo=0;

    }
    public void printSaldo(){
        System.out.println("the saldo is="+saldo);
    }
    public void printNyttSaldo(int nyttSaldo){

        saldo+=nyttSaldo;
    }
    public void draaut(int mony){
        if (saldo< mony){
            System.out.println("fel medlanda");
        }
        else {
            saldo-=mony;
            System.out.println(saldo);
        }
    }



}
