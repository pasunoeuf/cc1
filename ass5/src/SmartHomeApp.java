public class SmartHomeApp {
    public static void main(String[] args) {
        // Create individual smart devices
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        SecuritySystem securitySystem = new SecuritySystem();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        // Create the facade to manage the system
        SmartHomeFacade smartHome = new SmartHomeFacade(light, thermostat, securitySystem, entertainmentSystem);

        // Demonstrate various modes
        System.out.println("\n--- Arrive Home ---");
        smartHome.arriveHome();

        System.out.println("\n--- Leave Home ---");
        smartHome.leaveHome();

        System.out.println("\n--- Night Mode ---");
        smartHome.nightMode();

        System.out.println("\n--- Movie Mode ---");
        smartHome.movieMode();
    }
}
