package övning2;

public class Dog {
    private String dogName;
    private String dogRasen;
    private int dogAge;

    public Dog(String dogName,String dogRasen) {
        this. dogName = dogName;
        this. dogRasen =dogRasen;
        this.dogAge =0;
    }
    public void setDogAge(int dogAge){
        this.dogAge=dogAge;
        System.out.println(dogAge);
    }
    public void getBark (){
        System.out.println("Voff!");

    }
    public int getHumenAge(){
        return dogAge*7;
    }

}
