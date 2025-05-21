package ArrayUppgift;

public class exercise68 {
    public static void main(String[] args) {
        //68.En array med 50 inlästa tal finns. Fördubbla värdet på talen på varje plats i arrayn.
        int[] solo = {124};
        int[] numbers = {5, 23, 123, 4, 2, 6, 8, 138, 2341,32,
                5, 23, 123, 4, 2, 6, 8, 138, 2341,411,
                5, 23, 123, 4, 2, 6, 8, 138, 2341,2347,
                5, 23, 123, 4, 2, 6, 8, 138, 2341,2,
                5, 23, 123, 4, 2, 6, 8, 138, 2341,13};
        // hitta aiia tal (ett efter ett) och fördubbla värdet på denpositionen
        for (int i =0;i<numbers.length;i++){
            numbers[i]*=2;
        }
        for (int i =0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }




    }
}
