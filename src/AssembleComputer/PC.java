package AssembleComputer;

public class PC {

    // case
    // motherboard
    // monitor

    private Case theCase;
    private Motherboard motherboard;
    private Monitors monitor;


    public PC(Case theCase, Motherboard mb, Monitors monitors){
        this.theCase = theCase;
        this.monitor = monitors;
        this.motherboard = mb;
    }

    public Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    public Monitors getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitors monitor) {
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public String toString(){
        return "\nPC Specifications" +
                "\n-----------------" +
                "\n" + theCase.toString() +
                "\n" + motherboard.toString() +
                "\n" + monitor.toString();
    }
}
