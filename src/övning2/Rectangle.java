package övning2;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void printarae() {
        int arae;
        arae = height * width;
        System.out.println("arae=" + arae);

    }

    public void printPeri() {
        int peri;
        peri = 2 * (height + width);
        System.out.println("peri =" + peri);
    }

    public boolean printIsSguare() {
        if (width == height) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }

        return false;
    }
}


