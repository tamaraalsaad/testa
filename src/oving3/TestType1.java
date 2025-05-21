package oving3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestType1 {
    @Test
    public void TestName() {
        //Arrange
        Type1 type1=new Type1("name" ,"pass&word" );

        String expected = "name";
        //Act
        String actual = type1.getUserName();
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestTyapOfUser() {
        //Arrange
        Type1 type1=new Type1("name" ,"pass&word" );

        String expected = "normal";
        //Act
        String actual = type1.setTyapOFUser("normal");
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestTypePassword() {
        //Arrange
        Type1 type1=new Type1("normal" ,"Nadin&");

        String expected = "Nadin&";
        //Act
        String actual = type1.getPassword();
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testGoldMember() {
        //Arrange
        Type1 type1=new Type1("normal" ,"nadin&");

        String expected = "20";
        //Act
        String actual = type1.getGoldMember();
        //Assert
        Assertions.assertEquals(expected, actual);
    }
}


