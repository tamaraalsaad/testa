package oving3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestType {
    @Test
    public void TestType() {
            //Arrange
            Type type=new Type();

            boolean expected = true;
            //Act
            boolean actual = type.TypeOfUser("normal");
            //Assert
            Assertions.assertEquals(expected, actual);
        }
    @Test
    public void TestHasTecken() {
        //Arrange
        Type type=new Type();

        boolean expected = true;
        //Act
        boolean actual = type.TypeOfUser("nor1mal");
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestHasStorAndLItenLiter() {
        //Arrange
        Type type=new Type();

        boolean expected = true;
        //Act
        boolean actual = type.TypeOfUser("Nor1mal");
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void goldMember() {
        //Arrange
        Type inlogg=new Type();

        int expected = 20;
        //Act
        int actual = inlogg.goldMedlen();
        //Assert
        Assertions.assertEquals(expected, actual);
    }





}


