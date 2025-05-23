package vecke6;

public class RandomGenerator {
    //Skapa en metod som returnerar slumptal från 1-100 i en array
    public int[] randomArray(){
        int[] randomArray = new int[100];

        int min = 1;
        int max = 100;
        int range = max - min + 1;
        for (int i = 0; i < randomArray.length; i++) {
            int rand = (int) (Math.random() * range) + min;
            randomArray[i] = rand;

        }
        return randomArray;




    }
    }


