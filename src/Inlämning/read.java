package Inlämning;
public class read {
    private int radCount;
    private int charCount;
    private String radStop;

    public read() {
        radCount = 0;
        charCount = 0;
        radStop="stop";
    }
    public void RadCount(String rad) {
            charCount += rad.length();
            radCount++;
    }
    public int getRadCount() {
        return radCount;
    }
    public int getCharCount() {
        return charCount;
    }
    public String getRadStop() {
        return radStop;
    }

    public void setRadStop(String radStop) {
        this.radStop = radStop;
    }
}




















