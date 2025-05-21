package exercies2;

public class kunder {
    private String treatment;
    private int cost;
    public kunder(String taypeOfTreatmant){
       treatment=taypeOfTreatmant;
    }
    public kunder(int myCost){
        cost=myCost;
    }
    public String getTreatment(){

        return treatment;
    }
    public int getCost(){

        return cost;
    }



}

