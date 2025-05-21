package oving3;

public class Type {
    private int inLogg;

    public boolean TypeOfUser(String password) {


        if (password.equals("normal") || password.equals("admin") || password.equals("super")) {
            return true;

        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                return true;
            }

        if ( Character.isLetterOrDigit(c)){
                return true;
            }

        }
        return false;
    }
    public int goldMedlen(){

        this.inLogg=inLogg;

        while (inLogg>=20){
            return goldMedlen();
        }
         return 20;
    }

}



