package exercies2;

public class Exsercise12 {
    public static void main(String[] args) {
        //. Skapa ett program där en cirkels radie läses in. Cirkelns diameter, omkrets och area
        //skall beräknas och skrivas ut. (pi = 3.14).
        float pi = 3.14f;
        float radie = 5;
        float diameter = 2 * radie;
        float omkret = 2 * pi * radie;
        float area = pi * radie * radie;
        System.out.println( "diameter är =" + diameter );
        System.out.println("omkret är =" + omkret);
        System.out.println("area =" + area);


    }
}
