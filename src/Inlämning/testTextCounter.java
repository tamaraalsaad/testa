package Inlämning;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class testTextCounter {

@Test
   public void testSingleLine(){

    textCounter counter= new textCounter();
    counter.addLine("Hello");
    int actual=counter.getLineCount();
    int expected=1;
    Assertions.assertEquals(expected, actual);

}
@Test
    public void testMultipleLines(){
    textCounter counter= new textCounter();
    counter.addLine("Hello");
    counter.addLine("My name is");
    int actual=counter.getLineCount();
    int expected=2;
    Assertions.assertEquals(expected, actual);

}
@Test
    public void testCharCount(){
    textCounter counter= new textCounter();
    counter.addLine("Hello");
    int actual=counter.getCharCount();
    int expected=5;
    Assertions.assertEquals(expected, actual);

}
@Test
    public void testStopNotCounted(){
    textCounter counter= new textCounter();
    counter.addLine("Hello");
    counter.addLine("stop");
    counter.addLine("this line");
    int actual=counter.getLineCount();
    int expected=1;
    Assertions.assertEquals(expected, actual);


}
}
