package oving3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserName {
    @Test
    public void testUserName() {
        //Arrange
        userName user = new userName("name", "paasWord");

        //Act
        // andra använadarnamanet till Rudolph
        String actual = user.getName();
        String expected = "name";

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetUserName() {
        //Arrange
        userName user = new userName("name", "paasWord");
        //Act
        // andra använadarnamanet till Rudolph
        user.setUserName("Rudolph");
        String actual = user.getName();
        String expected = "Rudolph";

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPassWord() {
        //Arrange
        userName user = new userName("name", "paasWord");

        //Act

        String actual = user.getPassWord();
        String expected = "passWord";

        //Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSetPassWord() {
        //Arrange
        userName user = new userName("name", "paasWord");

        //Act
        user.setPassWord("josef1");
        String actual = user.getPassWord();
        String expected = "josef1";

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTypeOfUser() {
        //Arrange
        userName user = new userName("name", "paasWord");
        //Act

        String actual = user.getTypeOfUser();
        String expected = "normal";
        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTypeOfUser() {
        //Arrange
        userName user = new userName("name", "paasWord");
        //Act
        user.setTypeOfUser("admin");

        String actual = user.getTypeOfUser();
        String expected = "admin";
        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPasswordTecken() {
        //Arrange
        userName user = new userName("name", "paasWord");
        //Act
        user.setPasswordTecken("password&");


        String actual = user.getPasswordTecken();
        String expected = "password&";
        //Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPasswordBokstav() {
        //Arrange
        userName user = new userName("name", "paasWord");
        //Act
        user.setPasswordBokstav("Password&");

        String actual = user.getPasswordBokstav();
        String expected = "Password&";
        //Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testGuldMember() {
        //Arrange
        userName user = new userName("name", "paasWord");
        //Act
        user.setTypeOfUser("20");

        String actual = user.getTypeOfUser();
        String expected = "20";
        //Assert
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testLogIn() {
        //Arrange
        userName user = new userName("name", "paasWord");
        //Act
        user.setLogIN(5);
        int actual = user.getLogIN();
        int expected = 5;
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSolidus() {
        //Arrange
        userName user = new userName("name", "paasWord");
        //Act
        user.setSolidus(20);
        int actual = user.getSolidus();
        int expected = 40;
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testKopItem() {
        //Arrange
        userName user = new userName("name", "paasWord");
        //Act
        user.setKopItem("t-shirt");
        String actual = user.getKopItem();
        String expected = "t-shirt";
        //Assert
        Assertions.assertEquals(expected, actual);
    }




}




