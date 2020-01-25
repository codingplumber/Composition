package jason.company;

public class Main {

    public static void main(String[] args) {

        // INHERITANCE
        // the Car extends the Vehicle
        // Car has an "is a" relationship with Vehicle
        // the Car "is a" extension of the Vehicle - Car is a Vehicle
        // this is inheritance

        // COMPOSITION
        // "has a" relationship
        // Computer "has a" motherboard, "has a" case, "has a" monitor
        // those things are not a computer but is has then
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

//        Resolution nativeResolution = new Resolution();
        // another way to create a class on the fly
        Monitor theMonitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

//        // how to access a method off the Monitor class
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        // access the method off the Motherboard class
//        thePC.getMotherboard().loadingProgram("Windows 10");
//
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();

        System.out.println("=====================");

        Couch theCouch = new Couch("green", 3);

        CoffeeTable theCoffeeTable = new CoffeeTable("natural", "wood", 120, 28);

        TV theTV = new TV("Samsung", "FX-123", new TvResolution(60, 40));

        Bulb theBulb = new Bulb(true);

        Lights theLights = new Lights(true, theBulb);

        LivingRoom livingRoom = new LivingRoom(theCouch, theCoffeeTable, theTV, theLights);

        livingRoom.getLights().toggleLight();
        livingRoom.getLights().toggleLight();

        livingRoom.getTv().turnOn();
        livingRoom.getTv().turnOff();

        livingRoom.turnOnLights();
    }
}
