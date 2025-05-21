package exercise8;

public class Spellchecker {
    public boolean isLetter(char sign) {
        boolean isLetter = false;
        if ((sign >= 'a' && sign < 'z') || (sign > 'A' && sign < 'z')) {
            isLetter = true;
        }


        return isLetter;

    }
}


