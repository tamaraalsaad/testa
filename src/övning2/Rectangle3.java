package övning2;

public class Rectangle3 {
    private int height;
    private int width;

    public Rectangle3(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int RectangleArea() {
        return height * width;
    }

    public int RectanglePeri() {
        return 2 * (height + width);
    }

    public boolean isSguare() {
        if (width == height) {
            return true;

        } else {
            return false;
        }

    }
}
