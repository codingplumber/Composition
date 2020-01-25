package jason.company;

public class PC {

    // COMPOSITION
    // our PC has a case, has a monitor, has a motherboard, but they are not the PC
    // with inheritance you can only inherit from one class at a time
    // but with composition we can combine many classes

    // creating objects within objects
    // the master object is looking after the others

    // as a general rule look at composition before inheritance

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
