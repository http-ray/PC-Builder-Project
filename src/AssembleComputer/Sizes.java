package AssembleComputer;
// size data only for the Case
public class Sizes {
    private double width;
    private double depth;
    private double height;

    /**
     *      Width
     *      8.94 in. (227.00 mm)
     *      Depth
     *      17.56 in. (446.00 mm)
     *      Height
     *      18.27 in. (464.00 mm)
     */
    public Sizes(){
        this(9, 19, 18);
    }

    public Sizes(double w, double h, double d ){
        this.width = w;
        this.depth = d;
        this.height = h;
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString(){
        return "\n* Case size (inches): " + width + " X " + height + " X " + depth;
    }
}
