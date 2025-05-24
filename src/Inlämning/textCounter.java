package Inlämning;

public class textCounter {
    private int lineCount;
    private int charCount;
    public textCounter(){
        lineCount=0;
        charCount=0;
    }
    public void addLine(String line){
        if (! line.equals("Stop")){
            lineCount++;
            charCount+=line.length();
        }
    }
    public int getLineCount(){
        return  lineCount;
    }

    public int getCharCount() {
        return charCount;
    }
}



