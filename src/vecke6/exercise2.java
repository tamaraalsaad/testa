package vecke6;

public class exercise2 {
    public static void main(String[] args) {
      //Math.random();
        //Ger ett slumpmässigt tal som är >= 0.0 och <1.0
        //
        //// define the range
        int min = 1;
        int max = 10;
        int range = max - min + 1;
        //
        //// generate random numbers from min to max
        //int rand = (int) (Math.random() * range) + min;
        for (int i =0;i<10;i++){
            int rand = (int) (Math.random() * range) + min;
            System.out.println(rand);
        }

    }
}
