package AssembleComputer;

/**
 * Maximum Resolution
 * 1920 x 1080
 */
public class Resolution {
    private int hor;
    private int vert;

    public Resolution(int horizontal, int vertical){
        this.hor = horizontal;
        this.vert = vertical;
    }

    public int getHor() {
        return hor;
    }

    public void setHor(int hor) {
        this.hor = hor;
    }

    public int getVert() {
        return vert;
    }

    public void setVert(int vert) {
        this.vert = vert;
    }

    @Override
    public String toString(){
        return hor + " X " + vert;
    }
}
