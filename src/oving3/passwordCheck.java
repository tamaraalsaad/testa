package oving3;

public class passwordCheck {

    public boolean check(String password) {

        boolean enoughCharacters = false;
        boolean hasDigits = false;
        boolean hasSpecialCharacters=false;

        if (password.length() >= 8) {
            enoughCharacters = true;
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigits = true;

            }
            if ( !Character.isLetterOrDigit(c)){
                hasSpecialCharacters=true;
            }

        }
        return enoughCharacters && hasDigits&&hasSpecialCharacters;



    }
}

