package exercies2;

public class Exercise18 {
    public static void main(String[] args) {
        //16.En firma erbjuder sina kunder 10 procents rabatt om man vid ett inköpstillfälle handlar för
        //minst 1000 kr.
        // Antag för enkelhetens skull att man bara handlar varor av ett visst slag. Skapa ett
        //program som beräknar vad en kund ska betala.
        // Indata till algoritmen ska vara antalet
        //köpta enheter och priset per enhet.

        double antalEnheter = 5;
        double prisetEnher = 500;
        double totalPris = antalEnheter * prisetEnher;
        if (totalPris >= 1000) {

            System.out.println(totalPris *= 0.90);


        } else {
            System.out.println(totalPris);
        }
    }


}

