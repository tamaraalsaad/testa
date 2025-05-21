import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testWordCountar {
    @Test
    public void getInitialRows(){
        wordCountar countar= new wordCountar();
        int actual=countar.getRows ();
        int expected=0;
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getInitialChars(){
        wordCountar countar= new wordCountar();
        int actual=countar.getChars ();
        int expected=0;
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setRaws(){
        wordCountar countar= new wordCountar();
        countar.addText("Hej sen!");
        countar.addText("Vad heter du?");
        int actual=countar.getRows();
        int expected=2;
        //Assert
        Assertions.assertEquals(expected, actual);
    }

}
