package vecke6;

public class exercise3 {
    public static void main(String[] args) {
        // Spara 10 slumptal ifrån 1-100 i en array


        int min = 1;
        int max = 100;
        int range = max - min + 1;

        int arrayLength = (int) (Math.random() * range) + min;
        int[] randomArray = new int[arrayLength];
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            randomArray[i] = rand;
        }
        //Skriv ut innehållet i arrayn till consolen
       // for (int i = 0; i < 10; i++) {
           // System.out.println(randomArray[i]);
        //}
        RandomGenerator generator = new RandomGenerator();
        int[] newArray = generator.randomArray();
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);

            //
            //Storleken på arrayn är också ett slumptal ifrån 1-100

        }
    }
}

