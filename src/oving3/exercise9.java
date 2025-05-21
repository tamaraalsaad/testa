package oving3;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class exercise9 {
    @Test
    public void add() {

        //Arrange
        Calculator calc=new Calculator(2,3);
        int expected = 5;

        //Act
        int actual = calc.add();

        //Assert
        assertEquals(expected, actual);
        }
    }