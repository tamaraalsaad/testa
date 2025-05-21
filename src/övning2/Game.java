package övning2;

public class Game {
    //Skapa ett rättstavningsprogram där man tävlar i att skriva ut rätt ord.
    // Användaren får ett ord skrivet på skärmen och skall sedan repetera detta
    // ordet på kommandoraden. Skriver användaren rätt får den 1 poäng annars inget poäng.
    // Repetera detta för några ord (3 ord räcker som exempel) och skriv sen ut totalt antal poäng.
    // När du skapar ditt program försök att lägga logiken samt sparande av data i en class och
    // låt classen med mainmetoden enbart läsa in text och skriva ut resultatet.
    private String words;
    private int score;



    public Game(String myWords) {
        words = myWords;
    }

    public Game(int myScore) {
        score = myScore;
    }

    public Game() {

    }

    public void setWords() {
        System.out.println("you are right");

    }

    public int inScore() {
        System.out.println("your score is");
        return 1;
    }

    public void rattWords() {
        if (words==words) {
            System.out.println("right words");
        } else {
            System.out.println("wrong word");
        }

    }
    public String getWords(){
        return words;
    }

    public void getScore() {
        for (score = 1; score <= 3; score++) {
            System.out.println(score);


        }

    }
    public int setScore(){
        return score;
    }

}



