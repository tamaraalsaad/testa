package övning2;

public class WetherReport {
    private double temperatur;
    private String tyapOffWather;
    public WetherReport(double temperatur,String tyapOffWather){
        this.temperatur=temperatur;
        this.tyapOffWather=tyapOffWather;

    }

    public String getDescription () {

        return"Temperatur: " + temperatur + "°C, Väder: " + tyapOffWather;


    }


}
