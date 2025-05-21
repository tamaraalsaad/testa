package oving3;

public class exersiseChar {
    public boolean isLetter(char sing) {
        boolean isLetter = false;
        if ((sing >= 'a' && sing <= 'z') || (sing >= 'A' &&sing<='Z')){
            isLetter=true;
        }
        return isLetter;
    }
}
