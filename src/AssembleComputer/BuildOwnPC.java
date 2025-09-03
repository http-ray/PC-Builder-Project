package AssembleComputer;

public class BuildOwnPC {
    public static void main(String[] args) {
        // Supporting Objects
        Resolution resolution = new Resolution(1920,1080); // Resolution: 1920x1080
        Sizes size = new Sizes(8.94, 18.27,17.56);

        // Create Case
        Case aCase = new Case("NZXT", size, "White" );

        // Create Motherboard
        Motherboard mobo = new Motherboard("AMD B650", "Asus");

        // Create Monitor
        Monitors monitor = new Monitors("Samsung T35F", resolution, 27);

        // Build PC
        PC obj = new PC(aCase, mobo, monitor);
        System.out.println(obj.toString());
    }
}
