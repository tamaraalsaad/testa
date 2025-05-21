package övning2;

import java.util.Scanner;

public class Dogmain {
    public static void main(String[] args) {

        Dog dog=new Dog("Fido","collie");

        dog.getBark();
        dog.setDogAge(7);
        System.out.println(dog.getHumenAge());

    }
}
