package ArrayUppgift;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


public class TestFirstTestCase {
    @Test
    public void firstTestCase(){
        String text="some text";
        int actual=text.length();
        int expected=9;
        assertEquals(expected, actual);

    }

}
