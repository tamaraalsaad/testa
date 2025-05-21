package oving3;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestPasswordCheck {
    @Test
    public void testCorrectPassword() {
        //Arrange
        passwordCheck pass = new passwordCheck();

        boolean expected = true;

        //Act
        boolean actual = pass.check("passw$ord1");

        //Assert
        assertEquals(expected, actual);


    }

    @Test
    public void testLeasTHen8CharactersAndNoDigits() {
        //Arrange
        passwordCheck pass = new passwordCheck();

        boolean expected = false;

        //Act
        boolean actual = pass.check("pass1");

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testNoDigit() {
        //Arrange
        passwordCheck pass = new passwordCheck();

        boolean expected = false;

        //Act
        boolean actual = pass.check("passw$ord");

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testNoSpecilCharacters() {
        //Arrange
        passwordCheck pass = new passwordCheck();

        boolean expected = false;

        //Act
        boolean actual = pass.check("passw4ord");

        //Assert
        assertEquals(expected, actual);

    }
}

