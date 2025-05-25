package Inlamnig1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testRead {
    @Test
    public void testRedCounter(){
        read read=new read();
        int actual=read.getCharCount();
        int expected=0;
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testChrCounter(){
        read read=new read();
        int actual=read.getCharCount();
        int expected=0;
        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetRadStop(){
        read read=new read();
        read.setRadStop("stop");
        String  actual=read.getRadStop();
        String expected="stop";
        //Assert
        Assertions.assertEquals(expected, actual);
    }
}
