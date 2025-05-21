package övning2;

public class Circle {
    private double radien;


    public Circle(double radien) {
        this.radien = radien;
    }
    public double getCalaulateArea() {
        double area;
        area = 3.14 * radien * radien;
        System.out.println("The area =" + area);
        return area;
    }
   public double getCalculateCircumference() {
        double circumference;
        circumference = 3.14 * (radien * 2);
        System.out.println("The Calculate Circumference=" + circumference);
        return circumference;
    }
    public boolean isBiggerThan(Circle circle) {

        if(getCalaulateArea() >circle.getCalaulateArea()){

                return true;
            } else {
                return false;
            }
        }
        }






