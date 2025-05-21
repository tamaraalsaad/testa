package exercies2;

public class calculator {
    private int number1,number2;//attribute
    //private int number2;// attribute
    // konstrektorn som spara två tal i attributen
    public calculator(int num1, int num2) {
        number1 = num1;
        number2 = num2;
    }
    //här är en metod
    public void printAddition() {
        int sum = number1 + number2;
        System.out.println(sum);
    }
    public void multipliction() {
        System.out.println(number1 * number2);
    }

    public void dived() {
        System.out.println(number1 / number2);
    }
    // public void printSum(){
    // System . out . println (first+ second);


}
