package src;

public enum Liquide {
    EAU(10),
    VIN(15),
    HUILE(9);

    public final int temperature;
    Liquide(int temperature) {
        this.temperature = temperature;
    }


}
