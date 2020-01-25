package jason.company;

public class LivingRoom {
    private Couch couch;
    private CoffeeTable coffeeTable;
    private TV tv;
    private Lights lights;

    public LivingRoom(Couch couch, CoffeeTable coffeeTable, TV tv, Lights lights) {
        this.couch = couch;
        this.coffeeTable = coffeeTable;
        this.tv = tv;
        this.lights = lights;
    }

    public Lights getLights() {
        System.out.println("lights in LivingRoom");
        return lights;
    }

    public TV getTv() {
        System.out.println("TV in LivingRoom");
        return tv;
    }

    public void turnOnLights() {
        if (lights.isNewBulb()) {
            flickSwitch();
        }
    }

    private void flickSwitch() {
        lights.toggleLight();
    }

}
