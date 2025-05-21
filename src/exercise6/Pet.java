package exercise6;

public class Pet {
    private String name;

    public Pet(String petName) {
        name = petName;
    }
        public void printName() {
            System.out.println("The name of the pet is : " + name);

        }
        public String getName(){
        return name;
        }
    }
