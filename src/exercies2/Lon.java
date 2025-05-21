package exercies2;

public class Lon {
    public static void main(String[] args) {

        // En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
        //försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
        //Försäljningssumman ska läsas in.

        float paycheck = 8000;
        float sales = 1000;
        float finalpaycheck = (float) (sales * 0.09);
        float offical = paycheck + finalpaycheck;
        System.out.println(offical+"kr");


    }
}
