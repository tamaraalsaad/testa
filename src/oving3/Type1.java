package oving3;

public class Type1 {
    private String userName;
    private String password;
    private String tyapOFUser;
    private String goldMember;

    public Type1(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.tyapOFUser = "normal";
        this.goldMember = "20";
    }

    public String getUserName() {

        return userName;
    }

    public String getTyapOFUser() {

        return tyapOFUser;
    }

    public String setTyapOFUser(String newTapyOfUser) {
        tyapOFUser = newTapyOfUser;

        if (newTapyOfUser.equals("normal") || newTapyOfUser.equals("admin") || newTapyOfUser.equals("super")) {
        }

        return newTapyOfUser;
    }

    public String getPassword() {
        char c = 0;
        char sign = 0;

        if (password.equals(Character.isLetterOrDigit(c))) {
        } else if ('a' <= sign && sign < 'z') {
        } else if (sign >= 'A' && sign <= 'z') {
        }
        return password;
    }

    public String getGoldMember() {

        if (goldMember.equals("20")) {

        }
        return "20";

    }


}
