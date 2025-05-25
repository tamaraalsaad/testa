package InlamningDel2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class testTextFormation {
   @Test
   public void testWordCont() {
       TextFormation formation = new TextFormation();
       formation.processLine("Hello");

       int actual=formation.getWordCount();
       int expected=1;

       Assertions.assertEquals(expected, actual);
   }
   @Test
    public void testLineCount(){
       TextFormation formation = new TextFormation();
       formation.processLine("Hello");
       formation.processLine("Word");
       int actual= formation.getLineCount();
       int expected=2;
       Assertions.assertEquals(expected, actual);
   }
   @Test
   public void testEmptyLine(){
       TextFormation formation = new TextFormation();
       formation.processLine("");
       int actual= formation.getLineCount();
       int expected=1;
       Assertions.assertEquals(expected, actual);
   }

   }
