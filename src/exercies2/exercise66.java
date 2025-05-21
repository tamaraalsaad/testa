package exercies2;

import javax.swing.*;

public class exercise66 {
    public static void main(String[] args) {
        //6.I en array finns ett personnummer. Skapa ett program som kontrollerar att
        // födelsedatum och
        //de fyra sista siffrorna åtskiljs av ett bindestreck. Skriv ut ett
        // felmeddelande om så ej är fallet.
        String[] pernumLista = {"19780109-2789", "19780102789"};
        for (String pernum : pernumLista) {
            if (pernum.length() == 13 && pernum.charAt(8) == '-') {
            System.out.println(pernum + "är korekt formaterat");
        }else {

            System.out.println(pernumLista + "fel");
        }

    }

}
}
