package jason.company;

public class Lights {
    private boolean makeLight;
    private Bulb newBulb;

    public Lights(boolean makeLight, Bulb newBulb) {
        this.makeLight = makeLight;
        this.newBulb = newBulb;
    }

    public boolean isNewBulb() {
        return newBulb.isNew();
    }

    public void toggleLight() {
        makeLight = !makeLight;
        String onOrOff = makeLight ? "on" : "off";
        System.out.println("the light is " + onOrOff);
    }
}
