package AssembleComputer;

public class Case {
    private String manufactureName;
    private Sizes size; // width, depth, height
    private String color;

    public Case(String manu, Sizes s, String color){
       this.manufactureName = manu;
       this.size = s;
       this.color = color;
    }

    // Getters + Setters
    public String getManufactureName(){
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public Sizes getSize(){
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "\nCase "
                + "\n* Manufacturer: " + manufactureName
                + size
                + "\n* Color: " + color;
    }
}
