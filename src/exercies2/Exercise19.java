package exercies2;

public class Exercise19 {
    public static void main(String[] args) {
        //17.Skapa ett program som läser in två tal och dividerar det första talet med det andra talet. Om
        //det andra talet (nämnaren) är 0 ska ett felmeddelande ges, annars ska kvoten skrivas ut.
        int förstTal = 7;
        int andraTal = 1;
        int dividerar = förstTal / andraTal;
        if (andraTal >= 0) {
            System.out.println("felmeddelands");
        } else {
            System.out.println(dividerar);
        }

    }
}
