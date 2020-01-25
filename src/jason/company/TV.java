package jason.company;

public class TV {
    private String make;
    private String model;
    private TvResolution resolution;

    public TV(String make, String model, TvResolution resolution) {
        this.make = make;
        this.model = model;
        this.resolution = resolution;
    }

    public void turnOn() {
        System.out.println("The tv is on");
    }

    public void turnOff() {
        System.out.println("The tv is off");
    }


}
