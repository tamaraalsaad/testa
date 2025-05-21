package oving3;

public class userName {
    private String name;
    private String passWord;
    public String typeOfUser;
    private String passwordTecken;
    private String passwordBokstav;
    private String goldMember;
    private int logIN;
    private int solidus;
    private String kopItem;


    public userName(String name, String passWord) {

        this.name = "name";
        this.passWord = "passWord";
        this.typeOfUser = "normal";
        this.passwordTecken = "password&";
        this.passwordBokstav = "Password&";
        this.goldMember = "20";
        this.logIN=5;
        this.solidus = 5;
        this.kopItem="5";

    }

    public String getName() {

        return name;
    }

    public void setUserName(String newUsername) {

        if (newUsername.length() > 3) {
            name = newUsername;
        }

    }

    public String getPassWord() {

        return passWord;
    }

    public void setPassWord(String newPassWord) {
        passWord = newPassWord;
        if (passWord.length() >= 7 && passWord.length() <= 20) {

        }
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String newTypeOfUser) {


        if (newTypeOfUser.equals("normal") || newTypeOfUser.equals("admin") || newTypeOfUser.equals("super")) {
        } else if (goldMember.equals("20")) {
        }
        typeOfUser = newTypeOfUser;
    }

    public String getPasswordTecken() {
        return passwordTecken;
    }

    public void setPasswordTecken(String newPasswordTecken) {
        for (int i = 7; i < newPasswordTecken.length(); i++) {
            char c = newPasswordTecken.charAt(i);
            if (Character.isLetterOrDigit(c)) {

                passwordTecken = newPasswordTecken;
            }
        }

    }

    public String getPasswordBokstav() {
        return passwordBokstav;
    }

    public void setPasswordBokstav(String newPasswordBokstav) {
        char ch = 'H';
        if ((Character.isUpperCase(ch)) && (Character.isLowerCase(ch))) {

            passwordBokstav = newPasswordBokstav;

        }
    }


    public int getLogIN() {
        return logIN;
    }

    public void setLogIN(int logIN) {
        for (int i=5;i==logIN;i++){
            logIN=+solidus;
        }
        this.logIN = logIN;
    }
    public int getSolidus() {
        return solidus;
    }

    public void setSolidus(int solidus) {
        if (solidus==20){
            solidus +=  20;
        }
        this.solidus = solidus;
    }

    public String getKopItem() {
        return kopItem;
    }

    public void setKopItem(String kopItem) {

        if (solidus>=20){
            kopItem.equals("hoodie");
        }else if (solidus>=15){
            kopItem.equals("t-shirt");
        }else if (solidus>=5){
            kopItem.equals("stickers");
        }
        this.kopItem = kopItem;
    }
}

















