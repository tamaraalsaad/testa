public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;

    }

    public double calculatePerimete() {
        return 2* (width + height);
    }

        public static void main(String[] args) {
            Rectangle myRectangle=new Rectangle(5.0,3.0);
            System.out.println("Area"+myRectangle.calculateArea());

            System.out.println("Omkrets"+myRectangle.calculatePerimete());
        }
    }



