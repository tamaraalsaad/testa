package övning2;

public class Item {
    private String name;
    private  double pris;
    public Item(String name,double pris){
        this.name=name;
        this.pris=pris;


    }
    public void applyDiscount(double precent){
        if (precent>=0 &&precent<=100){
            pris=pris-(pris*precent/100);
            System.out.println(pris);
        }
    }
    public double getPris(){
        return pris;
    }
}
