package Exercise28;

public class exercise23 {
    public static void main(String[] args) {
        //23.Skapa ett program som testar om ett inläst tal är jämnt delbart med 3 men inte med 30. I
        //så fall ska talet divideras med 3.
        int i = 9;
        if (i % 3 == 0 && i % 30 !=0){
            System.out.println(i);
        }
    }
}
