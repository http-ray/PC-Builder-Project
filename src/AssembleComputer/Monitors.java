package AssembleComputer;

public class Monitors {
    private String name;
    private Resolution resolution;
    private int screenSize;

    public Monitors(String name, Resolution resolution, int screenSize){
        this.name = name;
        this.resolution = resolution;
        this.screenSize = screenSize;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "\nMonitor Specs "
                + "\n* Resolution: " + resolution
                + "\n* Screen Size: " + screenSize + " inches"
                + "\n* Name: " + name;
    }
}
