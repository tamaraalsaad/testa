package Exercise28;

public class exercise22 {
    public static void main(String[] args) {
        //22.Skapa ett program som testar om ett tal är 0-9 men inte 5. Skriv ut lämplig text.
        int i=5;

        if ((i >= 0) && (i <= 9) && (i != 5)) {
            System.out.println(i);


        } else {
            System.out.println("5 is not incloudedt");

        }
    }
}

