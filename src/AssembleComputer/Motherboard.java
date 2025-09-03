package AssembleComputer;

/**
 * Chipset
 * AMD B650
 * Manufacturer
 * ASUS
 */
public class Motherboard {
    private String chipset;
    private String manufacturer;

    public Motherboard(String chip, String manu){
        this.chipset = chip;
        this.manufacturer = manu;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString(){
        return "\nMotherboard Specs "
                + "\n* Chipset: " + chipset
                + "\n* Manufacturer: " + manufacturer;
    }
}
