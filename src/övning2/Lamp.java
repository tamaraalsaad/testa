package övning2;

public class Lamp {
    private boolean isON;

    public Lamp(boolean isON) {
        this.isON = isON;

    }

    public void turnOn() {
        isON = true;
        System.out.println("Lampa är på");
    }

    public void turnOff() {
        isON = false;
        System.out.println("Lampa är av");
    }

    public void status() {
        if (isON) {
            System.out.println("is true");
        } else {
            System.out.println("is false");

        }
    }
}