package oving3;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


public class TestExercise {
    @Test
    public void firstTestCase(){
        String text="some text";
        int actual=text.length();
        int expected=9;
        assertEquals(expected, actual);

    }

}
