package övning2;

import java.util.Scanner;

public class Rectangle2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Rectangle3 rect=new Rectangle3(scan.nextInt(), scan.nextInt());
        System.out.print("The area is=");
        System.out.println(rect.RectangleArea());
        System.out.print("The peri is=");
        System.out.println(rect.RectanglePeri());
        System.out.println(rect.isSguare());
    }
}
