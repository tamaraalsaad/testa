package oving3;

public class eMail {
    public static void main(String[] args) {
        String[] eMail = new String[4];
        eMail[0] = "email1@example.com";
        eMail[1] = "email2@example.com";
        eMail[2] = "email3@example.com";
        eMail[3] = "email4@example.com";

        if (eMail.length >= 4) {
            eMail[0] = "email4@example.com";
        }
        for (int i = 0; i < eMail.length; i++) {
            String s = "@";
        }
    }
}



