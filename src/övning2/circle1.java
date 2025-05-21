package övning2;

public class circle1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(6);
        boolean isBigger = circle1.isBiggerThan(circle2);
        System.out.println(isBigger);


        double area = circle1.getCalaulateArea();
        double circumference = circle1.getCalculateCircumference();


        System.out.println(area);
        System.out.println(circumference);


    }
}

