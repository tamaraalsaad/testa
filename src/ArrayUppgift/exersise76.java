package ArrayUppgift;

public class exersise76 {
    public static void main(String[] args) {
        //76.En array med 10 inlästa tal finns. Lägg över dessa tal i en annan array så att talen
        //kommer i omvänd ordning.


        int[] numbers = {5, 23, 123, 4, 2, 6, 8, 138, 2341, 231};
        int[] reverse = new int[10];

      for (int i =0;i< reverse.length;i++){
          reverse[i]=numbers[9-i];
          System.out.println(numbers[9-i]);

      }
      for (int i =0;i<reverse.length;i++){
          System.out.println(reverse[i]);
      }

    }
}
