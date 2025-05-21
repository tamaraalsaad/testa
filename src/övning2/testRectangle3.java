package övning2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class testRectangle3 {
    @Test
    public void testArea(){
        //Arrange
        Rectangle3 rectangle3=new Rectangle3(10,10);


        //Act
        int actual= rectangle3.RectangleArea();
        int expected=100;


        //Assert
        Assertions.assertEquals(expected, actual);
    }
}
