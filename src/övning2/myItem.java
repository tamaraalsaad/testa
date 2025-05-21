package övning2;

public class myItem {
    public static void main(String[] args) {
        Item item=new Item("väska",3000);
        System.out.print("pris after rabatt:");
        item.applyDiscount(20);


    }
}
