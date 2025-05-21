package övning2;

public class student {
    private String name;
    private int grade;

    public student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public void promunte(int grade) {
        System.out.println(++grade);
        }
        public void printName () {
            System.out.println(name);
        }
        public void printGrade () {
        if (grade >= 1 && grade <= 3) {
            System.out.println("Primary school");
        } else if (grade >= 4 && grade <= 6) {
            System.out.println("Middle school");
        } else if (grade >= 7 && grade <= 9) {
            System.out.println("High school");


        }
        }


    }
